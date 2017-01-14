package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class RangeCompare extends Command {
	public RangeCompare() {
	    requires(Robot.driveTrain);

	}

	@Override
	protected void initialize() {
		//Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		Robot.leftButtCheek = RobotMap.analogSensorLeftSonic.GetRangeInInches();
		Robot.rightButtCheek = RobotMap.analogSensorRightSonic.GetRangeInInches();
		Robot.buttChasm = Robot.rightButtCheek - Robot.leftButtCheek;
		Robot.buttAverage = (Robot.leftButtCheek + Robot.rightButtCheek) / 2; // send to Driver Station
		
			if (Robot.buttChasm > 0) {
				Robot.driveTrain.drive(0.7, -0.7);
//				DriveTrain.frontLeftDrive.set(-0.5);
//				DriveTrain.rearLeftDrive.set(-0.5);
//				DriveTrain.frontRightDrive.set(0.5);
//				DriveTrain.rearRightDrive.set(0.5);
			}
			else if(Robot.buttChasm < 0) {
				Robot.driveTrain.drive(-0.7, 0.7);
//				DriveTrain.frontLeftDrive.set(0.5);
//				DriveTrain.rearLeftDrive.set(0.5);
//				DriveTrain.frontRightDrive.set(-0.5);
//				DriveTrain.rearRightDrive.set(-0.5);
			}
			else {
				Robot.driveTrain.drive(0, 0);
//				DriveTrain.frontLeftDrive.set(0);
//				DriveTrain.rearLeftDrive.set(0);
//				DriveTrain.frontRightDrive.set(0);
//				DriveTrain.rearRightDrive.set(0);
			}
		//Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		//Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		//Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		Robot.driveTrain.drive(0, 0);
//		DriveTrain.frontLeftDrive.set(0);         
//		DriveTrain.rearLeftDrive.set(0);
//		DriveTrain.frontRightDrive.set(0);
//		DriveTrain.rearRightDrive.set(0);
		//Auto-generated method stub
		
	} 

}
