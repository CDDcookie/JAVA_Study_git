package studyJava;

public class UbClass02 {

  int n = 10;

  int aMethod() {
    int sum = 0;
    for (int i = 0; i < 11; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {

    UbClass02 jjw = new UbClass02();
    int i = jjw.aMethod();
    System.out.println(i);
  }
}

