/*
 * Class to implement Area calculation strategy in Square Meters
 */
public class SquareMeters implements IAreaStrategy {
    /*
     * Calculate Area function
     * @param x x coordinates in meters
     * @param y y coordinates in meters
     * @return calculated area in square meters for each x and y
     */
    public double[] CalculateArea(double[] x, double[] y) {
        double[] area = {0,0,0,0,0,0};

        for (int i = 0; i < 6; i++) {
             area[i] = x[i] * y[i];
        }
        return area;
    }

}
