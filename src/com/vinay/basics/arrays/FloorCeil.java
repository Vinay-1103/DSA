package com.vinay.basics.arrays;

public class FloorCeil {
//    Linear
    /*static int findFloor(int[] arr,int x){
        int floor=-1;
        for(int i=0;i< arr.length;i++){
            if (arr[i]<=x){
                floor=arr[i];
            } else{
                break;
            }
        }
        return floor;
    }
    static int findCeil(int[] arr,int x){
        int ceil=-1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>=x){
                ceil=arr[i];
                break;
            }
        }
        return ceil;
    }*/
//    or
    /*static void floorAndceil(int[] arr,int x){
        int floor=-1;int ceil=-1;{
            for (int i=0;i< arr.length;i++){
                if (arr[i]==x){
                    floor=arr[i];
                    ceil=arr[i];
                    break;
                } else if (arr[i]<x) {
                    floor=arr[i];
                }else {
                    ceil=arr[i];
                    break;
                }
            }
            System.out.println("floor "+floor);
            System.out.println("ceil "+ceil);
        }
    }*/


//    Binary
    static int findFloor(int[] arr,int x){
        int low=0,high=arr.length-1;
        int floor=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==x){
                return mid;
            } else if (arr[mid]<x) {
                floor=arr[mid];
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return floor;
    }

    static int findCeil(int[] arr,int x){
        int low=0,high=arr.length-1;
        int ceil=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==x){
                return mid;
            } else if (arr[mid]>x) {
                ceil=arr[mid];
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ceil;
    }



    public static void main(String[] args) {
        int[] arr={2,5,10,11,15,17,17,20};
        int num=16;
//        floorAndceil(arr,num);
//        int c=findCeil(arr,num);
//        System.out.println(f+" "+c);
        System.out.println(findFloor(arr,num));
        System.out.println(findCeil(arr,num));
    }
}
