package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Lift extends Command{

	public Lift() {
		
	}

	protected void execute(){
		RobotMap.lift.set(1);
	}
	
	protected void end(){
		RobotMap.lift.set(0);
	}
	
	protected void interrupted(){
		RobotMap.lift.set(0);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
