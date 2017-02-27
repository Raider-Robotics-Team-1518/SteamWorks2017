package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoMode0 extends Command {
	
	// Autonomous drive profile to start at Red 1.
	// Robot will drive to deliver gear, then around north side of airship.
	// Driving is measured and adjusted using encoders and gyro
	// After clearing airship, turn toward boiler to shoot
	double travelDistance = 0;
	double startPosition = 0;
	double circumferenceInInches = Math.PI * 10;
	int pulsesPerRotation = 4096;
	//public static RobotDrive drive;
	double currentAngle = 0;
	double currentPosition = 0;
	double targetPulseCount = 0;
	double drivePower = 0;
	boolean taskDone = false;

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// Drive forward 93 inches - need to subtract robot length
		gyroDrive(93);  // Use Gyro to Drive Straight
		
		// Turn right 60 degrees
		gyroTurn(60);
		
		// Drive forward 24 inches
		gyroDrive(24);
		
		// Wait for gear removal
		Timer.delay(5);
		
		// Back up to clear gear lift
		gyroDrive(-12);
		
		// Turn left to go past the airship
		gyroTurn(-60);
		
		// Drive forward to cross point line
		gyroDrive(36);
		
		// Turn right to drive toward south wall
		gyroTurn(90);
		
		// Drive toward south wall
		gyroDrive(160);
		
		// Turn toward boiler
		gyroTurn(60);
		
		// SHOOT!
		
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
    public boolean hasDrivenFarEnough(double startPos, double distance) {
		double currentPosition = -1 * RobotMap.driveTrainFrontLeftWheel.getEncPosition();
		double targetPulseCount = distance / circumferenceInInches * pulsesPerRotation;
		double targetPosition = startPos + targetPulseCount;
		//System.out.println("Current Position: " + String.valueOf(currentPosition));
		//System.out.println("Target Position: " + String.valueOf(targetPulseCount));
		if (currentPosition >= targetPosition) {
			
			return true;
		}
		else{
			return false;
		}
	}

    public boolean drivenFarEnough(double distance) {
		currentPosition = -1 * RobotMap.driveTrainFrontLeftWheel.getEncPosition();
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
			while ((readGyro() < Math.abs(targetAngle)) && (calcP(targetAngle) > 0.2)) {
				Robot.driveTrain.drive.arcadeDrive(0, calcP(targetAngle));
			}
		return true;
	}
	public boolean gyroDrive(double distance) {
		RobotMap.rioGyro.reset();
		startPosition = -1 * RobotMap.driveTrainFrontLeftWheel.getEncPosition();
		while (hasDrivenFarEnough(startPosition, distance) == false) {
			double drift = readGyro() / 10;
			Robot.driveTrain.drive.arcadeDrive(-0.5, -drift);
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
		double p = 0.9 * ((1-(readGyro() / Math.abs(tAngle))) - 0.05);
		if (tAngle > 0) {
			return p;
		}
		else {
			return (p * -1);
		}
	}
    public void stop() {
		System.out.println("Auto Mode 1 Stopped");
    	Robot.driveTrain.drive.arcadeDrive(0,0);
    	taskDone = true;
    }

}
