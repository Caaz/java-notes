import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Creating an instance of Scanner
    // Declaring and Initializing.
    // System.in is a Reader type
    Scanner input = new Scanner(System.in);
    System.out.println("Width:");

    // declaring a float, initializing it as whatever input.nextFloat returns
    int sideA = input.nextInt();
    System.out.println("Height:");
    // same thing
    int sideB = input.nextInt();

    // here we can parse a String as a float, using parseFloat, which is a static method of the Float class
    // float fixedWidth = Float.parseFloat(sideA);
    Rectangle myRect = new Rectangle(sideA,sideB);
    // getting width will fail, because the variable is private, and we're outside of it's class.
    // System.out.println(myRect.width);
    System.out.println(myRect);
    // declaring, initialized as the math stuff.
    // float area = sideA*sideB;

    // System.out.println static method
    // string + object concatenates them
    // System.out.println("The area is "+area);
    return;
  }
}

class Rectangle {
  // declarations
  private float width = 0;
  private float height = 0;
  // This overloads the constructor, meaning you can use it with or without the
  // width and height arguments
  Rectangle(){}
  Rectangle(float width, float height) {
    // Here we need to refer to the instance's width and height value as this.width
    // and this.height, because our parameters have the same name. "this" refers to
    // the current instance we're working with.
    this.width = width;
    this.height = height;
  }
  Rectangle(int width, int height) {
    // Here we need to refer to the instance's width and height value as this.width
    // and this.height, because our parameters have the same name. "this" refers to
    // the current instance we're working with.
    this.width = (float)width;
    this.height = (float)height;
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
