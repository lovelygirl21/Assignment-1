import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    int a[] = new int[50] ;
	    int max=0,i;
		System.out.println("Enter the size:");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		System.out.println("enter the elements:");
		for(i=0;i<n;i++){
		    a[i] = inp.nextInt();
		}
		max = a[0];
		int index = 0;
		for(i=0;i<n;i++){
		    if(max<a[i]){
		        max = a[i];
		        index = i;
		    }
		}
		System.out.println("Maximum number is "+max);
		System.out.println("position of maximum number is "+index);
	}
}
