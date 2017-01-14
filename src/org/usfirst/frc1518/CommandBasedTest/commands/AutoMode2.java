package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoMode2 extends Command {
	boolean taskComplete = false;

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		int timeout = 0;
		
		while(timeout < 250000) {
			Robot.driveTrain.drive(-0.5, -0.5);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);
		timeout = 0;
		while(Robot.buttChasm != 0) {
			new RangeCompare();
		}
		Robot.driveTrain.drive(0, 0);
		while(Robot.buttChasm == 0) {
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
