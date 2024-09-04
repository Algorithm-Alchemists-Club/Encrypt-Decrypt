import java.util.Scanner;
public class Harshit_ENCRYPT 
{
    int rnd()
    {
        int n;
        while(true)
        {
            n=(int)(Math.random()*10);
            if(n>=1&&n<=9)
            return n;
        }
    
    
    }
    public static void main(String[] args)
    {
        Harshit_ENCRYPT mc=new Harshit_ENCRYPT();
        int r=mc.rnd();
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int l=S.length();
        int c=0;
        String N="";
        for(int i=r;c<l;i++)
        {
            char ch=S.charAt(c);
            int n=ch+i;
            
            char ch2=(char)n;
            N=N+ch2;
            c++;
        }
        N=r+N;
        System.out.println(N);
    }
}
