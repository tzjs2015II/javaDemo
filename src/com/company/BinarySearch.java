package com.company;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * @author wgl
 * @ClassName BinarySearch.java
 * @Description 二分查找
 * @createTime 2019/11/14  17:38:00
 */
public class BinarySearch {
    private static int rank(int key,int[]a){
        int lo=0;
        int hi=a.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid]){
                hi=mid-1;
            }
            else if(key>a[mid]){
                lo=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    /*
    * 二分查询只需要使用比奥
    * */
    //测试用例
    public static void main(String[] args) {
        //todo erro：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        int[] whiteList= new int[]{1,5,6,9,2,3};
        //Arrays实现对数组的排列
        Arrays.sort(whiteList);
        System.out.println(whiteList);
        while (!StdIn.isEmpty()){
            //读取key值，如果不存在白名单中就打印其值
            int key=StdIn.readInt();
            if(rank(key,whiteList)<0){
                System.out.println(key);
            }
        }
    }
}
