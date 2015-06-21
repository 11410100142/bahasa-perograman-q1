import java.util.*;
public class BilanganAcak {
    public static void main(String []args) {
        byte Bilacak[] = new byte [3];

        Random rnd = new Random();
        rnd.nextBytes(Bilacak);
        System.out.println("nilai bilangan awal :");
        for (int i = 0; i < Bilacak.length; i++)
        System.out.println(Bilacak[i]);
        System.out.println();

     //mengurutkan bilangan
        for(int a = 0;
            int j= a;
            int B = Bilacak[a];
            while ((j>1)&&(Bilacak[j-1]> B)){
                Bilacak[j]= Bilacak[j-1];
                j--;
            }
            Bilacak[j] = (byte) B;
        }
        System.out.println("Nilai setelah diurutkan :");
        for(int a = 0; a < Bilacak.length ; a++){
            System.out.println(Bilacak[a]);
            System.out.println();
        }
    }
}
