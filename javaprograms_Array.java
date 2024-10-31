public class Main {
  public static int cal(int nums[], int key) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static int Largest(int nums[]) {
    int a = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (a < nums[i]) {
        a = nums[i];
      }
    }
    return a;
  }

  public static int Binary(int nums[], int key) {
    int first = 0, last = nums.length - 1;

    while (first <= last) {
      int mid = (first + last) / 2;
      if (nums[mid] == key) {
        return mid;
      }
      if (nums[mid] < key) {
        first = mid + 1;

      } else {
        last = mid - 1;
      }
    }
    return -1;
  }

  public static int Reserve(int nums[]) {
    int first = 0, last = nums.length - 1;
    while (first < last) {
      int temp = nums[first];
      nums[first] = nums[last];
      nums[last] = temp;
      first++;
      last--;
    }
    return -1;

  }

  public static int pairs(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        System.out.print("(" + nums[i] + "," + nums[j] + ") ");
      }
      System.out.println();
    }
    return -1;
  }
  public static void subarray(int nums[]){
     for( int i = 0; i < nums.length;i++){
       for ( int j = i; j< nums.length; j++){
         System.out.print("[");
         for( int k=i; k<=j; k++){
         System.out.print(nums[k]);
           if( k<j){
             System.out.print(", ");
           }
         }
         System.out.print("]");
         System.out.println();
       }
       System.out.println();
     }
    
    
  }
  public static int subarraymax(int nums[]){
     int a= Integer.MIN_VALUE;
     for( int i = 0; i < nums.length;i++){
       for ( int j = i; j< nums.length; j++){
          int b=0;
         for( int k=i; k<=j; k++){
           b +=nums[k];
         }
         if(a<b){
           a=b;
         }
        
       }
     
      
     }
    return a;

  }
   public static int  subarraymaxkadanes(int[] nums) {
          int currentSum=0;
          int maxSum= Integer.MIN_VALUE;
          for (int i=0; i< nums.length; i++){
              currentSum= currentSum+nums[i];
              if(currentSum<0){
                  currentSum=0;
              }
              maxSum=Math.max(currentSum,maxSum);
          }

        return maxSum;

      }
  public static int prefixmaxSubarray(int nums[]){
    int maxsum= Integer.MIN_VALUE;
    int currsum = 0;
    int prefix[]= new int [nums.length];
    prefix[0] = nums[0];
    for ( int i=1; i< prefix.length; i++){
      prefix[i]= prefix[i-1]+ nums[i];
    }
    
    for ( int i= 0; i< nums.length; i++){
      for( int j=0; j< nums.length; j++){
        currsum =i==0?prefix[j]: prefix[j]-prefix[i-1];
        if( maxsum<currsum){
          maxsum=currsum;
        }
      }
      
    }
    return maxsum;
  }
  
  public static void main(String[] args) {
    int nums[] = { -1,-2 };
    
    System.out.println(subarraymax(nums));
      
  }
}