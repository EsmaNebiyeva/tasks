package newpackage;

import java.util.Scanner;

public class Lettern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hundurluyu daxil edin: ");
        int hundurluk= scanner.nextInt();
        for(int i=1;i<=hundurluk;i++){
            System.out.print(".");
            for(int j=1;j<=hundurluk;j++){
                if((i==j) && (i!=1) && (i!=hundurluk)){
                    System.out.print(".");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(".");
            System.out.println();
        }
    }
}

