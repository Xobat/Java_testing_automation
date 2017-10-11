

public class Equation {
  private final int a;
  private final int b;
  private final int c;

  private int n;

  public Equation(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;

    double d = b * b - 4 * a * c;

    if (a == 0 && b == 0 && c == 0) {
      n = -1;
    } else if (a == 0 && b == 0 && c != 0) {
      n = 0;
    } else if (a == 0 && b != 0 && c != 0) {
      n = 1;
    } else if (d > 0){
      n = 2;
    } else if (d < 0) {
      n = 0;
    } else {
      n = 1;
    }
  }

  public int rootNumber() {
    return n;
  }
}
