package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Auto2 extends Command {

	public Auto2() {
		// TODO Auto-generated constructor stub
	}
	
	protected void execute(){
		DriveTrain.drive.arcadeDrive(-0.5, 0);
		Timer.delay(2);
		DriveTrain.drive.arcadeDrive(0, 0);
	}
	
	protected void end(){
		DriveTrain.drive.arcadeDrive(0, 0);
	}

	protected void interrupted(){
		DriveTrain.drive.arcadeDrive(0, 0);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
