/*
 * Class to implement Area calculation strategy in Square feets
 */
public class SquareFeets implements IAreaStrategy{
    /*
     * Calculate Area function
     * @param x x coordinates in meters
     * @param y y coordinates in meters
     * @return calculated area in square feets for each x and y
     */
    public double[] CalculateArea(double[] x, double[] y) {
        double[] area = {0,0,0,0,0,0};
        for (int i = 0; i < 6; i++) {
            // Convert meters to feet
            double feet_x = x[i] * 3.28084;
            double feet_y = y[i] * 3.28084;

            area[i] = feet_x * feet_y;
        }
        return area;
    }
}
