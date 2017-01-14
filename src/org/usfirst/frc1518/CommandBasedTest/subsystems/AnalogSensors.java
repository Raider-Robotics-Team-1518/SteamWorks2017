package org.usfirst.frc1518.CommandBasedTest.subsystems;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AnalogSensors extends Subsystem{
public static final AnalogInput ai1 = RobotMap.optic1;
public final static Rangefinder leftSonic = RobotMap.analogSensorLeftSonic;
public final static Rangefinder rightSonic = RobotMap.analogSensorRightSonic; 
int ai1Value;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
		ai1Value = ai1.getValue();
		SmartDashboard.putNumber("DB optic", ai1Value);
	
		
		
	}
	

}
