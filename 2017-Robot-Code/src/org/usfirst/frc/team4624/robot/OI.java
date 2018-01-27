package org.usfirst.frc.team4624.robot;

import org.usfirst.frc.team4624.robot.commands.Drive;
import org.usfirst.frc.team4624.robot.library.XboxController;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static XboxController xboxController = new XboxController(0);

	public static Joystick joystick = new Joystick(0);

	public static JoystickButton driveButton;

	public static final int drive = 3;

	public OI() {

		//driveButton = new JoystickButton(joystick, drive);

		//driveButton.whenPressed(new Drive());

	}
}
