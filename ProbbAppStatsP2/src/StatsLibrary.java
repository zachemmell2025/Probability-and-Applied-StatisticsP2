import java.util.ArrayList;

/**
 * StatsLibrary...methods include:
 * mean
 * median
 * mode
 * standardDeviation
 * intersect
 * union
 * compliment
 * factorial
 * permutations
 * combinations
 * binomialDistribution
 * geometricDistribution
 */

/**
 * @author Zach Emmell
 *
 */
public class StatsLibrary {

	public double mean(ArrayList<Integer> array) {
		double total = 0;
		for (int singleElement : array) {
			total = total + singleElement;
		}
		double mean = total / array.size();
		return mean;
	}

	public int median(ArrayList<Integer> array) {
		int medianPlace = (array.size() - 1) / 2;
		int median = array.get(medianPlace);
		return median;
	}

	public int mode(ArrayList<Integer> array) {
		int maxValue = 0, maxCount = 0;
		for (int i = 0; i < array.size(); i++) {
			int count = 0;
			for (int j = 0; j < array.size(); j++) {
				if (array.get(j) == array.get(i))
					count++;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = array.get(i);
			}
		}
		return maxValue;

	}

	public double standardDeviation(ArrayList<Integer> array) {
		double total = 0;
		for (int singleElement : array) {
			total = total + singleElement;
		}
		double mean = total / array.size();

		double td = 0;
		for (int i = 0; i < array.size(); i++) {
			double fd = array.get(i) - mean;
			for (int j = 0; j < array.size(); j++) {
				double sd = Math.pow(fd, 2);
				for (int k = 0; k < array.size(); k++) {
					td += sd;
				}

			}
		}
		double fourd = td / (array.size() - 1);
		double stanDev = Math.sqrt(fourd);
		return stanDev;
	}
	
	public ArrayList<Integer> intersect(ArrayList<Integer> set1, ArrayList<Integer> set2) {
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		for(int i: set1) {
			if(set2.contains(i))
				intersection.add(i);	 
		 }
		 return intersection;
	}

	public ArrayList<Integer> union(ArrayList<Integer> set1, ArrayList<Integer> set2) {
		 set1.addAll(set2);
		 for(int i = 0; i < set1.size() - 1; i++) {
			 for(int j = 1; j < set1.size() - 1; i++) {
				if(set1.get(i) == set1.get(j)) set1.remove(j);
				
			 }
		}
		 return set1;
	}

	public ArrayList<Integer> complement(ArrayList<Integer> set1, ArrayList<Integer> superset) {
	
		for(int i = 0; i < set1.size(); i++) {
			 for(int j = 1; j < superset.size(); i++) {
				if(set1.get(i) == superset.get(j)) superset.remove(j);
				
			 }
		}
		 return superset;
	}

	public static int factorial(Integer n) {
		int factorial = n;
		for(int i = n - 1; i > 0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public double permutations(int n, int r) {
		return factorial(n) / factorial(n - r);
		
	}

	public double combinations(int n, int r) {
		 return factorial(n) / (factorial(r) * factorial(n - r));
		
	}
	
	public double binomialDistribution(double p, double q, int n, int y) {
		return  (factorial(n) / factorial(y) * factorial(n - y)) * Math.pow(p, y) * Math.pow(q, n-y);
	}
	
	public double geometricDistribution(double p, double q, double y) {
		return Math.pow(q, y - 1) * p;
	}
	
	public double poissonDistribution(double lambda, int y) {
		double e = 2.718281828;
		return (Math.pow(lambda, y)) * Math.pow(e, -lambda) / factorial(y);
	}
	
	public double tchebysheffs(double mean, double stanDev, int high, int low) {
		return 0.0;
	}
	
	public double uniformDistribution() {
		return 0.0;
	}
}

