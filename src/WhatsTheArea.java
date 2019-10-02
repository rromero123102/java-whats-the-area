import java.util.Scanner;

public class WhatsTheArea
        
{
    
private static final Scanner kb = new Scanner(System.in);

public static void main(String[] args)
{
    int surfaceArea = 0;
    
    surfaceArea += Triangle();
    surfaceArea += Rectangle();
    surfaceArea += Trapezoid();
    surfaceArea += Ellipse();
    surfaceArea += Square();
    surfaceArea += Parallelogram();
    surfaceArea += Circle();
    surfaceArea += Sector();
    
    
    
    
    //TODO: add calls to other methods for each of the shapes needed
    System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
}
public static int Triangle()
{
    System.out.println("\nThe area of a triangle is: 1/2 * base * height");
    System.out.print("base > ");
    int base = kb.nextInt();
    System.out.print("height > ");
    int height = kb.nextInt();
    int area = (int)(0.5 * base * height);
    System.out.println("The area of this shape is: " + area);
    return area;

}
public static int Rectangle()
{
    System.out.println("\nThe area of a rectangle is: base * height");
    System.out.print("base > ");
    int base = kb.nextInt();
    System.out.print("height > ");
    int height = kb.nextInt();
    int area = (int)(base * height);
    System.out.println("The area of this shape is: " + area);
    return area;

}
public static int Trapezoid()
{
    System.out.println("\nThe area of a trapezoid is: 1/2 (a+b) * height");
    System.out.print("a > ");
    int basea = kb.nextInt();
    System.out.print("b > ");
    int baseb = kb.nextInt();System.out.print("h > ");
    int height = kb.nextInt();
    int area = (int)(.5 * (basea + baseb) * height);
    System.out.println("The area of this shape is: " + area);
    return area;

}
public static int Ellipse()
{
    System.out.println("\nThe area of a ellipse is: pi * a * b");
    System.out.print("base > ");
    int a = kb.nextInt();
    System.out.print("height > ");
    int b = kb.nextInt();
    int area = (int)(Math.PI * a * b);
    System.out.println("The area of this shape is: " + area);
    return area;

}
public static int Square()
{
    System.out.println("\nThe area of a square is the lenght of a side to^2");
    System.out.print("side");
    int side = kb.nextInt();
    int area = (int)(Math.pow(side, 2));
    System.out.println("The area of this shape is: " + area);
    return area;

}
public static int Parallelogram()
{
    System.out.println("\nThe area of a parallelogram is: base * height");
    System.out.print("base > ");
    int base = kb.nextInt();
    System.out.print("height > ");
    int height = kb.nextInt();
    int area = (int)(base * height);
    System.out.println("The area of this shape is: " + area);
    return area;

}
public static int Circle()
{
    System.out.println("\nThe area of a circle is pi r^2");
    System.out.print("radius > ");
    int radius = kb.nextInt();
    int area = (int)(Math.PI * (Math.pow(radius, 2)));
    System.out.println("The area of this shape is: " + area);
    return area;

}
public static int Sector()
{
    System.out.println("\nThe area of a sector is 1/2 * r^2 * the angle");
    System.out.print("radius > ");
    int radius = kb.nextInt();
    System.out.print("angle > ");
    int angle = kb.nextInt();
    int area = (int)(0.5 * (Math.pow(radius, 2)) * angle);
    System.out.println("The area of this shape is: " + area);
    return area;

}

//TODO: write methods for each of the different shapes
}