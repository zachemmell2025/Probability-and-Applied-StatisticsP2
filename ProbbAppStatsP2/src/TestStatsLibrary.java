import java.util.ArrayList;

public class TestStatsLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StatsLibrary test = new StatsLibrary();
		

		ArrayList<Integer> someInput = new ArrayList<Integer>();
		someInput.add(2);
		someInput.add(4);
		someInput.add(3);
		someInput.add(0);
		someInput.add(1);
		
		
		ArrayList<Integer> someOtherInput = new ArrayList<Integer>();
		someOtherInput.add(5);
		someOtherInput.add(6);
		someOtherInput.add(7);
		someOtherInput.add(3);
		someOtherInput.add(4);
		someOtherInput.add(2);
		someOtherInput.add(1);
		someOtherInput.add(6);
		
		
		ArrayList<Integer> superSet = new ArrayList<Integer>();
		superSet.add(2);
		superSet.add(4);
		superSet.add(3);
		superSet.add(0);
		superSet.add(1);
		superSet.add(45);
		superSet.add(27);
		superSet.add(90);
		superSet.add(10);
		
		
		double result = test.mean(someInput);
		System.out.println("Average: " + result);

		int medianResult = test.median(someInput);
		System.out.println("Median: " + medianResult);

		int modeResult = test.mode(someInput);
		System.out.println("Mode: " + modeResult);

		double stanDevResult = test.standardDeviation(someInput);
		System.out.println("Standard Deviation: " + stanDevResult);
		
		
		System.out.println(test.intersect(someInput, someOtherInput));
		
		
		//System.out.println(test.union(someInput, someOtherInput));
		
		
		//System.out.println(test.complement(someInput, superSet));
		
		System.out.println(test.combinations(23, 2));
		
		double p = 0.80;
		double q = 0.20;
		int n = 10;
		int y = 7;
		
		double biDis = test.binomialDistribution(p, q, n, y);
		System.out.println(biDis);
		
		double geoDis = test.geometricDistribution(p, q, y);
		System.out.println(geoDis);
	}

}
