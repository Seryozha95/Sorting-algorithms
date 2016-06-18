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
  for (int i=n-1; i>=0; i--)
  {
    for (int j=0; j<i; j++)
    {
      if (array[j] > array[j+1])
      {
        int tmp = array[j];
        array[j] = array[j+1];
        array[j+1] = tmp;
      }
    }
  }
 
  printf("Sorted list in ascending order:\n");
 
  for ( int i = 0 ; i < n ; i++ ){
	printf("%d\t", array[i]);
  }
  return 0;
}
