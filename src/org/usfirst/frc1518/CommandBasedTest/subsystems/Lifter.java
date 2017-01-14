package org.usfirst.frc1518.CommandBasedTest.subsystems;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.commands.Lift;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lifter extends Subsystem {
	public static TalonSRX armMotor = RobotMap.liftMotor1;
	public static VictorSP winchMotor = RobotMap.liftMotor2;

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Lift());
		
	}

}
