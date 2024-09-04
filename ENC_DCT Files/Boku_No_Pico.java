import java.util.Scanner;
class Boku_No_Pico
{
    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;':,./<>?";
    int kys[]; int l=CHAR_SET.length();
    String encrypt(String s)
    {
        s=s.trim();
        kys=new int[s.length()];
        String ans="";
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            int key=(ch*ch)+4*(i*i*6)+69;//this value will exceed the ASCII of any char from CHAR_SET
            kys[i]=key/l;//hence I simplify this by dividing and store the quotient of it
            if(ch==' ')
            ans+=" ";
            else
            ans+=CHAR_SET.charAt(key%l);//using the remainder as my new reference for the new character
        }
        return ans;
    }
    String decrypt(String s)
    {
        s=s.trim();
        String ans="";
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            int key=(int)Math.sqrt( CHAR_SET.indexOf(ch)+(kys[i]*l)-4*(i*i*6)-69);
            if(ch==' ')
            ans+=" ";
            else
            ans+=(char)(key);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        Boku_No_Pico obj = new Boku_No_Pico();
        String s="Satvik Bhaiya & Saurya bhaiya cute together";
        System.out.println(obj.encrypt(s));
        System.out.println(obj.decrypt(obj.encrypt(s)));
        sc.close();
    }
}