//package ch11;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.*;
//
//public class QueueEx1 {
//
//  //1queue 는 인터페이스임, 인터페이스를 구현한 클래스중에서 하나를 선택해서 사용하면됨
//  static Queue q = new LinkedList();
//
//  //2입력명령어를 이력으로 관리할 사이즈
//  static final int MAX_SIZE = 5;
//
//  public static void main(String[] args) {
//
//    //7 프로그램 종료전까진 무한으로 반복하도록
//    while (true){
//      //8 '입력대기모드'란걸 표시해주기
//      System.out.println(">>");
//
//      try{
//        //9 사용자로 부터 입력받은 명령어를 처리한다
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine().trim(); //공백없에주기로 trim
//
//        //6-1 그냥 앤터를 입력하는 경우 (9에서 밑에있다가 트라이문으로 들어옴,,)
//        if("".equals(input)) continue;
//
//        //6-2 프로그램 종료
//        if(input.equalsIgnoreCase("q")){
//          System.exit(0);
//        }else if(input.equalsIgnoreCase("help")){
//          //6-3 대소문자 구분없이 명령에 대한 설명을 출력
//          System.out.println("help - 도움말 출력 ");
//          System.out.println("Q 또는 q - 프로그램 종료");
//          System.out.println("history - 입력했던 명령어 출력");
//        } else if (input.equalsIgnoreCase("history")) {
//          //6-4 입력된 명령어의 이력을 출력
//
//          save(input);
//          //Interator 를 사용하기 위해, queue 를 List로 변환
//          LinkedList list = (LinkedList)q;
//          //Interator 객체를 취득
//          listIterator lit = list.listIterator();
//          //while을 이용한 요소 출력
//          while (lit.hasNext()) //읽을게 있냐?
//            System.out.println(lit.next());
//
//        }else {//6-5 입력된 명령어를 queue에 저장 => history 로 관리
//          save(input);
//          System.out.println(input);
//        }
//
//
//      }catch (Exception e){
//        System.out.println(" !에러발생! ");
//      }
//
//    }
//
//
//
//
//
//  }
//
//  //3입력명령어의 이력을 관리 => Queue에다가 저장
//  public static void save(String input) {
//    //4입력된 명령어를 queue에 저장
//    if (!"".equals(input)) {//이런경우가 아니면 저장하겠다
//      q.offer(input);
//    }
//    //5최대관리 수량을 넘어가면 ,가장 과거의 명령어를 삭제
//    if (q.size() > MAX_SIZE) {
//      q.remove();
//    }
//  }
//}
