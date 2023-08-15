import java.util.*;
public class passwordgenerator {
    public static void main(String[] args) {
        // Creating an object of class passwordgenerator
        passwordgenerator obj = new passwordgenerator();
        // Calling the function using the object
        obj.display();
    }
    Scanner sc = new Scanner(System.in);

    public String randomgenerator() {
        int i;
        String str = "", newstring = "";
        // Defining the different characters set
        String uppercaseSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseSET = uppercaseSET.toLowerCase();
        String NumberSET = "0123456789";
        String SpecialSET = "#$%&'()*+,-./:;=>?@[]_|";
        System.out.println("Enter the length of the password to be generated");
        int length = sc.nextInt();// It will store the required length of the password
        while (true) {
            System.out.print(
                    "Enter the character set :\n1 for uppercase\n2 for lowercase\n3 for numbers\n4 for special characters\n5 for a combination of lowercase, uppercase, and special characters): ");
            i = sc.nextInt();
            if (i == 1) {
                str += uppercaseSET;
                break;
            } else if (i == 2) {
                str += lowercaseSET;
                break;
            } else if (i == 3) {
                str += NumberSET;
                break;
            } else if (i == 4) {
                str += SpecialSET;
                break;
            } else if (i == 5) {
                str += uppercaseSET + "" + lowercaseSET + "" + NumberSET + "" + SpecialSET;
                break;
            } else

                System.out.println("Oops!You inputed the wrong choice\nPlease re-enter again");
        }
        int randomnum;
        char ch;
        Random ran = new Random();
        for (i = 0; i < length; i++) {
            randomnum = ran.nextInt(str.length());
            ch = str.charAt(randomnum);
            newstring = newstring + "" + ch;
        }
        return newstring;
    }

    protected void display() {
        System.out.println("The generated password is: " + randomgenerator());
    }
}
