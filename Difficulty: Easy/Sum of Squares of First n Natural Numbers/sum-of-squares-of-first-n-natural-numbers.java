class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {
        int sum=0;
      for(int i=1; i<=number; i++){
          sum += i * i;
      }
        return sum;
    }
}