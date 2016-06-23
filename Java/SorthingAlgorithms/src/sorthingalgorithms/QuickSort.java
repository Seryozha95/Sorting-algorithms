/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorthingalgorithms;

/**
 *
 * @author seryozha
 */
public class QuickSort {

    public void quick(int[] arr, int low, int high){
        if (arr == null || arr.length == 0 || low >= high){
			return;
        }
	// pick the pivot
	int middle = low + (high - low) / 2;
	int pivot = arr[middle];
	// make left < pivot and right > pivot
	int i = low, j = high;
	while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
            	j--;
            }
            if (i <= j) {
                int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
            }
	} 
	// recursively sort two sub parts
	if (low < j){
            quick(arr, low, j);
        }
        if (high > i){
                quick(arr, i, high);
        }
    }
}
