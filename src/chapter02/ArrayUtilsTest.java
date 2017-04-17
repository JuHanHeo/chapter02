package chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {10, 20, 30, 40, 50};
		double[] dArray = ArrayUtils.intToDouble(intArray);
		
		for(double v : dArray){
			System.out.print(v+" ");
		}
		System.out.println();
		
		int[] intArray2 = ArrayUtils.doubleToInt(dArray);
		
		for(int v : intArray2){
			System.out.print(v+" ");
		}
		System.out.println();
		
		int[] concatArray = ArrayUtils.concat(intArray, intArray2);
		
		for(int v : concatArray){
			System.out.print(v+" ");
		}
		System.out.println();
		
		
		
		
		

	}

}
