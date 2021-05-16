package sist.com.basic6.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class DispatcherAction {
	//@NonNull
    //@Resource(name="gs")
	private Service service;
    
   /* @Resource(name="bs")
	private Service service2;*/
	
	
	public void actionDisProcess() {
		service.fileCheck();
		System.out.println("actionDisProcess");
		service.fileValidate();
	}
	

}


