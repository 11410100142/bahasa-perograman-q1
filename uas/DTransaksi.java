public class DTransaksi{
	private double kuantiti;
	private String brg;
	
	public DTransaksi(String brg, double q){
		this.brg=brg;
		this.kuantiti=q;
	}
	public double getKuantiti(){
		return kuantiti;
	}
	public String getBarang(){
		return brg;
	}
}
