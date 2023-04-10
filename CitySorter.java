package fg;
import java.util.Scanner;
public class CitySorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] cityArray = new String[100];
        cityArray[0] = "ANKARA";
        cityArray[1] = "ISTANBUL";
        int cityCount = 2;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a city name:");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("STOP")) {
                break;
            }

            cityCount = insertCity(cityArray, cityCount, input);
            printCities(cityArray, cityCount);
        }
        
    }

    private static int insertCity(String[] cityArray, int cityCount, String cityName) {
        int index = cityCount;

        for (int i = 0; i < cityCount; i++) {
            if (cityArray[i].compareTo(cityName) > 0) {
                index = i;
                break;
            }
        }

        for (int j = cityCount; j > index; j--) {
            cityArray[j] = cityArray[j - 1];
        }

        cityArray[index] = cityName;
        return cityCount + 1;
    }

    private static void printCities(String[] cityArray, int cityCount) {
        for (int i = 0; i < cityCount; i++) {
            System.out.print(cityArray[i] + " ");
        }
        System.out.println();
    }
}
