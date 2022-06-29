import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {
	public static void main(String[] args) throws Exception {

	}

	public static int cubed(int i) {
		return (int) Math.pow(i,3);
	}

	public static int difference(int a, int b) {
		return a-b;
	}

	public static double difference(double a, double b) {
		return a-b;
	}

	public static double median(int[] arr) {
		Arrays.sort(arr);
		double median;
		if (arr.length % 2 == 0)
			median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
		else
			median = (double) arr[arr.length/2];
		return median;
	}

	public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> kats) {
		for (int i = 0; i < kats.size(); i++) {
			String catColor = kats.get(i).getColor();
			if (catColor.equals(catColor.toUpperCase())) {
				return kats;
			} else {
				kats.get(i).setColor(catColor.toUpperCase());
			}
		}
		return kats;
	}






}
