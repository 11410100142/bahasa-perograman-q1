public class Kasir{
	//attribute - kolom /field di tabel	
	private String userName;
	private String password;

	//constructor
	/**
	* Method khusus yang dipanggil pertama kali ketika dibuat variable 
	* dengan tipe class ini
	* namaMethod== namaClass
	*/
	public Kasir(String userName, String password){
		this.userName=userName;
		this.password=password;
	}

	//access method get - membaca isi field
	//set - mengisi/menulis isi field
	public String getKasirName(){
		return userName;
	}
	public String getPassword(){
		String _pass="";
		for(int i=0;i<password.length();i++)
			_pass=_pass+(char)((int)password.charAt(i));
		return _pass;
	}
	public boolean checkKasirPassword(String usr,String pass){
		return (userName.equals(usr)&&(password.equals(pass)));
	}
	public void setPassword(String pass){
		password=pass;
	}
	public static void main(String []strs){
		Kasir u1=new Kasir("kasir","123");
		System.out.println(u1.getKasirName());
		System.out.println(u1.getPassword());
		System.out.println(u1.checkKasirPassword("kasir","123"));			
	}
}
