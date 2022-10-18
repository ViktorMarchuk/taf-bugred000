package by.marchuk.task1.main;

public class CountingCharacters{
    public static void main(String[] args){
        String s = "he,llo,!";
        System.out.println("Number of characters is " + showAmount(s));

    }

    public static int showAmount(String s){
        if(s == null){
            System.out.println("The string not be null");
        }
        char[] stringToChar = s.toCharArray();
        int count = 0;
        for(int i = 0; i < stringToChar.length; i++){
            if(stringToChar[i] == ','){
                count++;
            }
        }
        return count;
    }
}

// Number of characters is 2