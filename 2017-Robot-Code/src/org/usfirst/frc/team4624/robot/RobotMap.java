package org.usfirst.frc.team4624.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired
 * into to a variable name. This provides flexibility changing
 * wiring, makes checking the wiring easier and significantly reduces the
 * number of magic numbers floating around.
 */
public class RobotMap {

	// PWM port definitions
	public static final int	frontLeftMotor = 10;
	public static final int	frontRightMotor	= 11;
	public static final int	backLeftMotor	= 12;
	public static final int	backRightMotor = 13;
	// public static final int	pickupMotor	= 4;
	// public static final int	shooterMotor = 5;
	// public static final int	climberMotor = 6;
	public static final int cameraPanServo  = 7;
	public static final int cameraTiltServo = 8;

	// DIO port definitions
	//public static final int	echoChannel0 = 0;
	//public static final int echoChannel1 = 1;
	// public static final int echoChannel2 = 2;
	// public static final int echoChannel3 = 3;
	// public static final int echoChannel4 = 4;
	// public static final int echoChannel5 = 5;
	// public static final int	distanceSensorPing = 6;

	// RELAY port definitions
	//public static final int	agitator = 0;

	// For example to map the left and Right motors, you could define the
	// following variables to use with your driveTrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
