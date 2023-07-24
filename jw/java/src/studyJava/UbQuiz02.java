package studyJava;

public class UbQuiz02 {

  public static void main(String[] args) {
    int a = (int) (Math.random() * 6 + 1);
    int b = (int) (Math.random() * 6 + 1);

    while (a + b != 5) {
      System.out.println("(" + a + "," + b + ")");
      a = (int) (Math.random() * 6 + 1);
      b = (int) (Math.random() * 6 + 1);

      continue;
    }
    System.out.println("!!!(" + a + "," + b + ")!!!");

  }
}
