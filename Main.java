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
     // a boolean expression that I know will return false
     System.out.println(10 == 15);
     // real life example
     int myAge = 34;
     int votingAge = 18;
     System.out.println(myAge >= votingAge);
    /*>= comparison operator to find out if the age 34
    is greater than OR equal to the voting age limit
    of 18. */
    // getting a specific output after values are compared
    if (myAge >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote.");
    }
    /* if specifies a block of code to be executed if a
    specific condition is true
     */
    if (20 > 18) {
      System.out.println("20 is greater than 18");
    }
    int i = 20;
    int u = 18;
    if (i > u) {
      System.out.println("i is greater than u");
    }
    // else statement specifies a block of code to be executed if condition is false
    int time = 20;
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    // outputs "Good evening."
    // else if statement specifies new condition if first condition is false
    // int time = 22;
    // if (time < 10) {
    //   System.out.println("Good morning.");
    // } else if ( time < 18) {
    //   System.out.println("Good day.");
    // } else {
    //   System.out.println("Good evening.");
    // }
    int pizza = 20;
    String result = (pizza < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
    // switch statements
    int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)
// break keyword breaks out of the switch block
// stops the execution of more cose and case testing inside the block
// default keyword specifies some code to run if there is no case match
int weekend = 4;
switch (weekend) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
// Outputs "Looking forward to the Weekend"
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