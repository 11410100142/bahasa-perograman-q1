import java.util.*;

public class index1{
	public static Vector<User> tblUser=new Vector<User>();
	public static Vector<Barang> tblBarang=new Vector<Barang>();
	public static Vector<Kasir> tblKasir=new Vector<Kasir>();
	public static Vector<DTransaksi>DTrans = new Vector<DTransaksi>();
	public static Scanner sc=new Scanner(System.in);
	public static boolean selesai=false;
	public static int jml;
	public static String id;
	public static String nama;
	public static int harga;
	public static double total;
	public static String cek;
	
	public static void mainMenuAdmin(){
		int pil;
		do{
			System.out.println("---------Owner---------");
			System.out.println("1. Kelola User");
			System.out.println("2. Kelola Barang");
			System.out.println("3. Lapora Penjualan");
			System.out.println("4. Login");
			System.out.println("5. Keluar");
			System.out.print(" Masukkan menu pilihan (1-5): ");
			pil = sc.nextInt();
			switch(pil){
				case 1:MUser();break;
				case 2:MBarang();break;
				case 3:ReportTransaksi();break;
				case 4:loginUser();break;
				case 5:System.exit(0);break;
			}
		}while(pil<5);
	}
	public static void MUser(){
	int pil;
		do{
		System.out.println("Kelola User");
		System.out.println("1. Tambahkan User");
		System.out.println("2. Hapus User");
		System.out.println("3. Kelola Password");
		System.out.println("4. Tampilkan Semua User");
		System.out.println("5. Kembali Ke Menu Utama");
		System.out.println("");
		pil=bacaInt("Masukkan pilihan anda (1-5) : ");
			switch(pil){
				case 1:add();break;
				case 2:delete();break;
				case 3:changesPassword();break;
				case 4:viewAllUser();break;
				case 5:mainMenuAdmin();break;
			}
		}while(pil!=5);
	}
	public static void MBarang(){
		int pil;
		do{
		System.out.println();
        System.out.println("Kelola Barang");
        System.out.println("1. Add Barang");
        System.out.println("2. Delete Barang");
        System.out.println("3. Update Barang");
        System.out.println("4. View All Barang");
        System.out.println("5. Kembali Ke Menu Utama");
		pil = bacaInt("Masukkan pilihan anda (1-5) : ");
        System.out.println();
            switch(pil){
                case 1:addBarang();break;
                case 2:deleteBarang();break;
                case 3:updateBarang(); break;
                case 4:viewAllBarang(); break;
                case 5:mainMenuAdmin();break;
            }
		}while(pil!=5);
    }
	// Menu Barang
	public static void addBarang(){
            System.out.println();
            System.out.println("Add Barang");
            String id=bacaStr("Masukkan ID Barang : ");
            String nama=bacaStr("Masukkan Nama Barang : ");
            int harga=bacaInt("Masukkan Harga Barang : ");
            int hj = harga*10/100;
            double hargajual=(harga+hj);
            Barang brgBaru = new Barang(id,nama,harga,hargajual);
            tblBarang.add(brgBaru); 
            System.out.println();
    }
	private static int cariBrg(String id){
        int idx=-1;
        int i=0;
        do{
            if(tblBarang.elementAt(i).getId().equals(id))
                idx=i;
            i++;
        }
        while((i<tblBarang.size()&&(idx==-1)));
        return idx;
    }
	public static void deleteBarang(){
		System.out.println();
        System.out.println("Delete Barang");
        String id=bacaStr("Masukkan ID Barang yang akan dihapus : ");
            int idx=cariBrg(id);
            if(idx==-1){
				System.out.println("Nama Barang "+id+" tidak ada!");
            }
            else{
                String tanya=bacaStr("Apakah anda yakin ingin menghapus id barang "+id+"?[y/t] : ");
					if(tanya.equalsIgnoreCase("y")){
						tblBarang.removeElementAt(idx);
                        System.out.println(id+" Berhasil dihapus");
                    }
            }
        System.out.println();
    }
	public static void updateBarang(){
		System.out.println();
        System.out.println("Update Barang");
        String id=bacaStr("Masukkan ID Barang yang akan di Update : ");    
            int idx=cariBrg(id);
				if(idx==-1){
                    System.out.println("Nama Barang "+id+" tidak ada!");
                }
                else{
                    int hrg=bacaInt("Masukkan harga yang akan di Update : ");
                    String tanya=bacaStr("Apakah harga barang Rp."+hrg+" akan di Update?[y/t] : ");
                    if(tanya.equalsIgnoreCase("y")){
                        tblBarang.elementAt(idx).setHargabeli(hrg);
                        System.out.println("Harga berhasil diupdate");
                    }
				}
    }
	public static void viewAllBarang(){
            System.out.println();
            System.out.println("lihat semua Barang");
            System.out.println("ID \t Nama \t Harga \t Harga jual");
            for(Barang brg:tblBarang){
                System.out.println(brg.getId()+"\t"+brg.getNama()+"\t"+brg.getHargabeli()+"\t"+brg.getHargajual());
            }
            System.out.println();
    }

	public static void main(String []argc){
		Scanner sc=new Scanner (System.in);
		//tambahkan 2 user default
		//tblUser.add(new User("tyo","022"));
		//tblUser.add(new User("yoga","025"));
		//tblKasir.add(new Kasir("fob","surabaya"));
		//tblKasir.add(new Kasir("yvc","sidoarjo"));

		
		tblBarang.add(new Barang("001", "Knalpot", 30000, 35000));
		tblBarang.add(new Barang("002","HID", 20000, 25000 ));
		tblBarang.add(new Barang("003", "Gear", 45000, 50000));
	boolean oke=false;
		if(loginUser()){
			oke=true;
		}
		while(true);
	}
	//Menu Kasir
	public static void mainMenuKasir(){
	int pil;
		do{
		System.out.println("Transaksi Kasir");
		System.out.println("1. Transaksi");
		System.out.println("2. View All Transaksi");
		System.out.println("3. Kembali Ke Menu Utama");
		System.out.println("");
		pil=bacaInt("Pilih menu 1-3 : ");
			switch(pil){
				case 1:Transaksi();break;
				case 2:ViewAllTransaksi();break;
				case 3:mainMenuAdmin();break;
			}
		}while(pil!=3);
	}
	public static void Transaksi(){
	int psn; int i;
	psn = bacaInt("Berapa jumlah barang yang anda pesan? : ");
	System.out.println();
	for(i=0;i<psn;i++){
		String pesanBarang = bacaStr("Masukkan Nama barang yang dipesan : ");
			if(tblBarang.elementAt(i).getNama().equals(pesanBarang)){
			double kuantiti = bacaDoub("Berapa Jumlah (KG) yang dipesan : ");
			DTransaksi dtBaru = new DTransaksi(pesanBarang,kuantiti);
			DTrans.add(dtBaru); 
			System.out.println("Harga barang : "+tblBarang.elementAt(i).getHargajual());
			System.out.println();
			}
			else{
				System.out.println("Barang yang dipesan tidak tersedia !!");
			}
	}
	}
	public static void ViewAllTransaksi(){
	int i=0;
		double total_bayar = 0;
		System.out.println();
		System.out.println("*-------- Toko Buah fob surabaya  ---------*");
		System.out.println("ID TR#: ");
		System.out.println("-------------------------------------------");
		System.out.println("Nama Barang \t Harga Barang \t Kuantiti \t Sub Total");
		for(DTransaksi tr:DTrans){
			double harga = tr.getKuantiti() * tblBarang.elementAt(i).getHargajual();
			total_bayar += harga;
            System.out.println(tr.getBarang()+"\t\t"+tblBarang.elementAt(i).getHargajual()+"\t\t"+tr.getKuantiti()+"\t\t"+harga);
			i++;
        }
		System.out.println();
		System.out.println("Total Semua : " + total_bayar);//DTransaksi.hitungTotal(DTransaksi.getKuantiti()*tabelbarang.elementAt(i).getHargajual()));

		/*System.out.println("--VIEW ALL USERS--");
		for(Barang brg:tblBarang)
			System.out.println(brg.getId()+"\t"+brg.getNama()+"\t"+brg.getHargajual());*/
	}
	public static void ReportTransaksi(){
	int a=0;
	//total=harga*jml;
		System.out.println("Toko fob surabaya");
		System.out.println("Nama Pegawai: "+cek);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("No\t IDBarang\t Nama\t\t Harga\t Jumlah\t TotalHarga");
		System.out.println("-------------------------------------------------------------------");
		for(Barang brg:tblBarang){
			System.out.println(a+1+"\t  "+brg.getId()+"\t\t"+brg.getNama()+"\t\t"+brg.getHargabeli()+"\t  "+brg.getHargajual()+"\t"+brg.hitungTotal());
			a++;
		}
		//System.out.println("Total Bayar"+Barang.hitungTotalBayar());
	}
	public static int bacaInt(String pesan){
		System.out.print(pesan);		
		int i=sc.nextInt();
		return i;
	}
	public static double bacaDoub(String pesan){
		System.out.print(pesan);
		double i=sc.nextDouble();
		return i;
	}
	public static String bacaStr(String pesan){	
		System.out.print(pesan);		
		String i=sc.next();
		return i;
	}
	public static void add(){
		System.out.println("---ADD NEW USER---");
		String userName=bacaStr("Masukkan User Name: ");
		String password=bacaStr("Masukkan Password : ");				
		User userBaru=new User(userName,password);
		tblUser.add(userBaru);
	}
	public static void viewAllUser(){
		System.out.println("--lihat data user--");
		for(User usr:tblUser)
			System.out.println(usr.getUserName()+"\t"+usr.getPassword());
	}
	private static int cariUsr(String userName){
		int idx=-1;
		int i=0;
		do{
			if(tblUser.elementAt(i).getUserName().equals(userName))
				idx=i;
			i++;
		}while((i<tblUser.size()&&(idx==-1)));
		return idx;				
	}
	public static void delete(){
		System.out.println("--hapus data user--");
		String userName=bacaStr("Masukkan user name yang akan dihapus: ");		
		int idx=cariUsr(userName);
		if(idx==-1)
			System.out.println(userName+" Tidak ada di Tabel User !");		
		else{
			//apakah username tsb akan dihapus? jika ya removeElementAt(idx);		
			String hapus=bacaStr("Apakah user: " + userName +" akan dihapus [y/t]?");
			if(hapus.equalsIgnoreCase("y")){
				tblUser.removeElementAt(idx);
				System.out.println("User : " + userName + " Sudah Terhapus !");	
									
			}
		}			
	}
	public static void changesPassword(){
		System.out.println("--rubah password--");
		String uname=bacaStr("Masukkan user name yang akan diuabah : ");	
		int idx=cariUsr(uname);		
		if(idx==-1)
			System.out.println(uname + " Tidak ada di tabel User !");
		else{
			String newPass=bacaStr("Masukkan password baru: ");
			tblUser.elementAt(idx).setPassword(newPass);	
		}			
	}
	public static boolean loginUser(){
		boolean oke=false;
		int i=0;
		do{				
		System.out.println("--Login--");
		String username=bacaStr("Masukkan Username: ");
		String pass=bacaStr("Masukkan Password : ");
		int j=0;
		do{
			if(username.contains(username) && pass.contains(pass)){			
				j=tblUser.size();
					if(username.equalsIgnoreCase("tyo")&&pass.equalsIgnoreCase("022")){
						mainMenuAdmin();
						oke=true;
					}
					else if(username.equalsIgnoreCase("fob")&&pass.equalsIgnoreCase("surabaya")){
						mainMenuKasir();
						oke=true;
					}
			}
			j++;
		}while(j<tblUser.size());
		i++;
		}while((!oke)&&(i<3));
		return oke;
	}
	public static boolean loginKasir(){
		boolean oke=false;
		int i=0;
		do{				
		System.out.println("--Login Kasir--");
		String uName=bacaStr("Masukkan Username: ");
		String pass=bacaStr("Masukkan Password : ");
		int k=0;
		do{
			if(tblKasir.elementAt(k).checkKasirPassword(uName,pass)){
			oke=true;
			k=tblKasir.size();
			}
			k++;
		}while(k<tblKasir.size());
		i++;
		}while((!oke)&&(i<3));
		return oke;
	}
}
