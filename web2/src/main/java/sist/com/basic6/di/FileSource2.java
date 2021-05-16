package sist.com.basic6.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Data*/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class FileSource2 {
	@NonNull	
	private boolean fileValidate;
	private String fileName;
	private int size;
	
	
	public FileSource2 getInfo() {
		return this;
	}
	public void fileIncrement() {
		System.out.println("fileIncrement");
	}
	

}



