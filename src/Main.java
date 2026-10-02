import java.util.Arrays;
import java.util.Random;
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

  public int checkInputPosInt(Scanner sc, String name){
    int a = 0;
    boolean gotNumber = false;
    System.out.print(name + " = ");

    while (!gotNumber) {
      String str = sc.next();
      try {
        a = Integer.parseInt(str);
        if (a >= 0) {
          gotNumber = true;
        } else {
          System.out.println("This is not a positive integer!");
          System.out.print(name + " = ");
        }
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
    return x > 0;
  }
  //1.5
  public boolean is2Digits (int x){
    int modx = Math.abs(x);
    return modx > 9 && modx < 100;
  }
  //1.8
  public boolean isDevisor(int a, int b){
    if (a == 0 && b == 0) return false;
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
    int x;
    if (a >= b) x = a;
    else x = b;
    if (c >= x) x = c;
    return x;
  }
  //2.7
  public int sum2(int a, int b){
    int c = a + b;
    if (c > 9 && c < 20) return 20;
    else return c;
  }
  //2.8
  public int numType(int x){
    int rem = x % 10;
    if(x > 10 && x < 15) return 3;
    if (rem == 1) return 1;
    else if (rem < 5) return 2;
    else return 3;
  }
  public String age(int x){
    int rem = x % 10;
    if(x > 10 && x < 15) return x + " лет";
    if (rem == 1) return x + " год";
    else if (rem < 5) return x + " года";
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
        days = "это не день недели\n";
        break;
    }
    System.out.print(days);
  }

  //3.2
  public String reverseListNums(int x){
    String reverse = "";
    for (int i = x; i >= 0; i--) {
      reverse += i + " ";
    }
    reverse = reverse.trim();
    return reverse;
  }
  //3.4
  public int pow(int x, int y){
    int res = 1;
    for (int i = 0; i < y; i++) {
      res *= x;
    }
    return res;
  }
  //3.6
  public boolean equalNum(int x){
    boolean check = true;
    int t = x;
    int c = t % 10;
    t = t / 10;
    while (t > 0 && check){
      if (t % 10 != c) check = false;
      t = t / 10;
    }
    return check;
  }
  //3.9
  public void rightTriangle(int x){
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        if (j < x-i-1) System.out.print(" ");
        else System.out.print("*");
      }
      System.out.println();
    }
  }
  //3.10
  public int inputIntGuess(Scanner sc){
    int a = 0;
    boolean gotNumber = false;

    while (!gotNumber) {
      String str = sc.next();
      try {
        a = Integer.parseInt(str);
        if(a >= 0 && a < 10) gotNumber = true;
        else {
          System.out.println("Нужно ввести число от 0 до 9:");
        }
      } catch (Exception e) {
        System.out.println("Нужно ввести число от 0 до 9:");
      }
    }
    return a;
  }
  public void guessGame(){
    Scanner sc = new Scanner(System.in);
    Main m = new Main();
    boolean gotanswer = false;
    int tries = 0;
    int guess, x;
    Random random = new Random();
    System.out.println("Введите число от 0 до 9:");
    do {
      guess = random.nextInt(10);
      //System.out.println("Тайное число: "+ guess); для лёгкой проверки
      x = m.inputIntGuess(sc);
      tries++;
      if (guess == x) gotanswer = true;
      else {
        System.out.println("Вы не угадали, введите число от 0 до 9:");
      }
    } while (!gotanswer);
    System.out.println("Вы угадали!");
    String outtries = " ";
    int t = m.numType(tries);
    switch (t){
      case 1:
        outtries = outtries + "попытку";
        break;
      case 2:
        outtries = outtries + "попытки";
        break;
      case 3:
        outtries = outtries + "попыток";
        break;
      default:
        break;
    }
    System.out.println("Вы отгадали число за "+ tries + outtries);
  }
  
  public void inputArray(int[] arr, Scanner sc){
    System.out.println("Заполните массив");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = checkInputInt(sc,"["+i+"]");
    }
  }

  //4.1
  public int findFirst(int[] arr, int x){
    int pos = -1;
    boolean found = false;
    for (int i = 0; i < arr.length && !found; i++) {
      if (arr[i] == x) {
        pos = i;
        found = true;
      }
    }
    return pos;
  }
  //4.3
  public int maxAbs (int[] arr){
    if (arr.length == 0){
      System.out.println("Пустота пуста.");
      return 0;
    }
    int maxAbsi = 0;
    for (int i = 1; i < arr.length; i++) {
      if (Math.abs(arr[i]) > Math.abs(arr[maxAbsi])){
        maxAbsi = i;
      }
    }
    return arr[maxAbsi];
  }
  //4.6
  public void reverse (int[] arr){
    for (int i = 0; i < arr.length/2; i++) {
      int tmp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = tmp;
    }
  }
  //4.7
  public int[] reverseBack (int[] arr){
    int[] newarr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newarr[i] = arr[arr.length-1-i];
    }
    return newarr;
  }
  //4.8
  public int[] concat (int[] arr1,int[] arr2){
    int[] newarr = new int[arr1.length+arr2.length];
      System.arraycopy(arr1, 0, newarr, 0, arr1.length);
      System.arraycopy(arr2, 0, newarr, arr1.length, arr2.length);
    return newarr;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Main m = new Main();
    double d;
    int a,b,c,x,y;
    String s;

    System.out.println("1.1 Fraction");
    d = m.checkInputDouble(sc,"x");
    System.out.println(m.fraction(d));

    System.out.println("1.4 isPositive");
    x = m.checkInputInt(sc, "x");
    System.out.println(m.isPositive(x));

    System.out.println("1.5 is2Digit");
    x = m.checkInputInt(sc, "x");
    System.out.println(m.is2Digits(x));

    System.out.println("1.8 isDevisor");
    a = m.checkInputInt(sc, "a");
    b = m.checkInputInt(sc, "b");
    System.out.println(m.isDevisor(a, b));

    System.out.println("1.9 isEqual");
    a = m.checkInputInt(sc, "a");
    b = m.checkInputInt(sc, "b");
    c = m.checkInputInt(sc, "c");
    System.out.println(m.isEqual(a,b,c));

    System.out.println("2.3 is35");
    x = m.checkInputInt(sc, "x");
    System.out.println(m.is35(x));

    System.out.println("2.5 max3");
    a = m.checkInputInt(sc, "a");
    b = m.checkInputInt(sc, "b");
    c = m.checkInputInt(sc, "c");
    System.out.println(m.max3(a,b,c));

    System.out.println("2.7 sum2");
    a = m.checkInputInt(sc, "a");
    b = m.checkInputInt(sc, "b");
    System.out.println(m.sum2(a,b));

    System.out.println("2.8 age");
    x = m.checkInputInt(sc, "x");
    System.out.println(m.age(x));

    System.out.println("2.10 printDays");
    System.out.print("x = ");
    s = sc.next();
    m.printDays(s);

    System.out.println("3.2 reverseListNums");
    x = m.checkInputPosInt(sc, "x");
    System.out.println(m.reverseListNums(x));

    System.out.println("3.4 pow");
    x = m.checkInputInt(sc, "x");
    y = m.checkInputPosInt(sc, "y");
    System.out.println(m.pow(x,y));

    System.out.println("3.6 equalNum");
    x = m.checkInputPosInt(sc, "x");
    System.out.println(m.equalNum(x));

    System.out.println("3.9 rightTriangle");
    x = m.checkInputPosInt(sc, "x");
    m.rightTriangle(x);

    System.out.println("3.10 guessGame");
    m.guessGame();


    int l,pos, elem;
    int[] task, task2;
    System.out.println("Введите длину массива:");
    l = m.checkInputPosInt(sc, "Длина массива");
    task = new int[l];
    m.inputArray(task, sc);

    System.out.println("4.1 findFirst");
    x = m.checkInputInt(sc, "x");
    pos = m.findFirst(task, x);
    System.out.println("Результат: " + pos);

    System.out.println("4.3 maxAbs");
    elem = m.maxAbs(task);
    System.out.println("Результат: " + elem);

    System.out.println("4.6 reverse");
    m.reverse(task);
    System.out.println("Результат: "+Arrays.toString(task));

    System.out.println("4.7 reverseBack");
    task2 = m.reverseBack(task);
    System.out.println("Результат: "+Arrays.toString(task2));

    System.out.println("4.8 concat");
    System.out.println("Введите длину массива 1:");
    l = m.checkInputPosInt(sc, "Длина массива");
    task = new int[l];
    m.inputArray(task, sc);
    System.out.println("Введите длину массива 2:");
    l = m.checkInputPosInt(sc, "Длина массива");
    task2 = new int[l];
    m.inputArray(task2, sc);
    System.out.println("Результат: "+Arrays.toString(m.concat(task, task2)));
  }
}