public class User{
	//attribute - kolom /field di tabel	
	private String userName;
	private String password;

	//constructor
	/**
	* Method khusus yang dipanggil pertama kali ketika dibuat variable 
	* dengan tipe class ini
	* namaMethod== namaClass
	*/
	public User(String userName, String password){
		this.userName=userName;
		this.password=password;
	}

	//access method get - membaca isi field
	//set - mengisi/menulis isi field
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		String _pass="";
		for(int i=0;i<password.length();i++)
			_pass=_pass+(char)((int)password.charAt(i));
		return _pass;
	}
	public boolean checkUserPassword(String usr,String pass){
		return (userName.equals(usr)&&(password.equals(pass)));
	}
	public void setPassword(String pass){
		password=pass;
	}
	public static void main(String []strs){
		User u1=new User("admin","123");
		System.out.println(u1.getUserName());
		System.out.println(u1.getPassword());
		System.out.println(u1.checkUserPassword("admin","123"));			
	}
}
