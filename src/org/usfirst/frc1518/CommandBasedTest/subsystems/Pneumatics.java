package org.usfirst.frc1518.CommandBasedTest.subsystems;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{
	public static final Solenoid one = RobotMap.testSolenoid;
	public static final Solenoid two = RobotMap.testSolenoid1;
	
	public Pneumatics() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
