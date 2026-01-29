import java.util.Scanner; // Import Scanner

public class class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close(); // Good practice to close Scanner
        for(int i=0;i<n.length();i++){
            System.out.println(n.charAt(i));
        }
    }
}
