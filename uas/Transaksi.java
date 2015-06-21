import java.text.*;
import java.io.*;
import java.util.*;

public class Transaksi{
	private static String id;
	//private Date tglTr;
	public static Vector <DTransaksi> detailTransaksi = new Vector<DTransaksi>();
	private DTransaksi dt;
	//constructor
	public Transaksi(String id){
		this.id=id;
	}
	//method untuk menambah detail transaksi
	public static void tambahDtr(DTransaksi dtr){
		
	}
	public int hitungTotal(){
		//int total += dt.hitungSubTotal();
		return +dt.hitungSubTotal();
	}
	public static void cetakTransaksi(){
		System.out.println("Toko fob surabaya");
		System.out.println("ID TR#: "+id);
		System.out.println("-------------------------------------------");
		System.out.println("No\t IDBarang\t Nama\t Kuantiti\t Sub Total");
		System.out.println("-------------------------------------------");
		//System.out.println(hitungTotal());
	}
}
