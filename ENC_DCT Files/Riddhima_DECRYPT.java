import java.util.*;
class decrypt{
     public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter your encrypted password as a string");
        String P = sc.nextLine();
        System.out.println ("decrypted password is ="+ de(P));
    }
    static String de(String D){
        String s="";
        for (int i =0;i<D.length();i++){
            s+= (char)((int)D.charAt(i)-(f((i)))/(i+1));
        }
        return s;
    }
    static int f (int n){
        int f =1;
        for (int i =1;i<=n;i++){
            f+=i ;
        }
        return f;
    }
}