import java.util.ArrayList;
public class Arrays {
  public static void main(String[] args) {
    for(String argument : args) {
      System.out.println("Got an argument: " + argument);
    }

    // int[] -- just a type for array of ints
    // int[]{5,4,3,2,1} -- new instance of ints
    int[] ints = new int[]{5,4,3,2,1};
    // ints[0] == 5
    // This is called a for-each loop
    // for(type whatever in someArray) {
    // }
    for(int someInt : ints) {
      System.out.println("someInt:" + someInt);
    }
    for(int i = 0; i<ints.length; i++) {
      System.out.println("int at i:" + ints[i]);
    }

    // Rectangle[] rects = new Rectangle[3];
    // rects[0] = new Rectangle(5,4);
    // rects[1] = new Rectangle(2,4);
    // rects[2] = new Rectangle(3,4);
    // // rects[3] = new Rectangle(5,6);
    // for(Rectangle someRect : rects) {
    //   System.out.println("someRect:" + someRect);
    // }

    // ArrayList< whateverType you're shoving into it >
    // ArrayList<E>
    ArrayList<Rectangle> myRects = new ArrayList<Rectangle>();
    myRects.add(new Rectangle(5,4));
    myRects.add(new Rectangle(65,3));
    myRects.add(new Rectangle(6,4));
    myRects.add(new Rectangle(6,3));
    // myRects.remove(0);
    // for(Rectangle someRect : myRects) {
    //   System.out.println("someRect:" + someRect);
    // }
    System.out.println("Every other element");
    for(int i = 0; i<myRects.size(); i+= 2) {
      System.out.println("rect at i ("+i+"): " + myRects.get(i));
    }

    System.out.println("Every element");
    LOOP: {
      int i = 0;
      while(i<myRects.size()) {
        System.out.println("rect at i ("+i+"): " + myRects.get(i));
        i++;
      }
    }
    LOOP:{
      int i = 0;
      while(true) {
        System.out.println("rect at i ("+i+"): " + myRects.get(i));
        i++;
        if(myRects.size() <= i){
          break;
        }
        else {
          continue;
        }
        // System.out.println("Blah");
      }
    }

    // NAMED_BLOCK: {
    //   System.out.println("Pew");
    //   // NAMED_BLOCK;
    // }
    // while(true) {
    //   System.out.println("aaaa");
    // }
    boolean statement = false;
    do {
      System.out.println("Blah");
    } while(statement);
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
