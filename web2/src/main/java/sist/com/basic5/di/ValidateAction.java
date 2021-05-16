package sist.com.basic5.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component(value="v1")
@Data
/*
@Getter
@ToString*/
/*@Setter*/
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ValidateAction {
	@NonNull
	@Setter
	private String filename;
	@NonNull
	@Setter
	@Value("100")
	private int fileSize;
	private int connect;
	private double fileCount;
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}




















