import java.util.Scanner;
//task 1: 1,4,5,8,9
//task 2: 3,5,7,8,10
//task 3: 2,4,6,9,10
//task 4: 1,3,6,7,8
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
  //1.1
  public double fraction(double x){
    return x - (int)x;
  }
  //1.4
  public boolean isPositive (int x){
    return x >= 0;
  }
  //1.5
  public boolean is2Digits (int x){
    int modx = Math.abs(x);
    return modx > 9 && modx < 100;
  }
  //1.8
  public boolean isDevisor(int a, int b){
    return a == 0 || b == 0 || (a % b == 0 || b % a == 0);
  }
  //1.9
  public boolean isEqual(int a, int b, int c){
    return a == b && b == c;
  }

  //2.3
  public boolean is35 (int x){
    return x % 3 == 0 ^ x % 5 == 0;
  }
  //2.5
  public int max3(int a, int b,  int c){
    if (a >= b && a >= c) return a;
    else if (b >= c) return b;
    else return c;
  }
  //2.7
  public int sum2(int a, int b){
    int c = a + b;
    if (c > 9 && c < 20) return 20;
    else return c;
  }
  //2.8
  public String age(int x){
    int rem = x % 10;
    if (rem == 1 && x != 11) return x + " год";
    else if (rem < 5 && (x < 11 || x > 14)) return x + " года";
    else return x + " лет";
  }
  //2.10
  public void printDays(String x){
    String days = "";
    switch (x){
      case "понедельник": days = days + "понедельник\n";
      case "вторник": days = days + "вторник\n";
      case "среда": days = days + "среда\n";
      case "четверг": days = days + "четверг\n";
      case "пятница": days = days + "пятница\n";
      case "суббота": days = days + "суббота\n";
      case "воскресенье": days = days + "воскресенье\n";
        break;
      default:
        days = "это не день недели";
        break;
    }
    System.out.print(days);
  }



  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Main m = new Main();
    /*
    System.out.println("1.1 Fraction");
    double a11 = m.checkInputDouble(sc,"x");
    System.out.println(m.fraction(a11));

    System.out.println("1.4 isPositive");
    int a14 = m.checkInputInt(sc, "x");
    System.out.println(m.isPositive(a14));

    System.out.println("1.5 is2Digit");
    int a15 = m.checkInputInt(sc, "x");
    System.out.println(m.is2Digits(a15));

    System.out.println("1.8 isDevisor");
    int a18 = m.checkInputInt(sc, "a");
    int b18 = m.checkInputInt(sc, "b");
    System.out.println(m.isDevisor(a18, b18));

    System.out.println("1.9 isEqual");
    int a19 = m.checkInputInt(sc, "a");
    int b19 = m.checkInputInt(sc, "b");
    int c19 = m.checkInputInt(sc, "c");
    System.out.println(m.isEqual(a19,b19,c19));*/
    /*
    System.out.println("2.3 is35");
    int a23 = m.checkInputInt(sc, "x");
    System.out.println(m.is35(a23));

    System.out.println("2.5 max3");
    int a25 = m.checkInputInt(sc, "a");
    int b25 = m.checkInputInt(sc, "b");
    int c25 = m.checkInputInt(sc, "c");
    System.out.println(m.max3(a25,b25,c25));

    System.out.println("2.7 sum2");
    int a27 = m.checkInputInt(sc, "a");
    int b27 = m.checkInputInt(sc, "b");
    System.out.println(m.sum2(a27,b27));

    System.out.println("2.8 age");
    int a28 = m.checkInputInt(sc, "x");
    System.out.println(m.age(a28));

    System.out.println("2.10 printDays");
    System.out.print("x = ");
    String s210 = sc.next();
    m.printDays(s210);*/
  }
}