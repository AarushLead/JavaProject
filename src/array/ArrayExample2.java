package array;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] number= {23,10,30,8,7,};
		double average=0.0;
		int sum=0;
		for (int i=0; i<number.length;i++)
		{
			sum=sum+number[i];		
			System.out.println("Iteration\t"+"Value of Number\t"+"value of sum");
			System.out.println(i+"\t\t"+number[i]+"\t\t"+sum);
			System.out.println(" ");
		}
		average=(double)(sum/number.length);
		System.out.println("The Average of array is :"+average);
		System.out.println("The Sum of array is :"+sum);

	}

}
