package ch9;
/*
  문자열에서 의미있는 정보 추출하기
 */

public class StringEx7 {

  public static void main(String[] args) {
    String fullName = "Hello.java";

    int index = fullName.indexOf('.');

    //file 명 추출하기
    //substring() 에서 두 번째 매개변수의 위치의 요소값은 포함이 되지 않음
    String fileName = fullName.substring(0,index);

    //확장자 추출
    String ext = fullName.substring(index +1 ); // 시작위치만 있으면 되서 에 . 다음이라 +1해줌

    System.out.println("파일명 : " + fileName);
    System.out.println("확장자 : " + ext);
  }

}
