import java.util.Scanner;

public class addition{
	public static void main(String []args){
		
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");

		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();

		int small;
		int big;

		if((a<b)&&a<c){
		small=a;
		}
			else if(b<c){
			small=b;
			}
				else{
				small=c;
				}
			
		

		if((a>b)&&a>c){
		big=a;
		}
			else if(b>c){
			big=b;
			}
			else{
			big=c;
			}
		
		int addition=big+small;

		System.out.println("Addition is"+addition);
	
	}


}
