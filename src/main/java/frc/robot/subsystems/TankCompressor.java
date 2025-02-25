/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class TankCompressor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Compressor compress = null;
  
  public TankCompressor (){
    compress= new Compressor();
  }
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void pumpTank(){
    compress.setClosedLoopControl(true);
  }
  public void pumpOff(){
    compress.setClosedLoopControl(false);
  }
  

}
