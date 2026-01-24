package frc.robot.subsystems.swervedrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.math.util.Units;

  

public class Servo_motor{
     Servo turretServo = new Servo(1);

  public void setting () {
       turretServo.setAngle(90);
  }
}
