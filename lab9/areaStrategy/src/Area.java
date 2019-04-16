import java.util.Arrays;

/*
 *  Area Class with main function
 */
public class Area {

    /*
     * Current area calculation strategy
     */
    private IAreaStrategy areaStrategy;

    /**
     * Area Class constructor
     * @param areaStrategy
     */
    public Area(IAreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    /**
     * Function to calculate area
     * @param arr_x x coordinates
     * @param arr_y y coodrinates
     * @return area for all x and y coordinates
     */
    public double[] myArea(double arr_x[], double arr_y[]) {
        return areaStrategy.CalculateArea(arr_x, arr_y);
    }

    /*
     * Main function
     * @param args arguments
     */
    public static void main(String[] args) {
        // X Coordinates in meters
        double[] arr_x = {2, 5, 7, 10, 1, 45};
        // Y Coordinates in meters
        double[] arr_y = {3, 4, 18, 9, 8, 30};
        // Sq. Meters strategy
        IAreaStrategy meters = new SquareMeters();
        // Sq Feets Strategy
        IAreaStrategy feets = new SquareFeets();

        // Calculate Area using Square Meters Strategy
        Area area_1 = new Area(meters);
        double[] area_m = area_1.myArea(arr_x,arr_y);

        System.out.println("\nAreas in Sq. Meters:");
        for (int i = 0; i < 6;  i++) {
            System.out.format("Length %.2f meters\t Width %.2f meters\t : Area %.2f sq meter\n",
                    arr_x[i], arr_y[i], area_m[i]);
        }

        // Calculate Area using Square Feets Strategy
        Area area_2 = new Area(feets);
        double[] area_f = area_2.myArea(arr_x,arr_y);
        System.out.println("\n\nAreas in Sq. Feets:");
        for (int i = 0; i < 6;  i++) {
            System.out.format("Length %.2f meters\t Width %.2f meters\t : Area %.2f sq meter\n",
                    arr_x[i], arr_y[i], area_f[i]);
        }


    }
}
