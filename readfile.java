import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {

    public String readFile() {

        String data = "";

        try {
            File myObj = new File("password.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                return data;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;

    }

    public String encryption() {

        String encrypt = readFile();

        String correctPassword = "";
        char[] chars = encrypt.toCharArray();

        for (char c : chars) {
            if (c == 'z') {
                c = 'a';
                correctPassword = correctPassword + c;
            } else {
                c = (char) (c + 1);
                correctPassword = correctPassword + c;
            }

        }
        return correctPassword;

    }

}
