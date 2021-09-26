package com.gl.course.assignment;

class MergeSort {
	
	public void mergeSort(double[] arr, int left, int right, int dir) {
		
		if (left < right) {
			int mid = (left+right)/2;
			//System.out.println("Left is " + left + " mid is " + mid + " right is "+ right);
			
			mergeSort(arr,left,mid,dir);
			mergeSort(arr,mid+1, right,dir);
			
			merge(arr,left,mid,right,dir);
		}
	}
	
	public void merge(double[] arr, int left, int mid, int right, int dir) {
		
		int len1 = mid - left +1;
		int len2 = right - mid; 
		
		double[] leftArr = new double[len1];
		double[] rightArr = new double[len2];
		
		for (int i = 0; i< len1; i++)
			leftArr[i]=arr[left+i];
		for(int j=0; j<len2; j++)
			rightArr[j] = arr[mid+1+j];
			
		int i,j,k;
		i = 0;
		j = 0;
		k = left;
		
		while(i <len1 && j < len2) 
		{
		
		if(dir == 1) 
			{
				
				if (leftArr[i]<=rightArr[j]) 
				{
					arr[k] = leftArr[i];
					i++;
				}
				else 
				{
					arr[k]  = rightArr[j];
					j++;
				}
				k++;
				
			}
		else 
			{
			
				if (leftArr[i]>=rightArr[j]) 
				{
					arr[k] = leftArr[i];
					i++;
				}
				else 
				{
					arr[k]  = rightArr[j];
					j++;
				}
				k++;	
				
			}
		}
		while (i<len1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j<len2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}
	

}
