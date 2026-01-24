package frc.robot.subsystems.swervedrive;

import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.AnalogInput;

public class limit_switch {
 // Initializes an AnalogTrigger on port 0
  AnalogTrigger m_trigger0 = new AnalogTrigger(0);
  // Initializes an AnalogInput on port 1
  AnalogInput m_input = new AnalogInput(1);

  // Initializes an AnalogTrigger using the above input
  AnalogTrigger m_trigger1 = new AnalogTrigger(m_input);
    
     public void analogToDigital(){
         // Enables 2-bit oversampling
        m_input.setAverageBits(2);
        // Sets the trigger to enable at a raw value of 3500, and disable at a value of 1000
        m_trigger0.setLimitsRaw(1000, 3500);
        // Sets the trigger to enable at a voltage of 4 volts, and disable at a value of 1.5 volts
        m_trigger0.setLimitsVoltage(1.5, 4);

     }
}
