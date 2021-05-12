package exercises;
import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of rectangle:");
        double length=input.nextDouble();
        System.out.println("Enter width of rectangle:");
        double width=input.nextDouble();
        double area=length*width;
        System.out.println("area of their rectangle is:"+area);

    }
}
