package myProject;

import java.util.ArrayList;


//만든 책을 배열책장에 저장하기
public class BookDataSave {

//  BookData book = new BookData();//책 객세생성하고


  ArrayList<BookData> bookEntityArrayList = new ArrayList<BookData>();//배열생성
  //이 클래스로 객체를 만들면 책장이생김


  public ArrayList<BookData> bookStorageMake(BookData book) {
    bookEntityArrayList.add(0, book);//배열에 책넣기
    return bookEntityArrayList;//책장을 반환 (책)타입맞추고
  }//이게실행되면 책장에 책 넣기


  public void bookEntityArrayListview(int i) {

    System.out.println(bookEntityArrayList.get(i).toString());


  }

}

