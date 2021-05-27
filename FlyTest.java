/*
* This program prints values that for flight tests for a biplane and
* a boeing jet.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-27
*/

final class FlyTest {

  private VehicleMain() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
   * Sets the speed for the plane.
   */
  private final int biSpeed = 212;
  /**
   * Sets the speed for the jet.
   */
  private final int jetSpeed = 422;
  /**
   * Sets the multiplier for the jet.
   */
  private final int boeingAcc = 5000;
  /**
   * Sets how manys tests it does.
   */
  private final int airTests = 4;

  /**
   * This function runs flight tests for a biplane and a boeing jet and prints
   * the values of the test.
   *
   * @param args
   */
  public static void main(final String[] args) {

    // Creating a biplane and setting its speed
    Airplane biplane = new Airplane();
    biplane.setSpeed(biSpeed);
    System.out.println(biplane.getSpeed());

    // Creating a boeing jet and setting its speed
    Jet boeing = new Jet();
    boeing.setSpeed(jetSpeed);
    System.out.println(boeing.getSpeed());

    // Setting counter variable
    int counter = 0;

    // Loop that tests acceleration on each aircraft
    while (counter < airTests) {
      // Accelerating boeing plane
      boeing.accelerate();
      System.out.println(boeing.getSpeed());
      if (boeing.getSpeed() > boeingAcc) {
        // Accelerating the biplane should the boeing plane speed be over 5000
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        // Accelerating the boeing aircraft
        boeing.accelerate();
      }

      // Increasing the counter by 1
      counter++;
    }

    // Printing out the final speed of the biplane
    System.out.println(biplane.getSpeed());
  }
}
