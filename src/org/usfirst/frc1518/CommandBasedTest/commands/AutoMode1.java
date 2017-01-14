package org.usfirst.frc1518.CommandBasedTest.commands;


import org.usfirst.frc1518.CommandBasedTest.OI;
import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoMode1 extends Command {

	boolean taskComplete = false;

	public AutoMode1() {
	    requires(Robot.driveTrain);
		// addSequential(new Forward( ));
	 
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		DriveTrain.drive.tankDrive(OI.leftJoystick.getY(), OI.rightJoystick.getY());
		SmartDashboard.putBoolean("Forward", false);
		Robot.isReversed = false;
		int timeout = 0;
		
		while (timeout < 300000) {
			Robot.driveTrain.drive(-0.7, -0.7);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);
		/*timeout = 0;
		while (timeout < 250000) {
			Robot.driveTrain.drive(-.5, .5);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);
		timeout = 0;
		while (timeout <250000) {
			Robot.driveTrain.drive(-.5, -.5);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);*/
		
		taskComplete = true;
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return taskComplete;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.driveTrain.drive(0, 0);

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}
