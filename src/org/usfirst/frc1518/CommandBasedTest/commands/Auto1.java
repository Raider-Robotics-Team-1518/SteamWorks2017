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
	double distanceToTravel = 0;
	double startPosition = 0;
	RobotDrive drive = DriveTrain.drive;
	
	public Auto1() {
		RobotMap.driveTrainFrontLeftWheel.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		RobotMap.driveTrainFrontRightWheel.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		RobotMap.driveTrainFrontRightWheel.reverseSensor(true);
		RobotMap.driveTrainFrontLeftWheel.reverseSensor(true);

	}
	
	protected void execute() {

		//LF.changeControlMode(TalonControlMode.Speed);
		//RF.changeControlMode(TalonControlMode.Speed);
		//LF.setPID(0.5, 0.001, 0);
		//RF.setPID(0.5, 0.001, 0);
		//LF.enableControl();
		//RF.enableControl();
		//LF.set(distanceToTravel / circumferenceInInches * pulsesPerRotation);
		System.out.println("Starting Auto 1");
		startPosition = RobotMap.driveTrainFrontRightWheel.getEncPosition();
		distanceToTravel = 48;
		while (Robot.driveTrain.hasDrivenFarEnough(startPosition, distanceToTravel) == false) {
			Robot.driveTrain.drive.arcadeDrive(-0.5, 0);
		}
		Robot.driveTrain.drive.arcadeDrive(0, 0);
		

	}
	
	protected void end(){
	}

	protected void interrupted(){
	}
	
}
