import java.util.Scanner;
//1,4,5,8,9
class Main {
  public int checkInputInt(Scanner sc, String name){
    int a = 0;
    boolean gotNumber = false;
    System.out.print(name + " = ");

    while (!gotNumber) {
      String str = sc.next();
      try {
        a = Integer.parseInt(str);
        gotNumber = true;
      } catch (Exception e) {
        System.out.println("This is not an integer!");
        System.out.print(name + " = ");
      }
    }
    return a;
  }
  public double checkInputDouble(Scanner sc, String name){
    double a = 0.;
    boolean gotNumber = false;
    System.out.print(name + " = ");
    while (!gotNumber) {
      String str = sc.next();
      try {
        a = Double.parseDouble(str);
        gotNumber = true;
      } catch (Exception e) {
        System.out.println("This is not a float number!");
        System.out.print(name + " = ");
      }
    }
    return a;
  }
  //1
  public double fraction(double x){
    return x - (int)x;
  }
  //4
  public boolean isPositive (int x){
    return x >= 0;
  }
  //5
  public boolean is2Digits (int x){
    int modx = Math.abs(x);
    return modx > 9 && modx < 100;
  }
  //8
  public boolean isDevisor(int a, int b){
    return a == 0 || b == 0 || (a % b == 0 || b % a == 0);
  }

  //9
  public boolean isEqual(int a, int b, int c){
    return a == b && b == c;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Main m = new Main();

    System.out.println("1 Fraction");
    double d1 = m.checkInputDouble(sc,"x");
    System.out.println(m.fraction(d1));

    System.out.println("4 isPositive");
    int a4 = m.checkInputInt(sc, "x");
    System.out.println(m.isPositive(a4));

    System.out.println("5 is2Digit");
    int a5 = m.checkInputInt(sc, "x");
    System.out.println(m.is2Digits(a5));

    System.out.println("8 isDevisor");
    int a8 = m.checkInputInt(sc, "a");
    int b8 = m.checkInputInt(sc, "b");
    System.out.println(m.isDevisor(a8, b8));

    System.out.println("9 isEqual");
    int a9 = m.checkInputInt(sc, "a");
    int b9 = m.checkInputInt(sc, "b");
    int c9 = m.checkInputInt(sc, "c");
    System.out.println(m.isEqual(a9,b9,c9));

  }
}