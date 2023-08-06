package myProject;

import java.util.Scanner;

/*
------UI-------
 1.책 넣기 (C)
 2.책 검색출력(R)
 3.책 전체출력(R)
 4.책 빌리기,반납(U)
 5.책 빼기(D)
 6.종료
  */
public class App {

  public static void main(String[] args) {
    BookData bookData = new BookData();
    MainProcess mainProcess = new MainProcess();

    while (true) {
      System.out.println("===================================");
      System.out.println(" 도서 관리 프로그램");
      System.out.println(" 1.책 넣기/2.책 검색출력/3.책 전체출력/ 4.책 빌리기,반납/ 5.책 빼기 / 6.종료하기");
      System.out.println("===================================");

      System.out.print("선택할 항목의 숫자를 입력해주세요 : ");
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();

      if (i == 1) {
        System.out.println(" 1.넣을 책 정보를 입력하세요");
        mainProcess.bookInsert();

      } else if (i == 2) {
        System.out.println("2.책 번호로 검색");
        mainProcess.booklistPickview();

      } else if (i == 3) {
        System.out.println("3.책 전체 목록을 보여줍니다");
        mainProcess.booklistview();

      } else if (i == 4) {
        System.out.println("4.책을 반납,대출합니다");
        mainProcess.bookIO();

      } else if (i == 5) {
        System.out.println("5.버릴책을 선택해주세요");
        mainProcess.bookDEL();

      } else if (i == 6) {
        System.out.println("6.종료합니다");

        break;
      } else {
        System.out.println("! 1~5까지 중에 선택해주세요 !");
        System.out.println();
        System.out.println();
        continue;
      }
      System.out.println();
      System.out.println();
      System.out.println("===================================");


    }


  }
}
