package sist.com.basic1.di;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {
	
	public static void main(String[] args) {
	  ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic1/di/persondi.xml");
	 /* ((Person)context.getBean("person2")).setName("효진");//[name[효진],age,height]
	  System.out.println(((Person)context.getBean("person2")).getName());*///[name[성빈],age,height]
	 /* ((Person)context.getBean("person1")).setName("지연");
	  System.out.println(((Person)context.getBean("person1")).getName());*/
	  
	 /* Person person=(Person)context.getBean("person3");
	  System.out.println(person);*/
	  //System.out.println(((Room)context.getBean("room2")).getList());
	  /*List<Person> list=((Room)context.getBean("room1")).getList();
	  for(Person p:list) {
		  System.out.println(p);
	  }
	  */
	  
	  /*Set<Person>set=((Room)context.getBean("room1")).getSet();
	  
	  Iterator<Person>i=set.iterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }*/
	  Map<Integer, Person>map=((Room)context.getBean("room3")).getMap();
	  Properties p=((Room)context.getBean("room3")).getProperties();
	  
	  System.out.println(p);
	  
	  /*Iterator<Entry<Integer, Person>>ii=map.entrySet().iterator();
	  while(ii.hasNext()) {
		  Entry<Integer, Person>entry=ii.next();
		  System.out.println(entry.getKey()+" "+entry.getValue());
	  }*/
	 
	  
	}

}














