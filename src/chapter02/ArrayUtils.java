package chapter02;

public class ArrayUtils {
	
	static double[] intToDouble(int[] intArray){
		double[] dArray = new double[intArray.length];
		
		for(int i=0;i<intArray.length;i++){
			dArray[i] = (double)intArray[i];
		}
		
		return dArray;
	}
	
	static int[] doubleToInt(double []doubleArray){
		int[] iArray = new int[doubleArray.length];
		
		for(int i=0;i<doubleArray.length;i++){
			iArray[i] = (int)doubleArray[i];
		}
		
		return iArray;
	}
	
	static int[] concat(int[] a1, int[] a2){
		int[] cArray = new int[a1.length + a2.length];
		
		
		for(int i=0;i<a1.length + a2.length;i++){
			if(i < a1.length){
				cArray[i] = a1[i];
			}
			else{
				cArray[i] = a2[i-a1.length];
			}
		}
		
		return cArray;
	}

}
