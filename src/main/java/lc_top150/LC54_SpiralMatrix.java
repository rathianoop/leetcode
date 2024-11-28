package lc_top150;

import java.util.ArrayList;
import java.util.List;

public class LC54_SpiralMatrix {

    public static void main(String[] args) {

    }

    public static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> returningList = new ArrayList();

        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = columns -1 ;
        int down = rows - 1;

        while(returningList.size() < rows*columns){

            for(int col = left; col <=right; col++){
                returningList.add(matrix[up][col]);
            }

            for(int row = up+1; row <= down; row++){
                returningList.add(matrix[row][right]);
            }

            if(up != down){
                for(int col = right-1; col >= left; col--){
                    returningList.add(matrix[down][col]);
                }
            }

            if(left != right){
                for(int row = down -1; row >= up; row--){
                    returningList.add(matrix[row][left]);
                }
            }

            left++;
            right--;
            up++;
            down--;

        }

        return returningList;


    }

}
