class dice {
  public static void main(String[] args) {
    System.out.println("Rolling dice...");
    int dice1 = new.java.util.Random().nextint(7) + 1;
    int dice2 = new.java.util.Random().nextint(7) + 1;
    int number = dice1 + dice2;
    System.out.println("Die1 : " + dice1);
    Syetem.out.println("Die2 : " + dice2);
    if(number > 7) {
	System.out.println("You won");
    }else {
	System.out.println("You lost");
    }
  }
}
