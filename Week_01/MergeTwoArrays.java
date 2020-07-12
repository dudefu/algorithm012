package Week_01;

import java.util.Arrays;

public class MergeTwoArrays {
    
    public static void main(String[] args) {
        int[] nums1 = {2,5,3,0,0,0} ;
        int m = 3 ;
        int[] nums2 = {2,7,6} ;
        int n = 3 ;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        sortArrays(mergeArrays(nums1, m, nums2, n), m);
    }

    //合并数组
    public static int[] mergeArrays (int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i-n];
        }
        return nums1 ;

    }

    //排序
    public static void sortArrays ( int[] array ,int m){
        for (int i = m ; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] < array[j]) {
                    int temp = array[j] ;
                    array[j] = array[i] ;
                    array[i] = temp ; 
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}