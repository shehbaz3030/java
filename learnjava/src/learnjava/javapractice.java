package learnjava;
import java.util.Scanner;
public class javapractice {

	public static void main(String [] args) {
		Scanner inp=new Scanner(System.in);
	
		int ar[]= {23,4,34,5,66,22};
		display(ar);
		int ret[]=display(ar);
		
		System.out.println(ret);
		
		 
	}
	public static int[] display(int[] input) {
		int upt[]=new int[4];
		for(int i=0;i<4;i++) {
			
			System.out.println(upt[4]=(input[i]+1));
			
			
		}
		return upt;
		
	}
	
	
}
