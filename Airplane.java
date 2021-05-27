/*
* This class creates an airplane.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-27
*/

public class Airplane {

  /**
   * Setting the speed.
   */
  private int speed;

  /**
   * Setting field values with a constructor.
   */
  public Airplane() {
    this.speed = 0;
  }

  /**
   * This method gets the speed of the airplane.
   *
   * @return speed
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * This method sets the speed of the airplane.
   *
   * @param userSpeed
   */
  public void setSpeed(final int userSpeed) {
    this.speed = userSpeed;
  }
}
