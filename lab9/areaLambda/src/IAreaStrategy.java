/*
 * Interface for Area Strategy
 */
public interface IAreaStrategy {
    /*
     * Calculate Area function
     * @param x length in meters
     * @param y width in meters
     * @return calculated area
     */
    public double[] CalculateArea(double x[], double y[]);
}
