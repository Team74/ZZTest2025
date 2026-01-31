package frc.robot.subsystems.swervedrive;

import edu.wpi.first.wpilibj.DigitalInput;
/* further details on proxsensors found in
 *  https://docs.wpilib.org/en/stable/docs/software/hardware-apis/sensors/digital-inputs-software.html#digital-inputs-software
 */
public class prox_sensor {
      DigitalInput m_input = new DigitalInput(0);
      
      public void proxSensor(){
           m_input.get();
      }
}
