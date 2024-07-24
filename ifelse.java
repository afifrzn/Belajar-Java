public class ifelse {
  public static void main(String[] args) {
    int x = 9;
    int y = 8;
    int z = 10;
    int a = x + y;
    int b = z + x;
    int c = z + y;

    if (b < c) {
      System.out.println("Is greater");
    } else if (a < c) {
      System.out.println("Is smaller");
    }

  }
}