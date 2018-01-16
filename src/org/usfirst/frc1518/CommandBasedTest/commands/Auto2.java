package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Auto2 extends Command {
	double distanceToTravel = 0;
	double startPosition = 0;
	double circumferenceInInches = Robot.driveTrain.circumferenceInInches;
	int pulsesPerRotation = Robot.driveTrain.pulsesPerRotation;

	double currentAngle = 0;
	double currentPosition = 0;
	double targetPulseCount = 0;
	double targetPosition = 0;
	double drivePower = 0;
	boolean taskDone = false;
	//public static RobotDrive drive;

	
	public Auto2() {
		
		//drive = new RobotDrive(RobotMap.driveTrainRearLeftWheel, RobotMap.driveTrainFrontRightWheel);
	}
	
	protected void execute() {

		System.out.println("Starting Auto 2");
/*		startPosition = RobotMap.driveTrainFrontRightWheel.getEncPosition();
		distanceToTravel = 48;
		while (Robot.driveTrain.hasDrivenFarEnough(startPosition, distanceToTravel) == false) {
			Robot.driveTrain.drive.arcadeDrive(-0.5, 0);
		}
		Robot.driveTrain.drive.arcadeDrive(0, 0);
*/
		taskDone = false;
		//Drive forward from right station.
		gyroDrive(-85);
		Timer.delay(.5);
		//Turn to face gear station.
		gyroTurn(-53);
		Timer.delay(.5);
		//Drive forward to meet gear station.
		gyroDrive(-33);
		//Wait for pilot to grab gear.
		Timer.delay(5);
		// IF BLUE ALLIANCE BACK UP AND SHOOT
		if (DriverStation.getInstance().getAlliance().toString() == "Red") {
			//Back away from gear station.
			gyroDrive(12);
			Timer.delay(.5);
			//Turn to face boiler.
			gyroTurn(180);
			Timer.delay(.5);
			//Drive forward not past baseline.
			gyroDrive(-12);
			//SHOOT
			while (RobotState.isAutonomous() == true) {
				RobotMap.shooterMotor.set(0.9);
				RobotMap.feedSpare1.set(.7);
				RobotMap.shootAgitator.set(1);
				RobotMap.feedMotor1.set(.5);

			}
		}
		RobotMap.shooterMotor.set(0);
		RobotMap.feedSpare1.set(0);
		RobotMap.shootAgitator.set(0);
		RobotMap.feedMotor1.set(0);
		
	
		end();
		
	}
	
	protected void end(){
		System.out.println("Auto Mode 2 Completed");
		stop();
	}

	protected void interrupted() {
		stop();
		System.out.println("Auto Mode 2 Interrupted");
	}

    public void stop() {
		System.out.println("Auto Mode 2 Stopped");
    	Robot.driveTrain.drive.arcadeDrive(0,0);
    	taskDone = true;
    	
    }
    
    public boolean hasDrivenFarEnough(double startPos, double distance) {
		currentPosition = -1 * RobotMap.driveTrainRearLeftWheel.getEncPosition();
		targetPulseCount = distance / circumferenceInInches * pulsesPerRotation;
		targetPosition = startPos + targetPulseCount;
		//System.out.println("Current Position: " + String.valueOf(currentPosition));
		//System.out.println("Target Position: " + String.valueOf(targetPulseCount));
		if (RobotState.isAutonomous() == true) {
		if (distance > 0) { // Driving FORWARD
			if (currentPosition >= targetPosition) {
				return true;
			}
			else{
				return false;
			}
		}
		else { // Driving REVERSE
			if (currentPosition <= targetPosition) {
				return true;
			}
			else {
				return false;
			}
		}
		}
		else { return true;}
	}

   
    public boolean drivenFarEnough(double distance) {
		currentPosition = -1 * RobotMap.driveTrainRearLeftWheel.getEncPosition();
		targetPulseCount = distance / circumferenceInInches * pulsesPerRotation;
		//System.out.println("Current Position: " + String.valueOf(currentPosition));
		//System.out.println("Target Position: " + String.valueOf(targetPulseCount));
		if (currentPosition >= targetPulseCount) {
			return true;
		}
		return false;
	}    
    public boolean gyroTurn(double targetAngle) {
		RobotMap.rioGyro.reset();
			while ((RobotState.isAutonomous() == true) && (Math.abs(readGyro()) < Math.abs(targetAngle)) && (Math.abs(calcP(targetAngle)) > 0.22)) {
				Robot.driveTrain.drive.arcadeDrive(0, calcP(targetAngle));
			}
			stop();	
			return true;
	}
	public boolean gyroDrive(double distance) {
		RobotMap.rioGyro.reset();
		startPosition = -1 * RobotMap.driveTrainRearLeftWheel.getEncPosition();
		while (hasDrivenFarEnough(startPosition, distance) == false) {
			double drift = readGyro() / 10;
			if (distance > 0) {
			Robot.driveTrain.drive.arcadeDrive(-0.5, -drift);  // FORWARD
			}
			else {
				Robot.driveTrain.drive.arcadeDrive(0.5, -drift);  // REVERSE
			}
			System.out.println("Gyro Heading: " + drift);
		}
		stop();
		return true;
	}
	
	protected double readGyro() {
		double angle = RobotMap.rioGyro.getAngle();
		return angle;
	}
	protected double calcP(double tAngle) {
		double p = 0.95 * ((1-(Math.abs(readGyro()) / Math.abs(tAngle))) - 0.05);
		
		if (tAngle > 0) {
			return p;
		}
		else {
			return (p * -1);
		}
	}

	@Override
	protected boolean isFinished() {
		System.out.println("Auto Mode 2 isFinished");
		return taskDone;
	}

}
