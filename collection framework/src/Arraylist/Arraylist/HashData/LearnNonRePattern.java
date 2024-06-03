package Arraylist.HashData;

public class LearnNonRePattern {
    //The idea is to loop over the string and for every character check the occurrence
    // of the same character in the string. If the count of its occurrence is 1
    // then return that character. Otherwise, search for the remaining characters.
    public static void main (String [] args){
        String string="greekforgreek";
        int index=-1;
        char fab=' ';

        if(string.length()==0){
            System.out.println("EMPTY STRING");
        }

        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fab = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == string.length()-1) {
            System.out.println("All characters are repeating");
        }
        else {
            System.out.println("First non-repeating character is " + fab);
        }
    }
}


