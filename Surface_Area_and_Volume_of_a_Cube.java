import java.util.Scanner;
public class Nums{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int sur = 6 * a * a;
        int vol = a * a * a;
        System.out.print("Surface area = " + sur + " and ");
        System.out.println("Volume = " +vol);
    }
}