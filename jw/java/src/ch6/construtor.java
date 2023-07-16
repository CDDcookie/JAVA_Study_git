package ch6;

//data1에는 생성자선언이 없으므로 data1에는
class Data1 {

  int value;
}

//Data2에는 매개변수가 있는 생성자를 명시적으로 구현
class Data2 {

  int value;

  Data2() {

  }

  Data2(int x) {
    value = x;
  }
}


public class construtor {

  public static void main(String[] args) {

    //Data1이라는 생성자는 명시적으로 구현되지 않았지만
    //에러가 발생하지 않는 이유는 컴파일러가 기본생성자를 알아서 넣어줬기때문
    Data1 d1 = new Data1();

    //d2클레스에는 명시적으로 구현한 생성자가 있는경우
    //컴파일러가 기본생성자를 기본으로 넣어주지 않는다
    //만약, 기본생성자를 사용하고 싶으면 직접 추가해야됨
    //// Data2 d2 = new Data2();
  }
}
