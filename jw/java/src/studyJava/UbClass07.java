package studyJava;

public class UbClass07 {

  public void getHiddenData(String name,String id,String phone){

    String name2 =name.substring(0,1);
    String id2 = id.substring(0,8);
    String phone2 =phone.substring(0,9);

    System.out.print("이름 : " + name2 );
    for (int i = 1; i < name.length(); i++) {
      System.out.print("*");
    }

    System.out.println();
    System.out.print("주민등록번호 : " + id2);
    for (int i = 1; i < id.length()-7; i++) {
      System.out.print("*");
    }

    System.out.println();
    System.out.print("전화번호 : " +phone2);
    for (int i = 1; i < phone.length()-8; i++) {
      System.out.print("*");
    }
  }

  public static void main(String[] args) {

    UbClass07 jw =new UbClass07();

    jw.getHiddenData("김유범","971204-1234567","010-1234-5678");

  }

}
