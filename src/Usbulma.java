import java.util.Scanner;


public class Usbulma {
    public static void main(String[] args) {
        int x,y,num1=1 ;
        Scanner inp=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz: ");
        x=inp.nextInt();
        System.out.println("Us olacak sayiyi giriniz: ");
        y=inp.nextInt();

        for (int i=1; i<=y; i++){
            num1=num1*x;


        } System.out.println(num1);




    }
}
