import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
     for(int i=0; i<list.size(); i++){
      for(int y=0; y<list.size(); y++){
        if(i==y){
        continue;//when the same elements happen at the same time, we will skip this one
      }
      if(list.get(i).equals(list.get(y))){
      count++;
      }
      }
   }
      return count;
   }
   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
