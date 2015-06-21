import java.util.Scanner;
public class LuasVolum {
    Scanner input = new Scanner(System.in);
public tugas7(){
    menu();}
public void menu(){
    clean();
    System.out.println("\n====== MENU UTAMA ======");
    System.out.println("| 1. Hitung Luas       |");
    System.out.println("| 2. Hitung Voume      |");
    System.out.println("| 0. Exit              |");
    System.out.println("========================\n");
    System.out.print  ("Masukkan Pilihan :  ");
       int pil = input.nextInt();
       switch(pil){
           case 1:
           try{
               menuLuas();
               }catch(IndexOutOfBoundsException ex){
                   System.out.println("Ada Kesalahan pada proses IO!!!");
            }
        
            
        case 2:
           try{
               menuVolume();
               }catch(IndexOutOfBoundsException ex){
                   System.out.println("Ada Kesalahan pada proses IO!!!");
            }
            
            
        default:
        System.exit(0);
        break;
    }

}
       
public void clean(){
           for(int i=0;i<=40;i++){
               System.out.println("\n");
           }
       }
public void tanya(){
    System.out.println(" ------------------- ");
    System.out.println(" ___________________ ");
    System.out.println(" Anda ingin kemana : ");
    System.out.println(" 1. Menu Utama   ");
    System.out.println(" 2. Menu Luas    ");
    System.out.println(" 3. Menu Volume  ");
    System.out.println(" 0. Selesai      ");
    System.out.print("Masukkan Pilihan : ");
    int pil = input.nextInt();
    switch(pil){
    case 1:
    menu();
    case 2:
    menuLuas();
    case 3:
    menuVolume();
    default:
        System.exit(0);
        break;
    }
}
public void menuLuas(){
       clean();
    System.out.println("\n============ MENU LUAS =========== ");
    System.out.println("| 1. Hitung Luas Segitiga           |");
    System.out.println("| 2. Hitung Luas Lingkaran          |");
    System.out.println("| 3. Hitung Luas Jajargenjang       |");
    System.out.println("| 4. Hitung Luas Persegi Panjang    |");
    System.out.println("| 0. Exit                           |");
    System.out.println("===================================\n");
    System.out.print  ("Masukkan Pilihan :  ");
       int pil = input.nextInt();
       switch(pil){
           case 1:
        clean();
           Lsegitiga();
            tanya();
            
        case 2:
        clean();
           Llingkaran();
            tanya();
        
        case 3:
        clean();
           Ljajargenjang();
            tanya();
        
        case 4:
        clean();
           Lpersegi();
            tanya();            
            
        default:
        System.exit(0);
        break;
    }
}

    public void Lsegitiga(){
    System.out.println("\n~~~~~HITUNG LUAS SEGITIGA~~~~~~");
    System.out.print(" Masukkan Alas   : ");
    float a = input.nextFloat();
    System.out.print(" Masukkan Tinggi : ");
    float b = input.nextFloat();
    float l = (a * b) / 2 ;
    System.out.println(" Luas Segitiga Adalah "+l);
    }
    public void Llingkaran(){
    System.out.println("\n~~~~~HITUNG LUAS LINGKARAN~~~~~~");
    System.out.print(" Masukkan Jari-Jari   : ");
    float j = input.nextFloat();
    float l = 22 * j * j / 7;
    System.out.println("Luas Jari-Jari Adalah "+l);
    }
    public void Ljajargenjang(){
    System.out.println("\n~~~~~HITUNG LUAS JAJARGENJANG~~~~~~");
    System.out.print(" Masukkan Alas   : ");
    float a = input.nextFloat();
    System.out.print(" Masukkan Tinggi : ");
    float b = input.nextFloat();
    float l = a * b;
    System.out.println(" Luas Jajargenjang Adalah "+l);
    }
    public void Lpersegi(){
    System.out.println("\n~~~~~HITUNG LUAS PERSEGI PANJANG~~~~~~");
    System.out.print(" Masukkan Panjang   : ");
    float a = input.nextFloat();
    System.out.print(" Masukkan Lebar : ");
    float b = input.nextFloat();
    float l = a * b ;
    System.out.println(" Luas Persegi Panjang Adalah "+l);
    }
public void menuVolume(){
       clean();
    System.out.println("\n========== MENU VOLUME ========");
    System.out.println("| 1. Hitung Volume Kerucut     |");
    System.out.println("| 2. Hitung Volume Tabung      |");
    System.out.println("| 3. Hitung Volume Balok       |");
    System.out.println("| 4. Hitung Volume Bola        |");
    System.out.println("| 0. Exit                      |");
    System.out.println("==============================\n");
    System.out.print  ("Masukkan Pilihan :  ");
       int pil = input.nextInt();
       switch(pil){
           case 1:
        clean();
           Vkerucut();
            tanya();
            
        case 2:
        clean();
           Vtabung();
            tanya();
        
        case 3:
        clean();
           Vbalok();
            tanya();
        
        case 4:
        clean();
           Vbola();
            tanya();            
            
        default:
        System.exit(0);
        break;
    }
}

    public void Vkerucut(){
    System.out.println("\n~~~~~HITUNG VOLUME KERUCUT~~~~~~");
    System.out.print(" Masukkan Jari-Jari   : ");
    float j = input.nextFloat();
    System.out.print(" Masukkan Tinggi      : ");
    float b = input.nextFloat();
    float v = 1/3 * 22/7 * j * j * b ;
    System.out.println(" Volume Kerucut Adalah "+v);
    }
    public void Vtabung(){
    System.out.println("\n~~~~~HITUNG VOLUME TABUNG~~~~~~");
    System.out.print(" Masukkan Jari-Jari   : ");
    float j = input.nextFloat();
    System.out.print(" Masukkan Tinggi      : ");
    float b = input.nextFloat();
    float v = 22/7 * j * j * b ;
    System.out.println(" Volume Tabung Adalah "+v);
    }
    public void Vbalok(){
    System.out.println("\n~~~~~HITUNG VOLUME BALOK~~~~~~");
    System.out.print(" Masukkan Panjang     : ");
    float a = input.nextFloat();
    System.out.print(" Masukkan Lebar       : ");
    float b = input.nextFloat();
    System.out.print(" Masukkan Tinggi      : ");
    float c = input.nextFloat();
    float v = a * b * c ;
    System.out.println(" Volume Balok Adalah "+v);
    }
    public void Vbola(){
    System.out.println("\n~~~~~HITUNG VOLUME BOLA~~~~~~");
    System.out.print(" Masukkan Jari-Jari     : ");
    float j = input.nextFloat();
    float v = 4/3 * 22/7 * j * j * j ;
    System.out.println(" Volume Bola Adalah "+v);
    }    
       
       public static void main(String[]args){
           new tugas7();
    }
}
