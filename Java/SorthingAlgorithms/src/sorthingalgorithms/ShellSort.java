package sorthingalgorithms;

/**
 *
 * @author seryozha
 */
public class ShellSort {
    
    public  void shell(int[] array) {
    int inner, outer;
 
    int delta = array.length / 2;
    while (delta > 0) {
      for (outer = delta; outer < array.length; outer++) {
       int tep = array[outer];
        inner = outer;
 
        while (inner > delta - 1 && array[inner - delta] >= tep) {
          array[inner] = array[inner - delta];
          inner -= delta;
        }
        array[inner] = tep;
      }
     delta = delta / 2;
    }
  }
}
