package asStatistics;

import java.util.Arrays;


public class Statistics {
	
	private double [] data;
	private double [] sdata;
	
	
	public Statistics(double []d) {
		
		data = d.clone();
		sdata = d.clone();
		
		Arrays.sort(sdata);
		
	}
	
	public double findMin() {
		double min = sdata[0];
		return min;
	}
	
	
	public double findMax(){
		double max = sdata [sdata.length-1];
		return max;
	}
	public double findMean() {
		double sum, mean;
		sum = 0;
		for(int i= 0; i<sdata.length;i++)
		{
			sum = sum +sdata[i];
		}
		mean = sum/ sdata.length;
		return mean;
	}
	public double findMedian() {
		double median =0;
		int index, indexHi, indexLo;
		if ((sdata.length % 2)!=0) {
			index = sdata.length/2;
			median = data[index];
		}
		else {
			indexHi = sdata.length / 2;
			indexLo = indexHi-1;
			median = (sdata[indexLo] + sdata[indexHi]) /2;
		}
		return median;
	}
	
	public double [] getOrigData() {
		double [] d = data.clone();
		return d;
		
	}
	public double [] getSortedData() {
		double [] d = sdata.clone();
		
		return d;
	}
	public static double computeMax(double [] data){
		Statistics st = new Statistics(data);
		double max = st.findMax();
		return max;
	}
	public static double computeMin(double [] data){
		Statistics st = new Statistics(data);
		double min = st.findMin();
		return min;
	}
	public static double computeMean(double [] data){
		Statistics st = new Statistics(data);
		double mean = st.findMean();
		return mean;
	}
	public static double computeMedian(double [] data){
		Statistics st = new Statistics(data);
		double median = st.findMedian();
		return median;
	}
	public static  double[] computeSortedData(double [] data){
		Statistics st = new Statistics(data);
		double[] sortedData = st.getSortedData();
		return sortedData;
		
	}
	
}
