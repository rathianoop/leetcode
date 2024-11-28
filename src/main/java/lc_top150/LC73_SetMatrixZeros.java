package lc_top150;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC73_SetMatrixZeros {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap();
        for(Integer values : map.values()){

        }

    }

    public static void setMatrix(int[][] matrix){

        boolean rowHasZero = false, columnHasZeros = false;

        for(int c = 0; c < matrix[0].length; c++){
            if(matrix[0][c] == 0){
                columnHasZeros = true;
                break;
            }
        }

        for(int r = 0; r < matrix.length; r++){
            if(matrix[r][0] == 0){
                rowHasZero = true;
                break;
            }
        }

        for(int r = 1; r < matrix.length; r++){
            for(int c = 1; c < matrix[0].length; c++){
                if(matrix[r][c] == 0){
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }

        fillMatrix(matrix, rowHasZero, columnHasZeros);
    }

    private static void fillMatrix(int[][] matrix, boolean rowHasZero, boolean columnHasZero){

        for(int c = 0; c < matrix[0].length; c++){
            if(matrix[0][c] == 0) fillColumn(matrix, c);
        }
        for(int r = 0; r < matrix.length; r++){
            if(matrix[r][0] == 0) fillRow(matrix, r);
        }

        if(rowHasZero) fillRow(matrix, 0);
        if(columnHasZero) fillColumn(matrix, 0);

    }

    private static void fillRow(int[][] matrix, int row){
        for(int c = 0; c < matrix[0].length; c++){
            matrix[row][c] = 0;
        }
    }

    private static void fillColumn(int[][] matrix, int column){
        for(int r = 0; r < matrix.length; r++){
            matrix[r][column] = 0;
        }
    }
}
