package studyJava;

public class UbClass01 {
  int n = 10;

int aMethod2() {

    for (int i = 1; i < 11; i++) {
      System.out.println(i);
    }
    return 0; //이게있어야 int반환하네
  }
  public static void main(String[] args) {

    UbClass01 jjw2 = new UbClass01();
    int i2 = jjw2.aMethod2();


  }

}

