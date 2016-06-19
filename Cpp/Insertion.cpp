#include <stdio.h>
 
int main()
{
  int  n;
  int array[n];
 
  printf("Enter number of elements\n");
  scanf("%d", &n);
 
  printf("Enter %d integers\n", n);
 
  for (int i = 0; i < n; i++){
  	 scanf("%d", &array[i]);
  }
  /* Store  list */
  int j;
  for(int i = 1; i < n; i++){
     int value = array[i];
     for (j = i - 1; j >= 0 && array[j] > value; j--){
           array[j + 1] = array[j];
     }
     array[j + 1] = value;
  }

  printf("Sorted list in ascending order:\n");
 
  for (int i = 0 ; i < n ; i++ ){
	printf("%d\t", array[i]);
  }
  return 0;
}
