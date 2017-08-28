import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Creating an instance of Scanner
    // Declaring and Initializing.
    // System.in is a Reader type
    Scanner input = new Scanner(System.in);
    System.out.println("Width:");

    // declaring a float, initializing it as whatever input.nextFloat returns
    float sideA = input.nextFloat();
    System.out.println("Height:");
    // same thing
    float sideB = input.nextFloat();

    Rectangle myRect = new Rectangle(sideA,sideB);
    System.out.println(myRect);
    // declaring, initialized as the math stuff.
    // float area = sideA*sideB;

    // System.out.println static method
    // string + object concatenates them
    // System.out.println("The area is "+area);
    Rectangle[] myRects = new Rectangle[]{

    }
    return;
  }
}

class Rectangle {
  // declarations
  private float width = 0;
  private float height = 0;
  // This overloads the constructor, meaning you can use it with or without the
  // width and height arguments
  // public static void main(String[] args) {
  //   Scanner input = new Scanner(System.in);
  //   Rectangle myRect;
  //   System.out.println("Width:");
  //
  //   // declaring a float, initializing it as whatever input.nextFloat returns
  //   float sideA = input.nextFloat();
  //   System.out.println("Height:");
  //   // same thing
  //   float sideB = input.nextFloat();
  //   myRect = new Rectangle(sideA,sideB);
  //   System.out.println(myRect.width);
  //   System.out.println(myRect);
  // }
  Rectangle(){}
  Rectangle(float width, float height) {
    // Here we need to refer to the instance's width and height value as this.width
    // and this.height, because our parameters have the same name. "this" refers to
    // the current instance we're working with.
    this.width = width;
    this.height = height;
  }
  // instance method, with no arguments.
  float getArea() {
    return width * height;
  }
  // define toString to allow us to use an instance of Rectangle within a string
  public String toString() {
    return "Width: " + width + ", Height: " + height + ", Area: " + getArea();
  }
}
