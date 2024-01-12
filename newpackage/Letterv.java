package newpackage;


import java.util.Scanner;

public class Letterv {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hundurluyu daxil edin: ");
        int hundurluk= scanner.nextInt();
        for(int i=1;i<=hundurluk;i++){
            System.out.print(" ");
            for(int j=1; j<=hundurluk;j++){
                if (i==j){
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j=hundurluk; j>=1;j--){
                if ((i==j) &&(j!=hundurluk)){
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("");
            System.out.println();
        }
    }
}
