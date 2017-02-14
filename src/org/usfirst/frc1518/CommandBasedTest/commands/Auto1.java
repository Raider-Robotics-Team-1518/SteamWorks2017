package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.MotionProfile1;
import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Auto1 extends InstantCommand {
	double distanceToTravel = 24;
	double circumferenceInInches = Math.PI * 10;
	int pulsesPerRotation = 4096;
	RobotDrive drive = DriveTrain.drive;
	CANTalon LF = RobotMap.driveTrainFrontLeftWheel;
	CANTalon RF = RobotMap.driveTrainFrontRightWheel;
	
	public Auto1() {
		LF.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		RF.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		RF.reverseSensor(true);
		LF.setVoltageRampRate(12);
		RF.setVoltageRampRate(12);
		LF.setEncPosition(0);
		RF.setEncPosition(0);

	}
	
	protected void execute() {

		//LF.changeControlMode(TalonControlMode.Speed);
		//RF.changeControlMode(TalonControlMode.Speed);
		//LF.setPID(0.5, 0.001, 0);
		//RF.setPID(0.5, 0.001, 0);
		//LF.enableControl();
		//RF.enableControl();
		//LF.set(distanceToTravel / circumferenceInInches * pulsesPerRotation);
		while (hasDrivenFarEnough(distanceToTravel) == false) {
			Robot.driveTrain.drive.arcadeDrive(-0.5, 0);
		}
		Robot.driveTrain.drive.arcadeDrive(0, 0);
		

	}
	
	protected void end(){
		LF.disableControl();
		RF.disableControl();
	}

	protected void interrupted(){
		LF.disableControl();
		RF.disableControl();
	}
	protected boolean hasDrivenFarEnough(double distance) {
		int currentPosition = RF.getEncPosition();
		double targetPulseCount = distance / circumferenceInInches * pulsesPerRotation;
		System.out.println("Current Position: " + String.valueOf(currentPosition));
		System.out.println("Target Position: " + String.valueOf(targetPulseCount));
		if (currentPosition >= targetPulseCount) {
			return true;
		}
		else{
			return false;
		}
	}
}
