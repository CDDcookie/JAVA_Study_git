package Quiz;

class CoffeeMachine5 {

  final static int COFFEEBEANS_PER_COFFEE = 5;
  private final int shots;
  private int coffeeBeans;

  public CoffeeMachine5(int shots) {
    this.shots = shots;
  }

  public void fillCoffeeBeans(int coffeeBeans) {
    System.out.println("원두를 넣는 중...");
    this.coffeeBeans = coffeeBeans;
  }

  private boolean grindCoffeeBeans() {
    if (this.coffeeBeans - COFFEEBEANS_PER_COFFEE >= 0) {
      System.out.println("원두를 가는 중...");
      return false;
    }

    System.out.println("원두가 부족합니다.");
    return true;
  }

  private void preHeatWater() {
    System.out.println("물 끓이는 중...");
  }

  private void extract() {
    System.out.printf("%d샷 커피를 만드는 중...\n", this.shots);
  }

  public void makeCoffee() {
    if (this.grindCoffeeBeans()) {
      return;
    }

    this.preHeatWater();
    this.extract();
  }
}


public class Quiz_05 {

  public static void main(String[] args) {
    CoffeeMachine5 coffeeMachine = new CoffeeMachine5(5);

    coffeeMachine.fillCoffeeBeans(20);
    coffeeMachine.makeCoffee();
  }
}