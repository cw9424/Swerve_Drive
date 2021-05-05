package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveDriveSubsystem;

public class SwerveControllerCommand extends CommandBase {
  private final SwerveDriveSubsystem mDrive;
  private final Joystick mJoystick;
  /**
   * Creates a new SwerveControllerCommand.
   */
  public SwerveControllerCommand(SwerveDriveSubsystem driveSubsystem, Joystick joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    mJoystick = joystick;
    mDrive = driveSubsystem;
    addRequirements(mDrive);
  }

  

// Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mDrive.drive(-mJoystick.getY(), mJoystick.getX(), mJoystick.getZ());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}