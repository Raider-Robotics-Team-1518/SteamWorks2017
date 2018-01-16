package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Launcher;

import edu.wpi.first.wpilibj.command.Command;

public class Unstick extends Command {

	protected void execute() {
		RobotMap.feedMotor1.set(-.5);
    	RobotMap.shootAgitator.set(-1);
	}
    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.feedMotor1.set(0);
    	RobotMap.shootAgitator.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.feedMotor1.set(0);
    	RobotMap.shootAgitator.set(0);
    }

	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
