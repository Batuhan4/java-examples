package fg;

public class MergeSortTester {
	public static void main(String[] args) {
		int [] arr1= {1,2,4,7,8,11};
		int [] arr2= {3,6,8,9,10,11,12,14};
		int[] mergedArray = Sorter.merge(arr1, arr2);
		System.out.println("New Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
            }
        System.out.println();
        int maxValue = Sorter.getMax(mergedArray);
        int minValue = Sorter.getMin(mergedArray);
        System.out.println("Max value is: " + maxValue);
        System.out.println("Min value is: " + minValue);
		}
	}