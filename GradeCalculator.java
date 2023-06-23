import java.util.Scanner;
public class GradeCalculator
{
	public static void main (String[] args) {
	    int score;
		System.out.println("Enter the test score");
		Scanner i = new Scanner(System.in);
		score = i.nextInt();
		
		if(score>100 || score<0){
		    System.out.println("Score must be positive and below 100");
		}
		else if(score>=90){
		    System.out.println("A");
		}
		else if(score>=80){
		    System.out.println("B");
		}
		else if(score >= 70){
		    System.out.println("C");
		}
		else if(score >= 60){
		    System.out.println("D");
		}
		else if(score >= 50){
		    System.out.println("E");
		}
		else{
		    System.out.println("F");
		}
	}
}
