package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

	public Drive() {
		// TODO Auto-generated constructor stub
		requires(Robot.driveTrain);
	}

	public Drive(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Drive(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public Drive(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	protected void execute(){
		// combine z and x axis for steering preference
		// multiply the x axis by 0.5 to give more control
		// multiply the z axis by itself to slow power curve
		
		double liveZ = Robot.oi.mainstick.getZ() * Math.abs(Robot.oi.mainstick.getZ());
		double liveX = Robot.oi.mainstick.getX() * 0.5;
		double steering = liveZ + liveX;
		if (Robot.isReversed == true) {
		Robot.driveTrain.takeJoystickInputs(Robot.oi.mainstick.getY(), steering);
		}
		else {
			// reversing zAxis when steering reversed
			Robot.driveTrain.takeJoystickInputs(Robot.oi.mainstick.getY(), steering * -1);
		}
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void end() {
		Robot.driveTrain.stop();
	}
	protected void interrupted(){
		end();
	}
}
