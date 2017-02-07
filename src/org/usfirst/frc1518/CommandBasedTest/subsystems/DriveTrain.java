// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest.subsystems;

import org.usfirst.frc1518.CommandBasedTest.OI;
import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.commands.*;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	public static RobotDrive drive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	
	public DriveTrain(){
		super();
		if(Robot.isTestBot == false){
		drive = new RobotDrive(RobotMap.driveTrainFrontLeftWheel, RobotMap.driveTrainRearLeftWheel, RobotMap.driveTrainFrontRightWheel, RobotMap.driveTrainRearRightWheel);
		}
		else if(Robot.isTestBot == true){
			drive = new RobotDrive(RobotMap.pwmDriveFL, RobotMap.pwmDriveRL, RobotMap.pwmDriveFR, RobotMap.pwmDriveRR);
		}
	}
	
	public void drive(GenericHID mainstick){
		/*double zAxis = Robot.oi.mainstick.getZ();
		double yAxis = Robot.oi.mainstick.getY();
		double xAxis = Robot.oi.mainstick.getX() * 0.5;
    	//yAxis = (yAxis * yAxis);
    	zAxis = (zAxis * Math.abs(zAxis)) + xAxis;

		drive.arcadeDrive(yAxis,zAxis);*/
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new Drive());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void takeJoystickInputs(Double yAxis, Double zAxis) {
		double xAxis = Robot.oi.mainstick.getX() * 0.75;
		yAxis = (yAxis);
    	// multiplying the zAxis by itself causes a slower power curve on the steering
    	// adding 50% of the xAxis to enable better steering while moving forward
    	zAxis = (zAxis * Math.abs(zAxis) * 0.75);
    	
    	drive.arcadeDrive(yAxis, zAxis + xAxis);
    }
    public void stop() {
    	drive.arcadeDrive(0,0);
    }
}

