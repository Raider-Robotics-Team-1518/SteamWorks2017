package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoMode3 extends Command{
	boolean taskComplete;

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		int timeout = 0;
		while (timeout < 125000) {
			Robot.driveTrain.drive(-0.7, -0.7);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);
		taskComplete = true;
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return taskComplete;
	}

}
