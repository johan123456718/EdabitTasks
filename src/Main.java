
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
        System.out.println(main.toHex("hello world"));
        System.out.println(main.factorial(3));
        System.out.println("-----------------");
        System.out.println(main.bunnyEars(2));
        System.out.println("-----------------");
        System.out.println(main.fibonacci(7));
        System.out.println("-----------------");
        System.out.println(main.bunnyEars2(3));
        System.out.println("-----------------");
        System.out.println(main.triangle(1));
        System.out.println("-----------------");
        System.out.println(main.sumDigit(126));
        System.out.println("-----------------");
        System.out.println(main.powerN(3, 4));
        System.out.println("-----------------");
        System.out.println(main.countX("xxxx"));
        System.out.println("-----------------");
        System.out.println(main.countHi("hixxhixhixhihi"));
        System.out.println("-----------------");
        System.out.println(main.changeXY("coyex"));
        System.out.println("-----------------");
        System.out.println(main.noX("xaxbabaaaaaxxxxxxxxxxxx"));
        System.out.println("-----------------");
        System.out.println(main.array6(new int[]{1,1,1,68,4}, 0));
        System.out.println("-----------------");
        System.out.println(main.array11(new int[]{1,0,3,11,4,3,11}, 0));
        System.out.println("--------array220---------");
        System.out.println(main.array220(new int[]{1,2,20}, 0));
        System.out.println("--------allStars---------");
        System.out.println(main.allStar("hello world"));
        System.out.println("--------pairStar---------");
        System.out.println(main.pairStar("hello"));
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
    
    public String toHex(String str) {
        String tmp = "";
        int hex;
        for(int i = 0; i < str.length(); i++){
            hex = str.charAt(i);
            tmp += Integer.toHexString(hex) + " ";
        }
        return tmp;
    }
    
    public int factorial(int n) {
        return factorial(n, 1);
    }
    
    private int factorial(int n, int result){
        if(n == 0){
            return result;
        }
        
        return factorial(n - 1, result *= n);
    }
    
    
    public int bunnyEars(int bunnies) {
        if(bunnies == 0){
            return 0;
        }
        
        return 2 + bunnyEars(bunnies -1);
    } 
    
    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public int bunnyEars2(int bunnies) {
        System.out.println("bunnies: "  + bunnies);
        
        if(bunnies == 0){
            return 0;
        }else if(bunnies % 2 == 1){
            return 2 + bunnyEars2(bunnies - 1);
        }
        return 3 + bunnyEars2(bunnies - 1);
    }
    
    public int triangle(int rows) {
        if(rows == 0){
            return 0;
        }
        
        return rows + triangle(rows - 1);
    }
    
    public int sumDigit(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        
        return 1 + sumDigit(n / 10);
    }
    
    public int powerN(int base, int n){
        if(base > 0 && n == 0){
            return 1;
        }else if(base > 0 && n == 1){
            return base;
        }
        
        return base * powerN(base, n - 1);
    }
    
    public int countX(String str) {
        char[] tmp = str.toCharArray();
        return countX(tmp, 0);
    }
    
    private int countX(char[] tmp, int index){
        int result = 0;
        if(index < tmp.length){
            if(tmp[index] == 'x'){
                result++;
            }
            return result + countX(tmp, index + 1);
        }
        return 0;
    }
    
    public int countHi(String str) {
        if(!str.contains("hi")){
            return 0;
        }
        return countHi(str, 0);
    }
    
    private int countHi(String str, int index){
        int count = 0;
                System.out.println(index);
        if(index < str.length()-1){
            if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                count++; 
            }
            return count + countHi(str, index+ 1);
        }

        return count;
    }
    
    public String changeXY(String str) {  
        str = str.toLowerCase();
        if(str.length() == 0){
            return "";
        }
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x'){
                str = str.replace("x", "y");
            }
            
            if(str.charAt(i) == 'y'){
                
            }
        }
        return str;
    }
    
    public String noX(String str){
        if(!str.contains("x")){
            return str;
        }
        
        return noX(str, 0, "");
    }
    
    private String noX(String str, int index, String tmp){
        
        if(index == str.length()){
            return tmp;
        }
        
        if(index < str.length()){
            if(str.charAt(index) != 'x'){
                tmp += str.charAt(index);   
            }
        }
        
        return noX(str, index + 1, tmp);
    }
    
    
    public boolean array6(int[] nums, int index) {
        if(nums.length == 0){
            return false;
        }
        
        if(index < nums.length){
            System.out.println(nums[index]);
            if(nums[index] == 6){
                return true;
            }else{
                return array6(nums, index + 1);
            }
        }
        return false;
    }
    
    
    public int array11(int[] nums, int index) {
        if(nums.length == 0){
            return 0;
        }
        
        return array11(nums, index, 0);
    }
    
    private int array11(int[] nums, int index, int count){
        
        if(index > nums.length){
            return count;
        }
        if(index < nums.length){
            if(nums[index] == 11){
                return array11(nums, index + 1, count + 1);
            }
        }
        return array11(nums, index + 1, count);
    }

    public boolean array220(int[] nums, int index) {
        if(index >= nums.length - 1)
            return false;

        return nums[index+1] == 10 * nums[index] || array220(nums, index + 1);
    }
    
    public String allStar(String str) {
        if(str.isEmpty()){
            return "";
        }
        
        return allStar(str, 0, new StringBuilder());
    }
    
    private String allStar(String str, int index, StringBuilder builder){
        if(index == str.length()-1){
            return builder.toString() + str.charAt(index);
        }
        return allStar(str, index + 1, builder.append(str.charAt(index)).append("*"));
    }
    
    public String pairStar(String str) {
        if(str.isEmpty()){
            return "";
        }
        
        return pairStar(str, 0, new StringBuilder());
    }
    
    private String pairStar(String str, int index, StringBuilder sb){
        if(index > str.length() - 1){
            return sb.toString();
        }else{
            sb.append(str.charAt(index));
            if(index < str.length() - 1){
                if(str.charAt(index) == str.charAt(index + 1)){
                    sb.append("*");
                }   
            }
        }
        return pairStar(str, index + 1, sb);
    }
}
