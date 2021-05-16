package sist.com.basic6.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"sist.com.basic6.di"})
public class ConfigFile {
	
	@Bean(name="gdm")
	public DispatcherAction getDispatcherGameAction() {
	    return new DispatcherAction(getGameService());
	}
	
	@Bean(name="gbs")
	public DispatcherAction getDispatcherServiceAction() {
	    return new DispatcherAction(blogameService());
	}
	@Bean(name="gs")
	public Service getGameService() {
		GameService game=new GameService();
		return game;
	}
	
	@Bean(name="bs")
	public Service blogameService() {
		BlogService game=new BlogService();
		return game;
	}	
	@Bean(name="filebs")
	@Qualifier(value="f1")
	public FileSource2 getFileAction() {
		FileSource2 fileSource=new FileSource2(true,"d:img.jpg",150);
		
		return fileSource;
	}
	@Bean(name="filebs2")
	@Qualifier(value="f2")
	public FileSource2 getFileAction2() {		
		FileSource2 fileSource=new FileSource2();
		fileSource.setFileName("d:\\ora.jpg");
		fileSource.setFileValidate(false);
		fileSource.setSize(500);
		return fileSource;
	}
	
	@Bean(name="filebs3")
	@Qualifier(value="f3")
	public FileSource2 getFileAction3() {
		return FileSource2.builder().fileName("d:\\ck.txt").size(50).fileValidate(false).build();
		
	}
}








