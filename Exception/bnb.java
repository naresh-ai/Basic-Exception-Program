package Exception;

public class bnb {
    public static void main(String[] args) {
            try {
                int b=Integer.parseInt("ABC");
                System.out.println("Test");

            }catch (NumberFormatException e){
                System.out.println("Exception e");
            }
    }
}
