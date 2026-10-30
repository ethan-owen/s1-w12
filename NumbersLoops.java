public class NumbersLoops{
    public NumbersLoops(){
      int x = 0;
      while (x<=10){
        System.out.println(x);
        x++;
      }
      for(int i = 0; i < 11; i++ ){
        System.out.println(i);
      }
    }
  
    public int digitSum(int num){
      int sum = 0;
      for(int i = 1; i <= num; i++){
        sum += i;
      }
      return sum;
    }
  
    public int reverseNum(int num){
      int newNum = 0;
      while (num != 0){
        newNum = newNum * 10;
        newNum += num % 10;
        num = num / 10;
      }
      return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      if (start < finish){
        int n = 0;
        while(start<=finish){
          if(start == reverseNum(start)){
            n ++;
          }
          start ++;
        }
        return n;
      } else {
        return 0;
      }
    }
  
  
  }
