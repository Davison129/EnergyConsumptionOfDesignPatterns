public class TemplatePatternDemo {
   public static void main(String[] args) {

      Cricket cricket = new Cricket();
      cricket.initialize();
      cricket.startPlay();
      cricket.endPlay();
      
      System.out.println();
      
      Football football = new Football();
      football.initialize();
      football.startPlay();
      football.endPlay();		
   }
}