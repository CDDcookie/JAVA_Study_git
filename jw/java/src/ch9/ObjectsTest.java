package ch9;
import  static java.lang.Object.*;
import static java.util.Objects.isNull;

import java.util.Objects;
/*
오브젝트 클레스 활용!
 */

public class ObjectsTest {

  public static void main(String[] args) {

    String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
    String[][] str2D_2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
    String[][] str2D_3 = new String[][]{{"aaa","bbb"},{"AAA1","BBB1"}};

    //equals()
    System.out.println(Objects.equals(args, str2D_2)); //f

    //deepEquals()
    System.out.println(Objects.deepEquals(args, str2D_2)); //t
    System.out.println(Objects.deepEquals(args, str2D_3)); //f

    //isnull() -> null이면 true 반환
    System.out.println(isNull(null)); //t
    System.out.println(isNull(str2D)); //f


  }

}
