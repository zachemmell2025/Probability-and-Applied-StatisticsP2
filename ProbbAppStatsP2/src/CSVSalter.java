import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


/**
 * @author Zach Emmell
 *
 */
public class CSVSalter {

	public static File csvSalter(String fileName, int saltRange) throws IOException {
		File inputFile = new File(fileName);
		Scanner scanner = new Scanner(inputFile);
		int inputFileSize = 0;
		do
			inputFileSize++;
		while(scanner.hasNext());
		
		scanner.close();
		
		Random rand = new Random(+-saltRange);
		File outputFile = new File("SaltedFunction.csv");
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		for(int i = 0; i < inputFileSize; i++) {
			String line = br.readLine();
			String [] newLine = line.split(",");
			int newY = rand.nextInt();
			String yValue = String.valueOf(newY);
			newLine[1] = yValue;
			bw.write(newLine[0] + "," + newLine[1] + "," + newLine[2]);
		}
		br.close();
		bw.close();
		return outputFile;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		csvSalter("SimpleFunction.csv", 5);

	}

}
