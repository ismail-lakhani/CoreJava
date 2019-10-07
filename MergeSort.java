package algorithm;

import java.util.Scanner;

/* Java program for Merge Sort */

class MergeSort { 
	

	//Sorting() to divide the array in parts by using the middle point
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
        	//L->Start & r-> End
            int m = (l+r)/2; 
  
            //Using recursion to sort the remaining parts
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            //Calling merge() to merge the arrays together
            merge(arr, l, m, r); 
        } 
    }
	
	
	

	void merge(int array1[], int start, int middle, int end) 
    { 
        //Calculating the size of the divided arrays 
        int size1 = middle - start + 1; 
        int size2 = end - middle; 
  
        //Defining dummy array to save values temporarirly 
        int M[] = new int [size1]; 
        int N[] = new int [size2]; 
  
      //Populating values in the dummy arrays
        for (int i=0; i<size1; ++i) 
            M[i] = array1[start + i]; 
      //Populating values in the dummy arrays
        for (int j=0; j<size2; ++j) 
            N[j] = array1[middle + 1+ j]; 
  
  
        //Merging of the two arrays
        
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = start;
        
        //Comparing two elements of the array
        while (i < size1 && j < size2) 
        { 
        	//Condition to check of the values in 1st array is smaller than 2nd array
            if (M[i] <= N[j]) 
            { 
            	//Assigning the values of the 1st array to the merged array
                array1[k] = M[i]; 
                i++; 
            } 
            //If the 2nd array value is smaller than the first array
            else
            { 
            	//Assigning the values of the 2nd array to the merged array
                array1[k] = N[j]; 
                j++; 
            } 
            //Incrementing the values to move the index location by 1 
            k++; 
        } 
  
        //Checking the size of array 1 is bigger than the 2nd array
        while (i < size1) 
        { 
        	//Populating the extra remaining values of 1st array to the merged array
            array1[k] = M[i]; 
            i++; 
            k++; 
        } 
  
        //Populating the extra remaining values of 2nd array to the merged array
        while (j < size2) 
        { 
            array1[k] = N[j]; 
            j++; 
            k++; 
        } 
    } 
  
    
    
    
    //Using for loop to print the values in the array
	 static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
  
    //Main method
    public static void main(String args[]) 
    { 
        int arr[] = {38,27,43,3,9,82,10}; 
  
        System.out.println("Values in the array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 
	
	
	
	