package firstproject;

import java.util.Scanner;

public class firstprogram {
	 public static void main(String args[]) {
		    System.out.println("Running");
		    int x= 567;
		    long y = 3453453453L;
		    double z = 3.245666666666;
		    char s = '@';
		    String l = "Neymer";
		    System.out.println(l);
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Name:");
		    String name = scanner.nextLine();
		    System.out.println("Age:");
		    int age = scanner.nextInt(); //in scanner method nextInt() leaves the \n within it so next time when nextLine is called it consider it as EOL and end the code
		     scanner.nextLine();
		    System.out.println("Food:");
		    String food = scanner.nextLine();


		    System.out.println("Name is:"+name);
		    System.out.println(age);
		    System.out.println(food);

		  }
}
