
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johan C
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isInOrder("moms"));
        System.out.println(main.move("welcome"));
        System.out.println(main.reverseCase("MANY THANKS"));
        System.out.println(Arrays.toString(main.factorize(12)));
        System.out.println(main.capSpace("HeLLoBrOtHeRS"));
        System.out.println(main.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        System.out.println(main.countWords("This is a test"));
        System.out.println(main.rps("scissors", "rock"));
        System.out.println(main.capToFront("hApPy"));
        System.out.println(main.doubleChar("1234!_ "));
    }
    
    public boolean isInOrder(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(0) > str.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    public String move(String str){
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            char tmp = (char) (str.charAt(i) + 1);
            newString += tmp; 
        }
        return newString;
    }
    
    public String reverseCase(String str){
        String[] splitedString = str.split("");
        String result = "";
        for(int i = 0; i < splitedString.length; i++){
            String word = splitedString[i];
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) >= 'a' && word.charAt(j) <= 'z'){
                    result += word.toUpperCase().charAt(j);
                }else{
                    result += word.toLowerCase().charAt(j);
                }
            }
        }
        return result;
    }
    
    public int[] factorize(int value){
        List<Integer> tmp = new ArrayList<>();
        for(int i = 1; i <= value; i++){
            if(value % i == 0){
                tmp.add(i);
            }
        }
        
        Collections.sort(tmp);

        
        int[] result = new int[tmp.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = tmp.get(i);
        }
        return result;
    }
    
    public String capSpace(String str){
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                newString += " " + str.charAt(i);
            }else{
                newString += str.charAt(i);
            }
        }
        return newString.toLowerCase();
    }
    
    public boolean containsDuplicate(int[] nums){
        
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        int len = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i < len-1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
    
    public int countWords(String s){
        int nrOfWords = 1;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                nrOfWords++;
            }
        }
        
        return nrOfWords;
    }
    
    public String rps(String s1, String s2){
        
        if(s1.equals("rock") && s2.equals("paper")){
            return "Player 2 wins";
        }else if(s1.equals("rock") && s2.equals("scissors")){
            return "Player 1 wins";
        }else if (s1.equals("paper") && s2.equals("rock")){
            return "Player 1 wins";
        }else if(s1.equals("paper") && s2.equals("scissors")){
            return "Player 2 wins";
        }else if(s1.equals("scissors") && s2.equals("paper")){
            return "Player 1 wins";
        }else if(s1.equals("scissors") && s2.equals("rock")){
            return "Player 2 wins";
        }
        return "TIE";
    }
    
    public String capToFront(String s1){
        String tmp = "";
        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z'){
                tmp += s1.charAt(i);
            }
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z'){
                tmp += s1.charAt(i);
            }
        }
        return tmp;
    }
    
    public String doubleChar(String s) {
        int index = 0;
        String tmp = "";
        
        for(int i = 0; i < s.length(); i++){
            tmp += s.charAt(i) + "" + s.charAt(index);
            index++;
        }
        return tmp;
    }
}

/*


        else if(s1.equals("scissors") && s2.equals("scissors")){
            return "TIE";
        }else if(s1.equals("paper") && s2.equals("paper")){
            return "TIE";
        }else if(s1.equals("rock") && s2.equals("rock")){
            return "TIE";
        }

*/
