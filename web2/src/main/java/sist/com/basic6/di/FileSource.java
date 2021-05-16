package sist.com.basic6.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class FileSource {
	@NonNull
	private boolean fileValidate;
	private String fileName;
	private int size;
	
	public FileSource getInfo() {
		return this;
	}
	
	public void fileIncrement() {
		System.out.println("fileIncrement");
	}
	
}
