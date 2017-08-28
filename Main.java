import java.util.Scanner;

public class Main {
  // The main function must exist within a public class.
  public static void main(String[] args) {
    // Declare input, as a type of Scanner
    // Initialize it to a new Scanner object with System.in as the reader.
    Scanner input = new Scanner(System.in);

    System.out.println("Width:");
    // Declare an integer and initialize it to an integer returned by input.nextInt()
    int width = input.nextInt();

    // Let's do the same basic thing with height.
    System.out.println("Height:");
    int height = input.nextInt();

    // Declare myRect as a Rectangle type.
    // intialize it and pass in our height and width from user input
    Rectangle myRect = new Rectangle(width,height);

    // Let's print our myRect object.
    System.out.println(myRect);
    // Because our toString function was written, this should look fairly nice!
    return;
  }
}

// Note that this class isn't public! This is because public classes need to share the same name as the file
// Which is stupid and whatever but also because then java probably wouldn't know where the main function is
// I donno, read javadocs maybe it'll explain that better. It's a java thing.
class Rectangle {
  // Let's define some private variables, and initialize them to 0.
  // Any time we create a Rectangle and don't set them, they'll have a default value.
  // Both width and height are private, meaning that code outside of this class cannot access them.
  // Kind of sounds mundane and counterintuitive but it has its uses outside of something simple like this.
  private float width = 0;
  private float height = 0;

  // Here's an empty constructor. It's not required to have this but it's nice.
  // If we ever wanted to we could create a new instance like new Rectangle(); and we'll have our default values set.
  Rectangle(){}
  // Our constructor method can be overloaded however, so here we'll set one providing width and height as floats.
  Rectangle(float width, float height) {
    // Here we need to refer to the instance's width and height value as this.width
    // and this.height, because our parameters have the same name. "this" refers to
    // the current instance we're working with.
    this.width = width;
    this.height = height;
  }
  // But what if we wanted to use integers as our arguments? Well we'll overload it again.
  Rectangle(int width, int height) {
    // Here we can cast the width and height to floats so that they're the write type when they're set.
    this.width = (float)width;
    this.height = (float)height;
    // Though it should be noted, you don't neccisarily have to cast these specific types
    // float and int are compatible, and will automagically convert whenever you put them in this situation.
  }

  // Let's do some math and get the area.
  // This is an instance method, so we can use it on any instance of Rectangle.
  float getArea() {
    return width * height;
  }
  // toString is a function we can use that will be called any time this object is used within a string
  // Let's use it to make our output pretty.
  public String toString() {
    // When we use getArea here it's calling it on whatever current instance we're using.
    // it's equivilant to saying this.getArea(); where this is our current Rectangle.
    return "Width: " + width + ", Height: " + height + ", Area: " + getArea();
  }
}
