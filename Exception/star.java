package Exception;

public class star
{
    public static void main(String[] args){
        int a=5;
        for (int i=0;i<a;i++){

            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<a;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
