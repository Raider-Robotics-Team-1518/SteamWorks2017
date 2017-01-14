package org.usfirst.frc1518.CommandBasedTest.subsystems;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Tail extends Subsystem{
	public final static CANTalon tailMotor = RobotMap.tailMotor;
	public DigitalInput  DigitalInput = RobotMap.tailLimit1;

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
