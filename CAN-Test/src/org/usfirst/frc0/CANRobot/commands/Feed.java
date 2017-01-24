package org.usfirst.frc0.CANRobot.commands;

import org.usfirst.frc0.CANRobot.OI;
import org.usfirst.frc0.CANRobot.Robot;
import org.usfirst.frc0.CANRobot.RobotMap;
import org.usfirst.frc0.CANRobot.subsystems.Feeder;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class Feed extends InstantCommand{

	public Feed() {
		// TODO Auto-generated constructor stub
	}
	protected void execute(){
		Feeder.feeder.set(OI.mainstick.getThrottle());
		}
		
	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}
	
	protected void end() {
	Feeder.feeder.set(0);
	}
	
	protected void interrupted(){
	Feeder.feeder.set(0);
	}
}
