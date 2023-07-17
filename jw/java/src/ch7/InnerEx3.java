package ch7;
/*
  Outer class에 선언된 인스턴스 변수 및 클레스 변수를
  Inner class에서 사용하는 예제.
*/

public class InnerEx3 {//Outer class

  //Outer class의 변수
  private int outerIv =0;
  static  int outerCv =0;

  //Inner class
  class InstanceInner {
    //인스턴스변수
    int iiv =outerIv;
    int iiv2 =outerCv;

  }

  static class staticInner{
    int siv =0;
    //int siv2 = outerIv; //Outer class의 인스턴스 변수를 사용할수 없음
                        //Outer class 가 객체가 생성이 되지 않았을 수 도 있기때문에
                        //그래서 Outer class의 객체를 생성한 후 사용하라는 의미
    static int scv = outerCv;

  }

  void myMethod(){
    int lv =0;
    final int LV =0; //책기준이다 /JDK 1.8이전버전일경우
    int LV2 =0; //JDK 1.8부터는 final 생략가능핟

    //local class
    class LocalInner{
      int liv =outerIv;
      int liv2 =outerCv;

      int liv3 =lv;
      int liv4 =LV;
      int liv5 =LV2;

    }
  }

  public static void main(String[] args) {



  }

}
