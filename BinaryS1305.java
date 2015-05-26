import java.io.*;
class BinaryS1305
{
    public static void main(String args[])throws IOException
    {   int i;
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader y=new BufferedReader(x);
        int a[]=new int[15];
        a[0]=12;a[1]=4;a[2]=6;a[3]=11;a[4]=8;a[5]=2;
        a[6]=7;a[7]=23;a[8]=1;a[9]=14;a[10]=21;
        a[11]=30;a[12]=32;a[13]=18;a[14]=16;
        System.out.println("--------Binary Search----------");
        for(i=0;i<a.length;i++)
           { System.out.print(a[i]+" | "); }
        System.out.println("Masukan angka yang akan dicari");
        int n=Integer.parseInt(y.readLine());

       System.out.println("Isi data dalam array");
       for(i=0;i<10;i++)
       { System.out.print(a[i]+" | "); }
       System.out.println("angka yang dicari adalah "+n);
       int p=-1,mid,l=0,u=9;
       while(l<=u)
       {   mid=(l+u)/2;
           if(a[mid]==n)
           {   p=mid;
               break;
           }
           else if(n> a[mid])
           {   l=mid+1;
           }
           else if(n<a[mid])
           {   u=mid-1;
           }
       }
       if(p==-1)
       {   System.out.println("Angka yang di cari tidak ada");
       }
       else
       {   System.out.println("angka berada di INDEX ke: "+p);
       }
    }
}
