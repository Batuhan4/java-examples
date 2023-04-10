package fg;

public class Sorter {
    
	public static int[] merge(int int1[],int int2[]) {
		int[] sorted = new int[int1.length + int2.length];
		int i=0 , j=0 , k=0;
        while (i < int1.length && j < int2.length) {
            if (int1[i] <= int2[j]) {
                sorted[k] = int1[i];
                k++;
                i++;
            } else {
                sorted[k] = int2[j];
                k++;
                j++;
            }
        }

        while (i < int1.length) {
            sorted[k] = int1[i];
            k++;
            i++;
        }

        while (j < int2.length) {
            sorted[k] = int2[j];
            k++;
            j++;
        }
		return sorted;
	}
	public static int getMin(int sorted[]) {
		int min= sorted[sorted.length-1];
		return min;
	}
	public static int getMax(int sorted[]) {
		int max= sorted[0];
		return max;
	}

}
