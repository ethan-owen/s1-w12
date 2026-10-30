public class StringsLoops{
    public StringsLoops(){
  
    }
    // string destroy loop
    // strings stays intact, alter some other variable
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }
    return count;

    }
    // "sean" , 3 ----> "seanseansean"
    public String copy(String s, int num){
      String z = "";
      while (num > 0){
        z = z + s;
        num--;
      }
      return z;
    }
  // s1 = "sean" s2 = "frog" ==> "sferaong"
    public String interweaving(String s1, String s2){
      String z = "";
      for(int i = 0; i < s1.length(); i++){
        z = z + s1.substring(i, i+1) + s2.substring(i, i+1);
      }
      return z;
    }
  
  
  }