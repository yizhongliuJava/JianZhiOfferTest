package com.java.Test.binarySearchDoubleArray;

/**
 * 二维数组的二分查找目标数
 *
 * @author liuyizhong
 * @date 2018/8/13 11:48
 */
public class BinarySearch {

    public Boolean binarySearchTarget(int [][] array,Integer target){
        int row = 0;
        int column = array[0].length-1;//array[0].length就是指第一行有多少数,也就是代表整个二维数组有多少列
        if(array == null){             //array.length代表一共多少行，因为array[0]一行代表一个二维数组的成员
            return false;

        }
            while(row < array.length && column >= 0){
                if (array[row][column] == target)
                {
                    return true;
                }
                else {
                 /*   思路：题目已知：二维数组由上到下，由左到右递增的规律，
                    那么选取右上角（或者左下角）的元素array[row][column]与target进行比较，
                    当target小于元素array[row][column]时，那么target必定在元素array所在行的左边,
                            column--；
                    当target大于元素array[row][column]时，那么target必定在元素array所在列的下边,
                            即row++；*/
                    if(array[row][column]>target){

                        column--;
                    }else

                        row++;
                }
            }

        return false;
    }

    public static void main(String []args){

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearchTarget(new int[][] { { 1, 3 }, { 5,7 }, { 9, 11 } },11));
    }


}
