import java.util.Random;
 
public class randomdadu{
    public static void main(String[] args){     
            for (int j=0;j<15; j++){
                Random r = new Random();
                char huruf = (char) (r.nextInt(6)+'1');
                System.out.print(huruf+" ");
            }
            System.out.println();
    }
}
