import java.util.Scanner;
public class Harshit_DECRYPT 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String S=sc.nextLine();
        int n=S.charAt(0)-48;
        
        S=S.substring(1,S.length());
        int l=S.length();
        int c=0;
        String N="";
        for(int i=n;c<l;i++)
        {
            char ch=S.charAt(c);
            int ni=ch-i;
            char ch2=(char)ni;
            N=N+ch2;
            
            c++;
        }
        System.out.println(N);
    }
}
