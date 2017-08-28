import java.util.ArrayList;
public class Arrays {
  public static void main(String[] args) {
    // args is an array of type String.
    // if you were to run this program with arguments they'd be thrown here.
    // ie. `java Arrays hello world` would give you an array "hello" and "world"
    for(String argument : args) {
      System.out.println("Got an argument: " + argument);
    }

    // If you wanted to create an array yourself, typically you can do this
    int[] intArray = new int[3];
    // you can then populate it by setting individual elements
    // where the index starts at 0
    intArray[0] = 3;
    intArray[1] = 2;
    intArray[2] = 60;

    // This can get a bit annoying so instead, you can use an array initializer
    int[] ints = new int[]{3,2,60};




    // Loops!

    // Let's take our ints array and iterate through them.
    // The standard for loop looks like this, to iterate through each element in ints.
    for(int i = 0; i<ints.length; i++) {
      System.out.println("int at i:" + ints[i]);
    }

    // However, here we have a for-in loop which uses the : operator.
    // This loop will go through each element in ints setting someInt to the element.
    for(int someInt : ints) {
      System.out.println("someInt:" + someInt);
    }



    // ArrayLists!

    // If we want a flexible array to add more elements, we might use ArrayList,
    // This Class has methods to add and remove elements to it's structure.
    // ArrayList< whateverType you're shoving into it >
    // ArrayList<E>
    ArrayList<Rectangle> myRects = new ArrayList<Rectangle>();
    myRects.add(new Rectangle(5,4));
    myRects.add(new Rectangle(65,3));
    myRects.add(new Rectangle(6,4));
    myRects.add(new Rectangle(6,3));
    // Remove the 0th element, which will shift each other element up an index.
    myRects.remove(0);
    // So, if we try to get the element at 0, it'll now be our 1st rectangle defined earlier.
    // Cause, reasons.

    // Iterating through an Arraylist using a for-in loop works exactly as you'd expect.
    for(Rectangle someRect : myRects) {
      System.out.println("someRect:" + someRect);
    }

    // But using the standard for-loop has some slight differences.
    System.out.println("Every other element");
    for(int i = 0; i<myRects.size(); i+= 2) {
      System.out.println("rect at i ("+i+"): " + myRects.get(i));
    }


    // Here we'll check out some other loops!

    // Here's an unnamed block! It helps section off code, for scoping matters.
    // i is set within here, but by the time the block ends the garbage collector will get rid of it.
    {
      System.out.println("Every element");
      // Effectively, this is how you'd write a worse for loop using while instead.
      int i = 0;
      // set i, check if i is less than the size of the array
      while(i<myRects.size()) {
        // Do some code
        System.out.println("rect at i ("+i+"): " + myRects.get(i));
        // increment the iterator
        i++;
        // go back to the conditional and do this block once more if true.
      }
    }

    //

    {
      // Here's an infinite loop! In this situations typically
      // we'd want to break out somehow to avoid just hanging here forever.
      int i = 0;
      while(true) {
        System.out.println("rect at i ("+i+"): " + myRects.get(i));
        i++;
        // Here we do a check to see if our next element will be outside of the array's limit.
        if(myRects.size() <= i){
          // Break will break out of our current loop, stopping further execution.
          break;
        }
        else {
          // continue will continue on as usual and stop execution
          continue;
          // Placing code after continue will cause it to be unreachable, don't do that!
          // System.out.println("yeah that'd be bad");
        }
      }
    }

    // Here's a do-while loop. It'll execute it's block at least once, and check
    // its conditional afterwards.
    do {
      System.out.println("Blah");
    } while(false);
  }
}




// Look in the Rectangle file for actual information on how this is working!
class Rectangle {
  private float width = 0;
  private float height = 0;
  Rectangle(){}
  Rectangle(float width, float height) {
    this.width = width;
    this.height = height;
  }
  Rectangle(int width, int height) {
    this.width = (float)width;
    this.height = (float)height;
  }
  float getArea() {
    return width * height;
  }
  public String toString() {
    return "Width: " + width + ", Height: " + height + ", Area: " + getArea();
  }
}
