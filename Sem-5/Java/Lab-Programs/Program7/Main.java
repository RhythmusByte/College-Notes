import java.util.*;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] array = m.readArray();
        m.displaytTranspose(m.transpose(array));
        System.out.println("trace : " + m.trace(array));
        
        
    }
    
}

class Matrix{
    int row;
    int col;
    int[][] readArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row size : ");
        this.row= in.nextInt();
        System.out.println("enter the column size : ");
        this.col = in.nextInt();
        int[][] matrix= new int[row][col];
        for(int i=0 ;i<row;i++){
            for(int j=0 ;j<col;j++){
                System.out.println("enter the" + (i+1) + (j+1) + "th element" );
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
        return matrix;
    }

    int[][] transpose(int[][] matrix){
        int[][] transposed= new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = matrix[i][j];
            
            }
        }
        return transposed;

    }

    String trace(int[][] matrix){
        if(row==col){
            double sum =0;
            for(int i=0 ;i<row;i++){
                for(int j=0 ;j<col;j++){
                    if(i==j){
                        sum+=matrix[i][j];
                    }
                }
            }
        return ""+sum;
        }
        else
        return "The matrix should be square to get trace";
    }

    void displaytTranspose(int[][] matrix){
        System.out.println("The transpose is : ");
        for(int i=0 ;i<col;i++){
            for(int j=0 ;j<row;j++){
                System.out.print(matrix[i][j]+ "   ");
            }
            System.out.println("");
        }
        return;
       
    }
    
}
