package ch8;

public class NewExceptionTest {

  public static void main(String[] args) {
    //9??????
    try {
      startInstall();//10.뜨로우 와가지고 예러 처리를 여기서 해줘야함 여기선 트라이 멀티케치로 따로해줄거임
      //문제없으면 카피파일하기
    } catch (SpaceException e) {
      System.out.println("에러메세지 : "+e.getMessage()); //12.
     e.printStackTrace();//10
      System.out.println("공간이 부족함으로 공간을 확보한후 재설치 해주세요.");//12.
    } catch (MemoryException me) {
      System.out.println("에러메세지 : "+ me.getMessage()); //12.
     me.printStackTrace();//10
      System.out.println("메모리가 부족함으로 메모리를 확보한후 재설치 해주세요.");//12.
    } finally {
      deleteFile(); //11.성공,실패상관없이 무조건 발생하니 tmp파일 다지우기위해서
    }
  }

  //3.설치시작을위한 준비 메소드 (공간충분??,여유메모리공간있는지??)
  static void startInstall() throws SpaceException, MemoryException {
    if(!enoughSpace()) //7 enoughSpace가 거짓이면 발생안해서 !붙여서 반대로
      throw new SpaceException("설치공간부족"); //Chcked예외라 빨간중뜨는중이라 처리필요-> 트라이 아니면 뜨로우로

    if(!enoughMomory()) //8 enoughMomory가 거짓이면 발생안해서 !붙여서 반대로///Chcked예외라 빨간중뜨는중이라 처리필요-> 트라이 아니면 뜨로우로
      throw new MemoryException("Momory공간부족");
  }


  //4.위가 문제 없으면 local에 복사하기
  static void copyFile() {


  }


  //5.설치 완료 또는 미완료시의 필요없는 file을 삭제하는 메소드
  static void deleteFile() {

  }


  //6.동작테스트를 위한 제어 메소드 (어떨떈 예외발생하고 안하고를 정하기)
  //6-1. 공간제어
  static boolean enoughSpace() {
    return false;
  }

  //6-2. 메모리제어
  static boolean enoughMomory() {
    return false;
  }
}

//1.설치공간이 부족한 경우를 위한 Exception 클레스
class SpaceException extends Exception{
  SpaceException(String msg){//생성자만들기
super(msg);
  }
}




//2.메모리가 부족한 경우를 위한 Exception 클레스
class MemoryException extends Exception{
  MemoryException(String msg){//생성자만들기
    super(msg);
  }
}

