package org.summer.sdt.core;
import java.util.Date;  
  
  
public class TestArrayCopy {  
    public static void main(String[] args) {  
          
  
        Date d1 = new Date();  
        int[] arr = new int[10000000];  
        for(int i = 0; i < 10000000; i++) {  
            arr[i] = i;  
        }  
        Date d2 = new Date();  
          
        System.out.println(d2.getTime() - d1.getTime());  
          
          
        int[] arr2 = new int[10000000];  
        Date d3 = new Date();  
        System.arraycopy(arr,0, arr2, 0, 10000000);  
        Date d4 = new Date();  
        System.out.println(d4.getTime() - d3.getTime());      
    }  
} 