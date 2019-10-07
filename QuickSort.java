package algorithm;

import java.util.Scanner;




//Java program for implementation of QuickSort 
class QuickSort {
	
	 
	private static Scanner sc;

			//Sort() is to divide the elements in the array and sort
			void sort(int arr[], int low, int high) 
			{ 
				if (low < high) 
				{ 
					//pi is partitioning index, arr[pi] is 
					//now at right place 
					int pi = partition(arr, low, high); 

				//Sorting the first half of array i.e
					//arr[low] till arr[middle] 
					sort(arr, low, pi-1); 
					
				//Sorting the second half of array i.e
				//	arr[middle+1] till arr[high] 
					sort(arr, pi+1, high); 
				} 
			} 
			
	
		//Taking the last element as pivot i.e. array[high]
		int partition(int arr[], int low, int high) 
		{ 
			//Assigning the pivot element
			int pivot = arr[high]; 
			
			//Here the value of 'i' becomes '-1'
			int i = (low-1); // index of smaller element 
			
			//For loop to compare the pivot values wiht the values in the array
			for (int j=low; j<high; j++) 
			{ 
				//If the value is less than or equal to the pivot value
				if (arr[j] <= pivot) 
				{ 
					i++; //Increasing the 'i' by 1. 

//				To keep all the smaller values to the left
					//swapping  arr[i] and arr[j] 
					int temp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = temp; 
				} 
			} 

			//Swapping the pivot value with the arr[i+1] 
			int temp = arr[i+1]; 
			arr[i+1] = arr[high]; 
			arr[high] = temp; 

			return i+1; 
		} 


		

		//Using for loop to print the values in the array
		static void printArray(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i=0; i<n; ++i) 
				System.out.print(arr[i]+" "); 
			System.out.println(); 
		} 

		//Main method
		public static void main(String args[]) 
		{ 
			sc = new Scanner(System.in);
	    	
	    	System.out.println("Input the size of array");
	    	int input1 =sc.nextInt();
	    	
	    	int[] arr =new int[input1];
	    	
	    	System.out.println("Input the values in the array to sort");
	    	
	    	//Populating the array with user input
	    	{
	    		for(int j=0;j<input1;j++)
	    		arr[j]=sc.nextInt();
	    		}
	    	
	    	//Displaying the values in the array
	        System.out.println("Given Array"); 
	        printArray(arr); 
	        
	        int n = arr.length;

	      //Calling Quicksort()
			QuickSort ob = new QuickSort(); 
			ob.sort(arr, 0, n-1); 

			//Displaying the final sorted array
			System.out.println("sorted array"); 
			printArray(arr); 
		} 
	} 



