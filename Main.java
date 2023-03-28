// This is a comment
/* The code above will print words and answers to
to mathematical equations. */
// type variableName = value
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");
    System.out.println(3);
    System.out.println(358);
    System.out.println(50000);
    System.out.println(3 + 3);
    System.out.println(2 * 5);
    String name = "John";
    System.out.println(name);
    int myNum = 15;
    myNum = 20; // myNum is now 20
    System.out.println(myNum);
    String dog = "Winston";
    System.out.println(dog);
    int otherNum = 5;
    System.out.println(otherNum);
    float myFloatNum = 5.99f;
    System.out.println(myFloatNum);
    boolean myBool = true;
    String myText = "Hello";
    System.out.println(myText);
    String me = "Alex";
    System.out.println("Hello " + me);
    String firstName = "Alex ";
    String lastName = "Van Dyke";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    int x = 5;
    int y = 6;
    System.out.println(x + y); // Prints the value of x + y
    // declare multiple variables
    int a = 5, b = 6, c = 50;
    System.out.println(a + b + c);
    // one value to multiple variables
    int f, d, e;
    f = d = e = 50;
    System.out.println(f + d + e);
    // Good
    int minutesPerHout = 60;
    // Ok, but not easy to understand what m actually stands for.
    int m = 40;
    // byte data type can store whole numbers from -128 to 127
    // Can be used instead of int or other integer types to save memory
    byte yourNum = 100;
    System.out.println(yourNum);
    short hisNum = 5000;
    System.out.println(hisNum);
    int herNum = 100000;
    System.out.println(herNum);
    long dogNum = 15000000000L;
    System.out.println(dogNum);
    float himNum = 5.75f;
    System.out.println(himNum);
    double appleNum = 19.99d;
    System.out.println(appleNum);
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun); // Outputs true
    System.out.println(isFishTasty); //Outputs false
    int w = 10;
    int q =9;
    System.out.println(w > q); // returns true, because 10 is greater than 9
    /*
    A boolean expression returns a boolean value of true 
    or false.
    Useful for building logic and finding answers.
     */
     int n = 12;
     System.out.println(n == 12); // returns true, because n equals 12
  }
}
// All Java variables must be identified with unique names.

/*
String- stores text, such as "Hello". String values are surrounded by double quotes.
int- stores integers (whole numbers).
float - stores floating point numbers with decimals.
char - stores single characters. example: 'a'
boolean - stores values with two states: true or false.
 */

 // Boolean values are mostly used for conditional testing.