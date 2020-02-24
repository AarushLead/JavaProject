package array;

public class ThreeDimentionalArrayForEach {

	public static void main(String[] args) {
		int[][][] number= {{{4,7,3,8}},{{3,6,2}},{{3,4}}};
		for(int[][] a:number)
		{
			for(int[] b:a)
			{
				for (int c : b) {
					System.out.println(c);
				}
			}
		}

	}

}
