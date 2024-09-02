package Exception;

public class catchblock {


        public static void main(String[] args) {

            try{
                String s=null;
                System.out.println(s.length());
               // FileInputStream fis = New  FileInputStream("c:/data/picture/memory");
                System.out.println("file reached");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception occurs");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBounds Exception occurs");
            }
            catch(Exception e)
            {
                System.out.println("ok done");
            }
            System.out.println("final Output");
        }
    }

