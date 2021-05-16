package sist.com.aop.basic2;

import lombok.Data;

@Data
public class Marine implements Unit {
	private Command command;

	@Override
	public void doCommand() {
		// TODO Auto-generated method stub
		command.command();
	}
	
	

}
