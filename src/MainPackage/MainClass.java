package MainPackage;
import FuncPackage.Function;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        System.out.print("Input string: ");
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        Function function = new Function();
        function.function(input);
    }
}
