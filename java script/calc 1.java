import java.util.Scanner;
public class Calc1{
	public static void main (String[]args){
		Scanner scan =new Scanner(System.in);	
		int a,b,c,selection
		system.out.println("please enter any two digits:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("make your selection");
		System.out.println("1.addition");
		System.out.println("2.soustraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
	//picking user selection	
		selection=scan.nextInt();
		while(selection>4){
		system.out.println("please enter the correct selection:");
		selection=scan.nextInt();
}
		calc2 mani =new calc()
		if(selection==1){
		 c=mani.add(a,b);
		System.out.println("your answer is" "+c);
             }else if(selection==2){
		 c=mani.sub(a,b);
		System.out.println("your answer is" "+ c);	
	     }else if(selection==3){
		 c=mani.multi(a,b);
		System.out.println("your answer is" "+c);
 	     }else if(selection==4){
		 c=mani.div(a,b);
		System.out.println("your answer is" "+c);
}