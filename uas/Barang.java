public class Barang
{
	private String id;
	private String nama;
	private double harga;
	private double hargajual;
	public double total_bayar;
	private DTransaksi dt;
	
	public Barang(String id, String nama, double harga, double hargajual){
		this.id=id;
		this.nama=nama;
		this.harga=harga;
		this.hargajual=hargajual;
	}
	public String getId(){
		return id;
	}
	public void setHargajual(double hargajual){
		this.hargajual=hargajual;
	}
	public double getHargajual(){
		return hargajual;
	}
	public double hitungTotal(){
		return dt.getKuantiti() * this.hargajual;
	}
	public double hitungTotalBayar(){
		return total_bayar+=hitungTotal();
	}
	public void setHargabeli(double harga){
		this.harga=harga;
	}
	public double getHargabeli(){
		return harga;
	}
	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama=nama;
	}
}
