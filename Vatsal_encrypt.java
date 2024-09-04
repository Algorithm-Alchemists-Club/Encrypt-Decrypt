import java.util.Scanner;
class vatsal_encrypt
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        String p=ob.nextLine();
        String e="";
        int a;
        int i,j,k,l,m,n,o,q;
        for(int x=0;x<=p.length()-1;x++)
        {
            a=p.charAt(x);
            
            i=97+(122-a);
            j=a+x;
            k=a++;
            l=35+(a%4);
            m=a-4;
            n=97+(a%4);
            o=122-(a%4);
            q=65+(90-a);
            int chi=(char)i;
            int chj=(char)j;
            int chk=(char)k;
            int chl=(char)l;
            int chm=(char)m;
            int chn=(char)n;
            int cho=(char)o;
            int chq=(char)q;
            
            e=e+Character.toString(chi)+Character.toString(chj)+Character.toString(chk)+Character.toString(chl)+Character.toString(chm)+Character.toString(chn)+Character.toString(cho)+Character.toString(chq);
        }   
        
        System.out.println(e);
    }
}