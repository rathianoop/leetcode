package problems;

public class LC2373_LargestLocalValuesInMatrix {

    public static void main(String[] args) {
        int[][] toTest = new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        System.out.println(largestLocal(toTest));
    }

    public static int[][] largestLocal(int[][] grid){

        int[][] returningArray = new int[grid.length-2][grid[0].length-2];
        int x = 0;
        int y = 0;


        for(int i = 0; i < grid.length-2; i ++){
            for(int j = 0; j < grid.length-2; j++){

                int max = 0;
                for(int a = i; a < i+3; a++){
                    for(int b = j; b < j+3; b++){
                        max = Math.max(grid[a][b], max);
                    }
                }

                returningArray[i][j] = max;
            }
        }

        return returningArray;
    }
}
