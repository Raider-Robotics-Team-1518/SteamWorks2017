package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoMode0 extends Command {
	
	// Autonomous drive profile to start at Red 1.
	// Robot will drive to deliver gear, then around north side of airship.
	// Driving is measured and adjusted using encoders and gyro
	// After clearing airship, turn toward boiler to shoot
	double travelDistance = 0;

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// Drive forward 93 inches - need to subtract robot length
		Robot.driveTrain.gyroDrive(93);  // Use Gyro to Drive Straight
		
		// Turn right 60 degrees
		Robot.driveTrain.gyroTurn(60);
		
		// Drive forward 24 inches
		Robot.driveTrain.gyroDrive(24);
		
		// Wait for gear removal
		Timer.delay(5);
		
		// Back up to clear gear lift
		Robot.driveTrain.gyroDrive(-12);
		
		// Turn left to go past the airship
		Robot.driveTrain.gyroTurn(-60);
		
		// Drive forward to cross point line
		Robot.driveTrain.gyroDrive(36);
		
		// Turn right to drive toward south wall
		Robot.driveTrain.gyroTurn(90);
		
		// Drive toward south wall
		Robot.driveTrain.gyroDrive(160);
		
		// Turn toward boiler
		Robot.driveTrain.gyroTurn(60);
		
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

}
