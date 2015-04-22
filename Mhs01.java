import java.io.*;

class Mhs01
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		String Mhs[][] = new String[32][2];
		int x=0;
		double y;
		double z=0;
		double maks=0;
		int idxMaks=0;
		int mhs=0;
		{
				System.out.println("+----------------+");
				System.out.println("|    MENU        |");
				System.out.println("+----------------+");
				System.out.println("| 1 Input IPS    |");
				System.out.println("| 2 Lihat data   |");
				System.out.println("| 3 Laporan      |");
				System.out.println("| 4 Selesai      |");
				System.out.println("+----------------+");
				System.out.print("pilihan: ");
				x=Integer.parseInt(in.readLine());
				if (x==1)
				{
					if (mhs<32)
					{
						String yesNo="y";
						while (yesNo.equalsIgnoreCase("y"))
						{
							System.out.println("Mahasiswa ke- " + (mhs+1));
							System.out.print("Nama Mahasiswa: ");
							Mhs[mhs][0]=in.readLine();
							boolean err=true;
							while(err)
							{
								try
								{
									System.out.print("IPS: ");
									y=Double.parseDouble(in.readLine());
									Mhs[mhs][1]=Double.toString(y);
									if (y>=0 && y<5)
									{
										err=false;
										z=z+y;
										if (y>=maks)
										{
											maks=y;
											idxMaks=mhs;
										}
										mhs++;
									}
									else
										System.out.println("error");
								}
								catch (Exception e)
								{
									System.out.println("error");
								}
							}		
							boolean valid=false;
							while (valid==false)
							{
								System.out.print("Isi data lagi?(y/t)");
								yesNo=in.readLine();
								if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("t"))
								{
									if (yesNo.equalsIgnoreCase("y"))
									{
										if (mhs<32)
										{}
										else
										{
											System.out.println("kapasitas penuh");
											yesNo="t";
										}
									}	
									valid=true;
								}
							}
						}
					}
					else 
					{
						System.out.println("kapasitas penuh");
					}
				}
				else if (x==2)
				{
					System.out.println("+-----------------------+");
					System.out.println("| No |    Nama   | IPS  |");
					System.out.println("+-----------------------+");
					for (int a=0;a<mhs;a++)
					{
						if (a<10)
							System.out.println("| " + (a+1) + " | " + Mhs[a][0] + " |" + Mhs[a][1] + "  |");
						else
							System.out.println("| " + (a+1) + " | " + Mhs[a][0] + " |" + Mhs[a][1] + "  |");
					}
					System.out.println("+-----------------------+");
					System.out.println("Tekan ENTER u/ melanjutkan");
					in.readLine();
				}
				else if (x==3)
				{
					System.out.println("IPS rata2: " + (z/(mhs)));
					System.out.println("IPS tertinggi: " + Mhs[idxMaks][1]);
					System.out.println("Dicapai: " + Mhs[idxMaks][0]);
				}
				else if (x==4)
				{
					System.out.println("Terima kasih telah menggunakan program ini!!!");
				}
				else
				{
					System.out.println("error");
				}
		}
	}
}

