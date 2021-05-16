package sist.com.basic4.di;

import java.util.List;
import java.util.Vector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"/sist/com/basic1/di/persondi.xml","/sist/com/basic3/di/message.xml","/sist/com/basic2/di/dao.xml"})

public class ConfigDemo {	
	
	@Bean
	public Node getNodeApp() {
		return new Node("blue","app","java",1991);
		
	}
	@Bean(name="oracle")
	public Node getNodeAppSet() {
		Node node=new Node();
		node.setId("RED");
		node.setName("Oracle");
		return node;
	}
	@Bean(name="orange")
	public List<Node>getNodeList(){
		Vector<Node>v=new Vector<Node>();
		v.add(new Node("orange1", "µþ±â1", "¼ö¹Ú1", 1999));
		v.add(new Node("orange2", "µþ±â2", "¼ö¹Ú2", 1959));
		v.add(new Node("orange3", "µþ±â3", "¼ö¹Ú3", 1979));
		v.add(new Node("orange4", "µþ±â4", "¼ö¹Ú4", 1929));
		return v;		
				
	}
	

}



















