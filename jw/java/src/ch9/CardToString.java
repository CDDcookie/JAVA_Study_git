package ch9;//454

public class CardToString {

  public static void main(String[] args) {
    //2
    Card c1 = new Card();
    Card c2 = new Card();
    System.out.println(c1.toString());
    System.out.println(c2.toString());
  }


}


//1
class Card {
  String kind;
  int number;

  Card(){
    this("SPADE" ,1);//기본생성자 도 수정해주기
  }
  Card(String kind, int number){
    this.kind = kind;
    this.number = number;
  }

  //3
  public String toString(){
    return "kind : " + kind + ", number" + number;
  }

}
