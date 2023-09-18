import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        int szam1=0;
        int szam2=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Add meg az első számot:");
        szam1=n.nextInt();
        System.out.println("Add meg a második számot");
        szam2=n.nextInt();
        int kozt=szam1;
        if (szam2>szam1) {
            for (int i=0;i<szam2;i++){
                System.out.println(kozt+1);
            }
        }else{
            System.out.println("The second number should be bigger");
        }
    }
}