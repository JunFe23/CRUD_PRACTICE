package sist.com.bean.di;

import org.springframework.stereotype.Component;

@Component
public class MessageAction {	
	public String getMessageData(String job) {		  
		return job.equals("a1")?job.concat("Hello"):job.equals("a2")?job.concat("Hi"):job.concat("Message");
	}
	
	public String getLocation(String job) {
		return job.equals("a1")?"mvc/actionDi/aListView1.jsp":job.equals("a2")?"mvc/actionDi/aListView2.jsp":"";
	}

}


/*ackage sist.com.bean.di;

import org.springframework.stereotype.Component;

@Component
public class MessageAction {   
   public String getMessageData(String job) {        
      return job.equals("a1")?job.concat("Hello"):job.equals("a2")?job.concat("Hi"):job.concat("Message");
   }
   
   public String getLocation(String job) {
      return job.equals("a1")?"mvc/actionDi/aListView1.jsp":job.equals("a2")?"mvc/actionDi/aListView2.jsp":"";
   }

}*/