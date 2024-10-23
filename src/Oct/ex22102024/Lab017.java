package Oct.ex22102024;

import java.util.Scanner;

public class Lab017 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String st1 = sc.nextLine();
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<st1.length();i++){
            char c = st1.toLowerCase().charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelCount=vowelCount+1;
            }
            else if(c==' '){
                continue;
            }
            else{
                consonantCount=consonantCount+1;
            }
        }

        System.out.println("No. of vowels: "  + vowelCount);
        System.out.println("No. of consonants: "  + consonantCount);

        sc.close();
    }
}
