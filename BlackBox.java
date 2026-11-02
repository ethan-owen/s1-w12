public class BlackBox {
    
    public int findIndexOfLetter(String word, String letter){
        int i = 0;
        while (i < word.length()){
            if (word.substring(i, i+1).equals(letter)){
                return i;
            }
            i ++;
        }
        return -1;
    }


}
