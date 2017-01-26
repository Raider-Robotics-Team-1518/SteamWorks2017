package org.usfirst.frc1518.CommandBasedTest.subsystems;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Servos extends Subsystem{
	public static Servo servo1 = RobotMap.servo1;
	public static Servo servo2 = RobotMap.servo2;
	public static double lowPosition = 0;
	public static double midPosition = 0.25;
	public static double highPosition = 0.5;
	public Servos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
