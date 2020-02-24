package array;


/**
 * @author Shobhit Sharma
 * @Description:-//2D array 
 *
 */
public class MutiDimentionalArray {

	
	public static void main(String[] args) {
		int[][] number={{3,5,8},{6,2,3,5},{6}};
		 System.out.println("Length of Array: " + number.length);
		 System.out.println("Length of row 1: " + number[0].length);
		 System.out.println("Length of row 2: " + number[1].length);
		 System.out.println("Length of row 3: " + number[2].length+"\n");
		 System.out.println("=========PRINTING OF ELEMNETS --------");
		 for (int i = 0; i < number.length; i++)
		 {
			 for (int j = 0; j < number[i].length; j++)
			 {
				System.out.println(number[i][j]);
			 }
			
		}

	}

}
