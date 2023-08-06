package myProject;

import java.util.Scanner;

//각 항목의 동작들(CRUD)
public class MainProcess {

  public static BookData bookData = new BookData();//여기 책과 책만들기가있음

////////////////////////////////////////////////////////////////////////////////////////

  public static void booklistview() {

    System.out.println();
    System.out.println();
    System.out.println();

    for (int i = 0; i < bookData.bookEntityArrayList.size(); i++) {
      bookData.bookEntityArrayListview(i);

    }

  }


  public void booklistPickview() {
    Scanner sc6 = new Scanner(System.in);
    System.out.println("검색할 책 번호입력 : ");

    int a = sc6.nextInt();

    for (int i = 0; i < bookData.bookEntityArrayList.size(); i++) {
      if (a == bookData.bookEntityArrayList.get(i).getBookNumber()) {
        bookData.bookEntityArrayListview(i);
      }
    }


  }


  public void bookInsert() {
    Scanner sc5 = new Scanner(System.in);

    while (true) {

      BookData book = bookData.creatBook();//creatBook()은 book을 리턴함 -> 리턴한걸 book으로 담음
      bookData.bookStorageMake(book);//위에서 만든bookData 타입의book을 서랍에 넣음

      System.out.println("추가하겠습니까?");
      System.out.println("네:1 / 아니요:2");
      int i = sc5.nextInt();

      if (i == 1) {
        System.out.println("책정보입력");

      } else if (i == 2) {
        System.out.println("처음으로 돌아갑니다");
        break;

      } else {
        System.out.println("1과 2중에 입력해주세요");
        continue;
      }
    }
  }

  public void bookIO() {
    System.out.println("대출,반납할 책 번호를 입력해주세요:");
    Scanner sc6 = new Scanner(System.in);
    int a = sc6.nextInt();

    for (int i = 0; i < bookData.bookEntityArrayList.size(); i++) {
      if (a == bookData.bookEntityArrayList.get(i).getBookNumber()) {
        if (bookData.bookEntityArrayList.get(i).BookLoanTest() == true) {
          System.out.println(a + "번 책을대출하시려면 'yes'를 입력하세요");
          String yes1 = sc6.next();
          if (yes1.equals("yes")) {
            bookData.setBookEBooleanStatus(i, false);
            System.out.println("!!!!!" + a + "번 책을대출했습니다!!!!");
            System.out.println();
            System.out.println();
            break;
          } else {
            break;

          }
        }
        if (bookData.bookEntityArrayList.get(i).BookLoanTest() == false) {
          System.out.println(a + "번 책을반납하시려면 'no'를 입력하세요");
          String no1 = sc6.next();
          if (no1.equals("no")) {
            bookData.setBookEBooleanStatus(i, true);
            System.out.println("!!!!!" + a + "번 책을반납했습니다!!!!!");
            System.out.println();
            System.out.println();
            break;
          }

        } else {
        }
        break;

      }


    }
  }

  public void bookDEL() {
    System.out.println("제거할 책 번호 입력");
    Scanner sc7 = new Scanner(System.in);
    int a = sc7.nextInt();

    for (int i = 0; i < bookData.bookEntityArrayList.size(); i++) {
      if (a == bookData.bookEntityArrayList.get(i).getBookNumber()) {
        bookData.bookEntityArrayList.remove(i);
      }
    }
    System.out.println(a + "번 책 제거 완료!!");

  }
}



