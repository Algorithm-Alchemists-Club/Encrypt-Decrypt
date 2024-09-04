import java.util.Scanner;

class vatsal_decrypt {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String e = ob.nextLine();
        String p = "";

        for (int x = 0;x<e.length();x=x+8) {
            int chi = e.charAt(x+0);
            int chj = e.charAt(x+1);
            int chk = e.charAt(x+2);
            int chl = e.charAt(x+3);
            int chm = e.charAt(x+4);
            int chn = e.charAt(x+5);
            int cho = e.charAt(x+6);
            int chq = e.charAt(x+7);
      
            int i = 122 - (chi - 97);            
            int j = chj - x;                     
            int k = chk;                         
            int l = (chl - 35 + 4) % 4 + 97;    
            int m = chm + 4;                     
            int n = (chn - 97) % 4 + 97;         
            int o = 122 - ((cho - 122) % 4);     
            int q = 90 - (chq - 65); 
            // any value can help 
            char originalChar = (char) i;

            p =p+originalChar;
        }

        System.out.println(p);
    }
}
