public class Pow {
  public static void pow(float x, int y) {
    double num = 1;
    boolean det = true;
    if (y > 0) {
      for (int i = 1; i <= y; i++) {
        num = num * x;
      }
    }
    else if (y == 0) {
      if (x == 0) {
        det = false;
      }
      num = 1;
    }
    else {
      for (int i = -1; i >= y; i--) {
        num = num * x;
      }
      num = 1/num;
    }
    System.out.println();
    if (det) {
      if (y > 0) {
        if (y % 10 == 1) {
          System.out.println(x + " raised to the " + y + "st power equals to " + num);
        }
        else if (y % 10 == 2) {
          System.out.println(x + " raised to the " + y + "nd power equals to " + num);
        }
        else if (y % 10 == 3) {
          System.out.println(x + " raised to the " + y + "rd power equals to " + num);
        }
        else {
          System.out.println(x + " raised to the " + y + "th power equals to " + num);
        }
      }
      else {
        System.out.println(x + " raised to the power of " + y + " equals to " + num);
      }
    }
    else {
      System.out.println("No agreed-upon value to zero to the power of zero!");
    }
  }
}
