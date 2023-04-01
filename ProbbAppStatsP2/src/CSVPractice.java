import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CSVPractice {

	
	public static ArrayList<String> csvFunction(int xRange, int xIncrement) {
		ArrayList<String> output = new ArrayList<String>();
		output.add("x, y = x^2 + 2x + 1");
		for(int x = 0; x <= xRange; x += xIncrement) {
			int y =  (int) (Math.pow(x, 2) + (2*x) + 1);
			String newX = String.valueOf(x);
			String newY = String.valueOf(y);
			output.add(newX +"," + newY);
		}
		
		return output;
		
	}
	
	
	public static File csvOutputFile(ArrayList<String> list) throws IOException {
		File csv = new File("D://QuadraticFunction.csv");
		FileWriter fw = new FileWriter(csv);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();
		return csv;
	}
	public static void main(String[] args) throws IOException {
		//System.out.println(csvFunction(30, 1));
		csvOutputFile(csvFunction(10,1));
	}

}
