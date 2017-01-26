package org.usfirst.frc1518.CANRobot.subsystems;

import org.usfirst.frc1518.CANRobot.RobotMap;

import edu.wpi.first.wpilibj.CANSpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Feeder extends Subsystem{

	public static final CANSpeedController feeder = RobotMap.feedMotor;
			
	public Feeder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
