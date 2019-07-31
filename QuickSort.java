public class QuickSort {
2	    public static void main(String[] args) {
      /*** VISUALIZE STEP BY STEP: https://goo.gl/ngFx7j ***/

3	      int[] a = new int[] {5, 2, 9, 7, 10, 12, 1};
4	      quicksort(a, 0, a.length - 1);
5	    }
6	    
7	    public static void quicksort(int[] arr, int left, int right) {
8	      int index = partition(arr, left, right); 
9	      if (left < index - 1) {
10	        quicksort(arr, left, index - 1);
11	      }
12	      if (index < right) {
13	       quicksort(arr, index, right); 
14	      }
15	    }
16	    
17	    public static int partition(int[] arr, int left, int right) {
18	       int pivot = arr[(left + right) / 2];
19	       while (left <= right) {
20	        while (arr[left] < pivot) {
21	         left++; 
22	        }
23	        while (arr[right] > pivot) {
24	          right--; 
25	        }
26	        if (left <= right) {
27	          int temp = arr[right];
28	          arr[right] = arr[left];
29	          arr[left] = temp;
30	          left++;
31	          right--;
32	        }   
33	       }
34	       return left;
35	    }
36	}
