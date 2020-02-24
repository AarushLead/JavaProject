package array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {23,10,30,8,7,};
		double average=0.0;
		int sum=0;
		for (int i = 0; i < number.length; i++)
		{
			sum=sum+number[i];			
		}
		average=(double)(sum/number.length);
		System.out.println("The Average of array is :"+average);
		System.out.println("The Sum of array is :"+sum);

	}

}
