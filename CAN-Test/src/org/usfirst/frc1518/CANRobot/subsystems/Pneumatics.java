package org.usfirst.frc1518.CANRobot.subsystems;

import org.usfirst.frc1518.CANRobot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{
	public static final Solenoid one = RobotMap.testSolenoid;

	public Pneumatics() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
