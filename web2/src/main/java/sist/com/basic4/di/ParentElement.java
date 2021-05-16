package sist.com.basic4.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class ParentElement {
	@Autowired
	private Element element;

	@Override
	public String toString() {
		return "ParentElement [element=" + element + "]";
	}
	
	

}
