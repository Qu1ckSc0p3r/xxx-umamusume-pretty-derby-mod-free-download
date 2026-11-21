import java.util.Scanner;

public class adrianexplainourfriendgroup {
    public static void main(String[] args) {
        Scanner vvodStrokiNeTolkoSkobok = new Scanner(System.in);
        System.out.print("Ввод: ");
        String str = vvodStrokiNeTolkoSkobok.nextLine();
        boolean bbl = true;
        int index = -1;
        char[] helpMeStepBrotherImStcuk = new char[str.length()];

        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c != '(' && c != '{' && c != '[') {
                if (index == -1) {
                    bbl = false;
                    break;
                }

                char omenNaNooh = helpMeStepBrotherImStcuk[index];
                if ((omenNaNooh != '(' || c != ')') && (omenNaNooh != '{' || c != '}') && (omenNaNooh != '[' || c != ']')) {
                    bbl = false;
                    break;
                }

                --index;
            } else {
                ++index;
                helpMeStepBrotherImStcuk[index] = c;
            }
        }

        if (index != -1) {
            bbl = false;
        }

        System.out.print("Сбалансированность(true-да;false-нет): ");
        System.out.println(bbl);
    }
}

