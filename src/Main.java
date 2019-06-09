import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        //mai jos varianta 1
        int count =0;
        for (int i=0; i<s.length();i++) {

            if (s.charAt(i)>'0'&& s.charAt(i)<'9')
                count++;

        }
        System.out.println(count);

//mai jos este varianta 2
        String s1=s.replaceAll("\\d","");
        int total = s.length()-s1.length();
        System.out.println(total);
    }
}
