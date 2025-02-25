/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Shooter extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
DoubleSolenoid pitchSolenoid = null;
DoubleSolenoid hatchSolenoid = null;  

public Shooter(){
  pitchSolenoid = new DoubleSolenoid(RobotMap.SHOOTER_PITCH_SOLENOID_DEPLOY, RobotMap.SHOOTER_PITCH_SOLENOID_RETRACT);
  hatchSolenoid = new DoubleSolenoid(RobotMap.HATCH_MANIPULATOR_SOLENOID_OUT, RobotMap.HATCH_MANIPULATOR_SOLENOID_IN);
}

  
  
public void pitchUp(){
  pitchSolenoid.set(Value.kForward);
}
public void pitchdown(){
  pitchSolenoid.set(Value.kReverse);
}

public void hatchextend(){
  hatchSolenoid.set(Value.kForward);
}
public void hatchretract(){
  hatchSolenoid.set(Value.kReverse);
}

@Override
public void initDefaultCommand() {
  // Set the default command for a subsystem here.
  // setDefaultCommand(new MySpecialCommand());
  }
}