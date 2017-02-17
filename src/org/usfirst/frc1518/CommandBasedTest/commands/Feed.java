package org.usfirst.frc1518.CommandBasedTest.commands;


import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;


import edu.wpi.first.wpilibj.command.InstantCommand;

public class Feed extends InstantCommand{

	public Feed() {
		
	}
	
	protected void initialize(){
		Robot.intakeOn = false;
	}
	
	protected void execute(){
		if(Robot.intakeOn == true){
			RobotMap.feedMotor.set(0);
			Robot.intakeOn = false;
		}
		else if(Robot.intakeOn == false){
			RobotMap.feedMotor.set(1);
			Robot.intakeOn = true;
		}
	}
		
	


	
	protected void end() {
		RobotMap.feedMotor.set(0);
	}
	
	protected void interrupted(){
		RobotMap.feedMotor.set(0);
	}
}
