import java.util.Scanner;

public class Strategy_Design_Pattern {
public static void main(String args[])
{Scanner ama=new Scanner(System.in);
System.out.println("Enter the values of a and b");
int a1=ama.nextInt();
int b1=ama.nextInt();

	Accessfactor b = new Accessfactor(new Addition());		
    b.accessing(a1,b1);
    Accessfactor b3 = new Accessfactor(new Modulus());		
    b3.accessing(a1,b1);
    Accessfactor b4 = new Accessfactor(new power());		
    b4.accessing(a1,b1);
    
	
}
}
