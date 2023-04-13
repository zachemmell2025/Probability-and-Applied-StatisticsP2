import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * 
 * @author Zach Emmell
 *
 */

public class CSVPlotter {

	public static ArrayList<String> csvFunction(int lowXRange, int highXRange, int xIncrement, int numPoints) {
		ArrayList<String> output = new ArrayList<String>();
		output.add("x, y = (1/2)x + 9");
	
		for(int x = lowXRange + (highXRange - numPoints); x <= highXRange && x <= numPoints; x += xIncrement) {
			double y = (0.5 * x) + 9;
			String newX = String.valueOf(x);
			String newY = String.valueOf(y);
			output.add(newX +"," + newY);
		}
		
		return output;
		
	}
	
	public static File csvOutputFile(ArrayList<String> list) throws IOException {
		File csv = new File("SimpleFunction.csv");
		FileWriter fw = new FileWriter(csv);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();
		return csv;
	}
	
	public static void main(String []args) throws IOException {
		csvOutputFile(csvFunction(-10, 10, 2, 10));
	}
}
