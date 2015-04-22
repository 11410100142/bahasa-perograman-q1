# bahasa-perograman-q1
public class PrinterTOC
{ public static String buatDaftarisi(String judulBab, int halaman)
  {String str=judulBab;
   for(int i=str.length();i<70;i++)
     str=str+"-";
   str=str+" "+halaman;
   return str;
  }
  public static void main(String []args)
  // masukkan jumlah bab
    //judul bab 1;
    //judul bab 2;
    //judul bab 3;
    //daftar isi
    //bab 1: judul ........... 2
  { String bab1=buatDaftarisi("Bab 1 : Pengantar Bpro",2);
     System.out.println(bab1);
     String bab2=buatDaftarisi("Bab 2 : Pengantar Antar",15);
     System.out.println(bab2);
  }
}
