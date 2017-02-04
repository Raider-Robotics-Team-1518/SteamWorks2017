// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest;




import edu.wpi.first.wpilibj.CANSpeedController;
import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.VictorSP;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;


// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static CANSpeedController driveTrainFrontLeftWheel;
	public static CANSpeedController driveTrainFrontRightWheel;
	public static CANSpeedController driveTrainRearLeftWheel;
	public static CANSpeedController driveTrainRearRightWheel; 
	public static CANSpeedController shooterMotor;
	public static Servo servo1;
	public static Servo servo2;
	public static CANSpeedController feedMotor;
	public static Solenoid testSolenoid;
	public static Solenoid testSolenoid1;
	public static Talon pwmDriveFL;
	public static Talon pwmDriveRL;
	public static Talon pwmDriveFR;
	public static Talon pwmDriveRR;
	public static DigitalOutput dio8;
	public static DigitalOutput dio9;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	driveTrainFrontLeftWheel = new CANTalon(4);
    	driveTrainFrontRightWheel = new CANTalon(1);
    	driveTrainRearLeftWheel = new CANTalon(3);
    	driveTrainRearRightWheel = new CANTalon(2);
    	pwmDriveFL = new Talon(5);
    	pwmDriveRL = new Talon(4);
    	pwmDriveFR = new Talon(2);
    	pwmDriveRR = new Talon(3);
    	shooterMotor = new CANTalon(5);
    	servo1 = new Servo(0);
    	servo2 = new Servo(1);
    	feedMotor = new CANTalon(6);
    	Compressor c = new Compressor(0);
    	c.setClosedLoopControl(true);
    	testSolenoid = new Solenoid(0);
    	testSolenoid1 = new Solenoid(2);
    	dio8 = new DigitalOutput(8);
    	dio9 = new DigitalOutput(9);
    	driveTrainFrontLeftWheel.setInverted(false);
    	driveTrainFrontRightWheel.setInverted(false);
    	driveTrainRearLeftWheel.setInverted(false);
    	driveTrainRearRightWheel.setInverted(false);
    	pwmDriveFL.setInverted(true);
    	pwmDriveRL.setInverted(true);
    	pwmDriveFR.setInverted(true);
    	pwmDriveRR.setInverted(true);
    	
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
