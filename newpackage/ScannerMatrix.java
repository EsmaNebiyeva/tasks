package newpackage;

import java.util.Scanner;

public class ScannerMatrix {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.print("Birinci massivin setiri daxil edin: ");
        int a=sc.nextInt();
        System.out.print("Birinci massivin sutunu daxil edin: ");
        int b=sc.nextInt();
        int[][] m1=new int[a][b];
        System.out.print("Ikinci massivin setiri daxil edin: ");
        int c=sc.nextInt();
        System.out.print("Ikinci massivin sutunu daxil edin: ");
        int d=sc.nextInt();
        int[][] m2=new int[c][d];
        int[][] m3=new int[a][1];
        int sum;
        System.out.println("Birinci massiv: ");
        for(int i=0;i<=a-1;i++){
            for(int j=0;j<=b-1;j++){
                System.out.print(i+"sutun "+j+"setir: ");
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ikinci massiv: ");
        for(int i=0;i<=c-1;i++){
            for(int j=0;j<=d-1;j++){
                System.out.print(i+"sutun "+j+"setir: ");
                m2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m1.length;i++){
            sum=0;
            for(int j=0; j<m1[i].length;j++){
                sum=sum+m1[i][j]*m2[j][i];
            }
            m3[i][0]=sum;
        }
        System.out.println("Massivin elementleri: ");
        for(int k=0; k<a;k++){
            for(int f=0; f<1;f++) {
                System.out.println(m3[k][f]);
            }
        }
    }
}
