

public class ArrayExamples {
  static int[] temp = new int[0];
  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    temp = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      temp[i] = arr[arr.length - i - 1];
    }
    for (int k = 0; k < arr.length; k++) {
      arr[k] = temp[k];
    }
  }
  public static void main(String[] args) {
    int [] input = {1,2,3,4,5};
    
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {

    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    arr = newArray;
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { 
        lowest = num; 
      }
    }
    double sum = 0;
    int count = 0;
    for(double num: arr) {
      if(num == lowest) {
        count++; 
        continue; 
      } else {
        sum += num;
      }
    }
    double avg = sum / (arr.length - count);
    return avg;
  }


}

