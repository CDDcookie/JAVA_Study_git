package studyJava;

import java.util.Scanner;

public class Test2 {///Test2 클래스

//  int sum = 0; //xxxxx


  public static int addMethod(int n) { //매소드선언 //클레스 안에 있어야됨
    int sum = 0; //변수범위가 여기있어야됨 그래야 사용가능 메서드 안에서만 쓸수있으니

    for (int i = 0; i < n + 1; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum; //return이 여기있어야됨 위에있으면 리턴이 반복됨
  }

    public static void main (String[] args){ //실행하는 특이한 메소드고 public class안에 있어야됨


      //public static int addMethod(int n) //여기가 static 일경우는
      int aa = addMethod(1);  //앞에 타입적고 담을 변수선언해서 밑에서 만들어진 객체생성없이 바로 메소드명으로 사용가능

      //-----------------------------------------------------------------------------------------------------------------------

      //public  int addMethod(int n) //여기가 static이 아닐 경우는 이렇게 add객체를 따로만들어줘서 그 객체를 통해 메소드를 이용해야한다
      Test2 add = new Test2();   //add라는 객체는 Test2클레스의 설계도로 만들어진놈이라-> add객체 Test2안의 addMethod메소드를 사용가능
      int aa2 = add.addMethod(1); //바로 아래처럼 addMethod(1)을 넣던가 아니면 따로 aa2같이 변수에 addMethod을 결과를 담아서 하던가
      //System.out.println(addMethod(1));


      System.out.println(aa);
    }
}


