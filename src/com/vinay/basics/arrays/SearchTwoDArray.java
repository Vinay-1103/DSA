package com.vinay.basics.arrays;

import java.util.Arrays;

public class SearchTwoDArray {
    static int[] searchUnsortedMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (target==matrix[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] searchRowSortedMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        for (int i=0;i<rows;i++) {
            if (target>=matrix[i][0] && target<=matrix[i][cols-1]){
                int index=Arrays.binarySearch(matrix[i],target);
                if (index>=0){
                    return new int[]{i,index};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searchSortedRowColMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int i=0;
        int j=cols-1;
        while(i<rows && j>=0){
            if (target == matrix[i][j]){
                return new int[]{i,j};
            }else if (target < matrix[i][j]){
                j--;
            }
            else {
                i++;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searchSortedMatrix(int[][] matrix,int target){
        int rows= matrix.length;
        int cols=matrix[0].length;
        int rowLow=0;
        int rowHigh=rows-1;
        while (rowLow<=rowHigh){
            int rowMid=rowLow+(rowHigh-rowLow)/2;
            if (target>=matrix[rowMid][0] && target<=matrix[rowMid][cols-1]){
                int index=Arrays.binarySearch(matrix[rowMid],target);
                if (index>=0){
                    return new int[]{rowMid,index};
                }
            } else if (target>matrix[rowMid][cols-1]) {
                rowLow=rowMid+1;
            }else {
                rowHigh=rowMid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
//        int[][] matrix={{1,4,6,2},{7,-3,89,90},{12,10,45,78}};
//        int[] result=searchUnsortedMatrix(matrix,89);
//        int[][] matrix={{1,4,7,10},{23,41,56,60},{6,16,45,100}};
//        int[] result=searchRowSortedMatrix(matrix,16);
//        int[][] matrix={{5,15,25,30},{7,16,26,31},{10,18,28,35},{20,21,30,40}};
//       int[] result=searchSortedRowColMatrix(matrix,35);
        int[][] matrix={{1,2,3,4},{5,6,7,8},{10,11,12,13}};
        int[] result=searchSortedMatrix(matrix,7);
        System.out.println(Arrays.toString(result));
    }
}
