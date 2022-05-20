// Посчитать сумму двух чисел в одном файле и записать в другой

package Task_SUM_in_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("src/main/java/Task_SUM_in_file/input.txt");
        File file2 = new File("src/main/java/Task_SUM_in_file/output.txt");

        Scanner sc = new Scanner(file1);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger c = a.add(b);
        System.out.println(c);

        PrintWriter pw = new PrintWriter(file2);
        pw.print(c);
        pw.close();

    }
}
