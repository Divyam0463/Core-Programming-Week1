public class nullPointerE {
  static void generateException(){
    String text = null ; 
    try{
      System.out.println(text.length()-1);
    }
    catch (Exception e) {
      System.err.println("Null PointerException caught. "+e.getMessage());

    }
  }
  public static void main(String[] args) {
    generateException() ; 
  }
}
