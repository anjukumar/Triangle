import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input sides of the triangle /n First side:   ");
		int x = keyboard.nextInt();
		System.out.println("Second side:   ");
		int y = keyboard.nextInt();
		System.out.println("Third side:   ");
		int z = keyboard.nextInt();
		
		if(x==y && y==z && x==z)
		{
			System.out.println("This is an equilateral triangle");
		}
		else 
		{
			System.out.println("This not an equilateral triangle");
		}
		
		//Check is right angle
		
		if(x*x == y*y +z*z || y*y== z*z + x*x || z*z == y*y 
				+x*x )
		{
		 System.out.println ("This is a right angle triangle ");
		}
		
		else 
		{
			System.out.println("This is not a right angle triangle");
		}
		keyboard.close();

	}

}
