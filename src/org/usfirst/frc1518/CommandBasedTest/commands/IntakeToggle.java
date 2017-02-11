package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class IntakeToggle extends InstantCommand{

	public IntakeToggle() {
		// TODO Auto-generated constructor stub
	}
	protected void execute(){
		if(Robot.intakeOn == true){
			RobotMap.pwmIntake.set(0);
			Robot.intakeOn = false;
		}
		else{
			RobotMap.pwmIntake.set(1);
			Robot.intakeOn = true;
		}
	}

	
	protected void end() {
	
	}
	
	protected void interrupted(){
	
	}


}
