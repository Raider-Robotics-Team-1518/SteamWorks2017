package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ExtendSolenoid extends InstantCommand{
	boolean isExtended = false;

	public ExtendSolenoid() {
		// TODO Auto-generated constructor stub
	}
	
	protected void execute(){
		if(isExtended == true){
			Pneumatics.one.set(false);
			isExtended = false;
		}
		else {
			Pneumatics.one.set(true);
			isExtended = true;
		}
		}
		
	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}
	
	protected void end() {
	
	}
	
	protected void interrupted(){
	}

}
