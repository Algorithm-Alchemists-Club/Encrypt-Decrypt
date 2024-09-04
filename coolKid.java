import java.util.*;

class Idk1 {
    Scanner sc = new Scanner(System.in);
    char list[] = new char[94];
    char shuffledlist[] = new char[94];
    char ch = ' ';

    // Constructor
    Idk1() {
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

    void shuffle() {
        // Shuffle the list array to create shuffledlist
        List<Character> charlist = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            charlist.add(ch);
            ch++;
        }
        Collections.shuffle(charlist);

        for (int i = 0; i < shuffledlist.length; i++) {
            shuffledlist[i] = charlist.get(i);
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
        Idk1 idk = new Idk1();
        idk.ask();
    }
}

