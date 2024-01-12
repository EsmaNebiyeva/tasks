package newpackage;
public class Matrix {
    public static void main(String[] args) {
        int sum;
        int[][] m3=new int[3][1];
        int[][] m1 = {{1,10,8}, {1,2,3}, {1,2,8}};
        int[][] m2 = {{0,1,1}, {1,0,0}, {0,1,1}};
        for(int i=0;i<m1.length;i++){
            sum=0;
            for(int j=0; j<m1[i].length;j++){
                sum=sum+m1[i][j]*m2[j][i];
            }
            m3[i][0]=sum;
        }
        System.out.println("Massivin elementleri: ");
        for(int k=0; k<m1.length;k++){
            for(int f=0; f<1;f++) {
                System.out.println(m3[k][f]);
            }
        }
    }
}
