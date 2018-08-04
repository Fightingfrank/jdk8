package org.interview.sortAlgorithm;

import java.util.function.Function;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a = {3,4,2,7,0,6,2,6,27,6,9,10,11};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.BasicBubbleSort(a);
        System.out.println("------------");
        bubbleSort.improveBubbleSort2(a);
    }



    public void BasicBubbleSort(int [] a){
        for(int i = a.length -1 ; i >=0; i--){
            for( int j = 0 ; j <= i - 1; j++){
                if(a[j] > a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        printFunction(a);

    }

    public void improveBubbleSort1(int [] a){
        // 如果经历一趟比较，没有交换任何数据，则证明已排序好，无需进行后续比较
        for(int i = a.length -1 ; i >=0; i--){
            boolean flag = false;
            for( int j = 0 ; j <= i - 1; j++){
                if(a[j] > a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            if(flag == false)
                break;
        }
        printFunction(a);
    }

    public void improveBubbleSort2(int [] a){
        //lastSwapFlag代表上一轮循环最后一次有数据交换的位置，因为后面如果没有数据交换，证明后面已经排好序了
        int lastSwapFlag = a.length - 1;
        for(int i = a.length -1 ; i >=0; ){
            boolean flag = false;
            for( int j = 0 ; j <= i - 1; j++){
                if(a[j] > a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                    lastSwapFlag = j+1;
                }
            }

            i = lastSwapFlag;

            if(flag == false)
                break;
        }
        printFunction(a);
    }

    public void printFunction(int [] a){
        for(int i:a){
            System.out.print(i + " ");
        }
    }

}
