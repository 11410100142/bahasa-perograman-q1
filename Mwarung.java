import java.io.*;
import java.util.Scanner; //untuk class buffered reader
class Mwarung{
  
public static void main(String []args)throws  IOException
{
 Scanner sc= new Scanner(System.in);
 boolean selesai=false;
 int total=0;
 int pil=0;
 String[] DAFTAR_MENU = {"Soto Daging","Lontong Kikil", "Rawon", "Nasi Goreng"};
 int[] DAFTAR_HARGA = {10000,12000,3000,2500};

 do{ int harga=0;
     String namaMenu=" ";
     System.out.println(" ");
   
     for(int i=0;i<DAFTAR_MENU.length;i++)
       System.out.println((i+1)+" " + DAFTAR_MENU[i]);
   
    System.out.print("MASUKKAN PIIHAN ANDA [1-5] ");
    pil=sc.nextInt();
    harga=DAFTAR_HARGA[pil];
    namaMenu=DAFTAR_MENU[pil];
   
    if(harga!=0){
     System.out.print("Masukkan jumlah porsi: ");
     int porsi=sc.nextInt();
    }
   
  switch(pil){
   case 0: break;
   case 1: harga=10000; break;
   case 2: harga=12000; break;
   case 3: harga=3000; break;
   case 4: harga=2500; break; 
  }
   
  switch(harga){
   case 1:
   System.out.println();
   System.out.println("=========================");
   System.out.println("  Harga 10000 \t");
   System.out.println("=========================");
   System.out.print("Menu Makanan : ");
   System.out.print(namaMenu);
   
   case 2:
   System.out.println();
   System.out.println("=========================");
   System.out.println("  Harga 12000 \t");
   System.out.println("=========================");
   System.out.println("Menu Makanan : ");
   System.out.print(namaMenu);
  
  case 3:
   System.out.println();
   System.out.println("=========================");
   System.out.println("  Harga 3000 \t");
   System.out.println("=========================");
   System.out.println("Menu Makanan : ");
   System.out.print(namaMenu);
  
  case 4:
  System.out.println();
  System.out.println("=========================");
  System.out.println("  Harga 2500 \t");
  System.out.println("=========================");
  System.out.println("Menu Makanan : ");
  System.out.print(namaMenu);
  break; 
  default: break;
   }
  }
 while(pil<6);}
}

   
