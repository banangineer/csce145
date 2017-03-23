package shape_area;
import java.util.Scanner;

public class ShapeFrontEnd extends ShapeCollection{

  public static Scanner keyboard = new Scanner(System.in);
  
  public static void main(String[] args) {
    ShapeCollection shapes = new ShapeCollection();
    String userShape = "";
    int userInt = 0;
    double shapeLength = 0;
    double shapeHeight = 0;
    boolean continueProgram = true;
    
    System.out.println("Welcome to the Shapes collections");
    while (continueProgram == true) {
      System.out.println("Enter 1: Add a shape"
          +"\nEnter 2: Remove a shape"
          +"\nEnter 9: Quit");
      userInt = keyboard.nextInt();
      keyboard.nextLine();
      
      switch (userInt) {
        case 1:
          System.out.println("What type of shape?\n"
              +"Rectangle, Triangle, or Circle?");
          userShape = keyboard.nextLine();
          
          if (userShape.equalsIgnoreCase("circle")) {
            System.out.println("Enter a radius");
            shapeLength = keyboard.nextDouble();
            keyboard.nextLine();
            if (shapeLength <= 0.0) {
              System.out.println("Invalid Input.");
              break;
            }
            Circle newCircle = new Circle(shapeLength);
            shapes.addShape(newCircle);
          } else if (userShape.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter a length, followed by a height.");
            shapeLength = keyboard.nextDouble();
            shapeHeight = keyboard.nextDouble();
            keyboard.nextLine();
            if (shapeLength <= 0.0 || shapeHeight <= 0.0) {
              System.out.println("Invalid Input.");
              break;
            }
            Rectangle newRectangle = new Rectangle(shapeLength, shapeHeight);
            shapes.addShape(newRectangle);
          } else if (userShape.equalsIgnoreCase("triangle")) {
            System.out.println("Enter a base, followed by a height.");
            shapeLength = keyboard.nextDouble();
            shapeHeight = keyboard.nextDouble();
            keyboard.nextLine();
            if (shapeLength <= 0.0 || shapeHeight <= 0.0) {
              System.out.println("Invalid Input.");
              break;
            }
            Triangle newTriangle = new Triangle(shapeLength, shapeHeight);
            shapes.addShape(newTriangle);
          } else {
            System.out.println("Invalid Input.");
            break;
          }
          break;
        case 2:
        case 9:
          continueProgram = false;
          break;
        default:
          System.out.println("Invalid Input.");
          break;
      }
      
    } // end of loop
  } // end of main method

} // end of ShapeFrontEnd
