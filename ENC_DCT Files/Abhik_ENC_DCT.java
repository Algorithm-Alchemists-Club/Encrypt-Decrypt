import java.util.*;

class Abhik_ENC_DCT {
    Scanner sc = new Scanner(System.in);
    char list[] = new char[94];
    char shuffledlist[] = new char[94];
    char ch = ' ';

    // Constructor
    Abhik_ENC_DCT() {
        // You can initialize anything here if needed
    }

    void ask() {
        System.out.println("Enter what you want to do:");
        System.out.println("(K)ey; (E)ncrypt; (D)ecrypt");
        char ans = Character.toUpperCase(sc.nextLine().charAt(0));
        switch (ans) {
            case 'K':
                key();
                break;
            case 'E':
                enp();
                break;
            case 'D':
                dnp();
                break;
            default:
                System.out.println("Retry bro :(");
                ask();
                break;
        }
    }

    void key() {
        ch = ' ';
        for (int i = 0; i < list.length; i++) {
            list[i] = ch;
            ch++;
        }
        System.out.println("Original list: " + Arrays.toString(list));
        shuffle();
    }

    void shuffle(){
    for(int i=list.length-1;i>0;i--){
        int m=i;
        int r=m+25;
        if(r>(list.length-1))
        r=r-(list.length-1);
        shuffledlist[i]=list[r];
    }
    System.out.println("Shuffled list: " + Arrays.toString(shuffledlist));
    ask();
    }

    void enp() {
        System.out.println("Enter password to be encrypted:");
        String a = sc.nextLine();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < list.length; j++) {
                if (a.charAt(i) == list[j]) {
                    b.append(shuffledlist[j]);
                    break; // Stop once you find the match
                }
            }
        }
        System.out.println("Encrypted password is: " + b.toString());ask();
    }

    void dnp() {
        System.out.println("Enter password to be decrypted:");
        String a = sc.nextLine();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < shuffledlist.length; j++) {
                if (a.charAt(i) == shuffledlist[j]) {
                    b.append(list[j]);
                    break; // Stop once you find the match
                }
            }
        }
        System.out.println("Decrypted password is: " + b.toString());
    }

    public static void main(String[] args) {
        Abhik_ENC_DCT idk = new Abhik_ENC_DCT();
        idk.ask();
    }
}