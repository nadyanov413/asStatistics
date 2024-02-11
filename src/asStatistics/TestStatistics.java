package asStatistics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class TestStatistics {

	public static void main(String[] args) {
		
		String in, out;
		String delim = ",";
		
		in = JOptionPane.showInputDialog("Enter data values seperated by a comma: ");
		StringTokenizer st = new StringTokenizer(in, delim);
		
		
		
		int count = st.countTokens();
		
		double [] data = new double [count];
		
		for (int i = 0; i<count; i++) {
			String token = st.nextToken();
			token = token.trim();
			data [i] = Double.parseDouble(token);
			
		}
		
		

		in = JOptionPane.showInputDialog("Enter number of decimal places for output:");
		int placesCount= Integer.parseInt(in);
		
		
		String pattern = "0.";
		for (int i = 0; i <placesCount ; i++) {
			pattern = pattern + "0";
		}
		
		DecimalFormat df = new DecimalFormat();
		
		df.applyPattern(pattern);
		
		Statistics stat = new Statistics(data);
		
		
		double min = stat.findMin();
		double max = stat.findMax();
		double mean = stat.findMean();
		double median = stat.findMedian();
		
		double[] origData = stat.getOrigData();
		double []sortedData = stat.getSortedData();
		
		out = "";
		out += "Original Data:\n";
		for (int i= 0; i < origData.length ; i++) {
			out += origData[i] + " ";
		}
		out += "\n\n";
		
		out += "Results Using Instance Methods:\n";
		
		out += "Sorted Data:\n";
		for (int i= 0; i < sortedData.length ; i++) {
			out += sortedData[i] + " ";
		}
		
//		out += "\nComputed Values Displayed To " + placesCount + " Decimal Places:";
		
		
		out += "\n";
		out += "Min: " + df.format(min) + "\n";
		out += "Max: " +df.format(max) + "\n";
		out += "Mean: " + df.format(mean) + "\n";
		out += "Median: " + df.format(median) + "\n\n";
		
		double minStatic = Statistics.computeMin(data);
		double maxStatic = Statistics.computeMax(data);
		double meanStatic = Statistics.computeMean(data);
		double medianStatic = Statistics.computeMedian(data);
		double[] sortedDataStatic= Statistics.computeSortedData(data);
		
		out += "Results Using Static Methods:\n";
		out += "Sorted data:\n";
		
		for (int i =0; i< sortedDataStatic.length; i++) {
			out += sortedDataStatic[i] + " ";
		}
		out += "\nMin: " + df.format(minStatic)+ "\n";
		out += "Max: " + df.format(maxStatic) + "\n";
		out += "Mean: " + df.format(mean) + "\n";
		out += "Median: " + df.format(medianStatic) + "\n";
		
		
		
		
		

		JOptionPane.showMessageDialog(null, out);

		
		
		
		
		
	
//		in = JOptionPane.showInputDialog("Enter the Number Of Data Values:");
//		int itemCount = Integer.parseInt(in);
//		
//		double[] data1 = new double[itemCount];
//		
//		
//		for(int i=0 ; i<itemCount; i++) {
//			in = JOptionPane.showInputDialog("Enter data value:");
//			data[i] = Double.parseDouble(in); 			
//		}
		
		
	
		
		

	}

}
