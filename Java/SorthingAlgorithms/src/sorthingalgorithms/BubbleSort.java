package sorthingalgorithms;
/**
 *
 * @author seryozha
 */
public class BubbleSort {
   /**
    * The function made to sort array
    * @param array array to sort
    */
    public void bubble(int array[]){
       for (int i = array.length-1; i>=0; i--){
           for (int j = 0; j < i; j++){
               if (array[j] > array[j+1]){ 
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;}
                }
        }
    }
}
