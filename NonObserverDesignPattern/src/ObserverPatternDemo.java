public class ObserverPatternDemo {
   public static void main(String[] args) {

      HexaObserver hexa = new HexaObserver();
      OctalObserver octal = new OctalObserver();
      BinaryObserver binary = new BinaryObserver();

      System.out.println("First state change: 15");
      hexa.setState(15);
      octal.setState(15);
      binary.setState(15);
      hexa.printString();
      octal.printString();
      binary.printString();
      System.out.println("Second state change: 10");
      hexa.setState(10);
      octal.setState(10);
      binary.setState(10);
      hexa.printString();
      octal.printString();
      binary.printString();
   }
}