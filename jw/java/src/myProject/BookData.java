package myProject;

import java.util.ArrayList;
import java.util.Scanner;

//책을 정의,생성
public class BookData {

  ArrayList<BookData> bookEntityArrayList = new ArrayList<BookData>();//배열생성
  private int bookNumber = 0;  //초기화
  private String bookName = "";
  private boolean bookLoan = true;

  public BookData() {//기본생성자 다시만듬
  }

  //책에 값넣기/인자3짜리 책생성자
  public BookData(int setBookNumber, String setBookName,
      boolean setBookLoan) {
    this.bookNumber = setBookNumber;
    this.bookName = setBookName;
    this.bookLoan = setBookLoan;
  }

  public boolean BookLoanTest() {//arraylist.get()으로 가져오기위해만듬
    return bookLoan;
  }

  public void setBookEBooleanStatus(int index,
      boolean status) {//arraylist배열안 객체의 맴버boolean값을 수정하기위해 만듬
    bookEntityArrayList.get(index).setBookLoan(status);
  }


  @Override
  public String toString() {
    return "BookData{" +
        "bookNumber=" + bookNumber +
        ", bookName=" + bookName +
        ", bookLoan=" + bookLoan +
        '}';
  }

  //걍 여기서 책만들기 메서드
  public BookData creatBook() {
    Scanner sc = new Scanner(System.in);
    int setBookNumber = sc.nextInt();
    String setBookName = sc.next();//hasnext
    boolean setBookLoan = sc.nextBoolean();

    BookData book = new BookData(setBookNumber, setBookName, setBookLoan);
    return book;

  }//!!여기서 배열을 하지말고 creatBook에선 딱 책만 받아온 값으로 책을 만들고 책을 다른곳에서 책장에 넣자
  //이 클래스로 객체를 만들면 책장이생김

  public ArrayList<BookData> bookStorageMake(BookData book) {
    bookEntityArrayList.add(0, book);//배열에 책넣기
    return bookEntityArrayList;//책장을 반환 (책)타입맞추고
  }//이게실행되면 책장에 책 넣기


  public void bookEntityArrayListview(int i) {

    System.out.println(bookEntityArrayList.get(i).toString());
  }

  public int getBookNumber() {
    return bookNumber;
  }

  public void setBookNumber(int bookNumber) {
    this.bookNumber = bookNumber;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public boolean isBookLoan() {
    return bookLoan;
  }

  public void setBookLoan(boolean bookLoan) {
    this.bookLoan = bookLoan;
  }
}


