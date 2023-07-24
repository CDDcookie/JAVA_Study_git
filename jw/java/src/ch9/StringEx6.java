package ch9;

public class StringEx6 {

  public static void main(String[] args) {

    //기본형을 문자열로 변환
    int iVal =100;
    String strVal = String.valueOf(iVal);

    double dVal = 200.0;
    String strVal2 = dVal +""; //기본형을 문자열로 변환

    //문자열을 기본형으로 변환
    Integer.parseInt("+" + strVal); //문자열에 부호가 포함된 경우 /부호가 있어도 변환가능하다
    Double.parseDouble(strVal2);
  }

}
