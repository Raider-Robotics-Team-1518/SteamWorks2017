package org.usfirst.frc1518.CANRobot.commands;

import org.usfirst.frc1518.CANRobot.OI;
import org.usfirst.frc1518.CANRobot.Robot;
import org.usfirst.frc1518.CANRobot.RobotMap;
import org.usfirst.frc1518.CANRobot.subsystems.Feeder;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Feed extends Command{

	public Feed() {
		// TODO Auto-generated constructor stub
	}
	protected void execute(){
		Feeder.feeder.set(OI.mainstick.getThrottle());
		}
		
	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
	Feeder.feeder.set(0);
	}
	
	protected void interrupted(){
	Feeder.feeder.set(0);
	}
}
