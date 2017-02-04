package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ExtendSolenoid1 extends InstantCommand{
	boolean isExtended1 = false;
	public ExtendSolenoid1() {
		// TODO Auto-generated constructor stub
		
	}
protected void execute(){
	if(isExtended1 == true){
		Pneumatics.two.set(false);
		isExtended1 = false;
	}
	else {
		Pneumatics.two.set(true);
		isExtended1 = true;
	}
}

@Override
protected boolean isFinished() {
	// TODO Auto-generated method stub
	return true;
	}
}