import java.util.*;
public class Login {
	//INISIALISASI LOGIN
	public static Vector <String> username = new Vector <String>();
	public static Vector <String> password = new Vector <String>();
	public static Vector <String> status = new Vector <String>();
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String [] args){
		username.add("hima");
		password.add("hima");
		status.add("admin");
		
		username.add("kasir");
		password.add("kasir");
		status.add("kasir");
		
		boolean ceklogin = false;
		
		do 
		{
			System.out.println ("");
			System.out.println ("==============================");
			System.out.println ("            LOGIN             ");
			System.out.print ("masukkan User Name \t: ");
			String user = sc.next();
			System.out.print ("masukkan Password \t: ");
			String pass = sc.next();
			
				if (username.contains(user) && password.contains(pass)) 
				{
					if (username.indexOf(user) == password.indexOf(pass))
					{
						int urutan = username.indexOf(user);
						String cek = status.elementAt(urutan);
						if (cek.equalsIgnoreCase("admin"))
						{
							
							Isi.admin ();
							ceklogin = true;
						}
						
							else if (cek.equalsIgnoreCase("kasir")) 
							{
								
								Isi.kasir();
								ceklogin=true;
							}
							
						}
						
						else 
						{
							System.out.println ("\n Maaf Inputan anda salah, \"Login gagal\", silahkan mencoba lagi! "); 
						}
						
				}
				
					else 
					{
						System.out.println ("\n Maaf Inputan anda salah, \"Login gagal\", silahkan mencoba lagi! ");
					}
					
		} while (ceklogin = true);
	}
	
}
