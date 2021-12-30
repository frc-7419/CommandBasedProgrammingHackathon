// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
<<<<<<< HEAD

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private TalonFX placeholderTalon;

  public ShooterSubsystem() {
    placeholderTalon = new TalonFX(53);
  }

  public double setPower(double power) {
    // this is completely wrong btw
    return power;
  }

=======
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {

  private TalonFX shooter;

  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {
    shooter = new TalonFX(5);
  }

  public void setPower(double power){
    shooter.set(ControlMode.PercentOutput, power);
  }
  
>>>>>>> Franklin_Kelly-branch1
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
