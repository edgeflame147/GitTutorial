// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private final CANSparkMax frontLeftMotor;
  private final CANSparkMax frontRightMotor;
  private final CANSparkMax backLeftMotor;
  private final CANSparkMax backRightMotor;

  /** Creates a new Drivetrain. */
  public Drivetrain() {
    frontLeftMotor = new CANSparkMax(0, MotorType.kBrushless);
    frontRightMotor = new CANSparkMax(1, MotorType.kBrushless);
    backLeftMotor = new CANSparkMax(2, MotorType.kBrushless);
    backRightMotor = new CANSparkMax(3, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
