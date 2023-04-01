import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;


/**
 * @author Zach Emmell
 *
 */
public class CSVSalter extends CSVPlotter{

	public static File csvSalter(File inputFile, int saltRange) throws FileNotFoundException {
		Random rand = new Random(+-saltRange);
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		
		
		return null;
	}
	
	
	public static void main(String[] args) {
		//File file = 
		//csvSalter(, 31);

	}

}
