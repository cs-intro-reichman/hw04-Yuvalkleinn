public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String newStr = "";
        String newVowelStr = "";

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            newStr += ch;
        }

        for (int j = 0; j < newStr.length(); j++) {
            char chnew = newStr.charAt(j);
            if (chnew == 'a' || chnew == 'i' || chnew == 'e' || chnew == 'o' || chnew == 'u' ) {
                chnew -= 32;
            }
            newVowelStr += chnew;
        }

        return newVowelStr;
    }

    public static String camelCase(String string) {
        String camelCaseString = "";
        boolean startNewWord = false;
        boolean isFirstWord = true;
        int charInt;
        char currentChar;
    
        for (int i = 0; i < string.length(); i++) {
            charInt = (int) string.charAt(i);
    
            if (string.charAt(i) != ' ') {
                if (isFirstWord) {
                    if (charInt < 90 && charInt > 65) {
                        charInt += 32;
                    }
                    currentChar = (char) charInt;
    
                    camelCaseString += currentChar;
    
                    if ((i < string.length() + 1) && (string.charAt(i + 1) == ' ')) {
                        isFirstWord = false;
                    }
                } else {
                    // Checking if the letter is Caps
                    if (charInt < 90 && charInt > 65) {
                        // Caps on new word
                        if (startNewWord) {
                            startNewWord = false;
                        } else {
                            // Difference in the ASCII table between lower and upper
                            charInt += 32;
                        }
                    } else {
                        if (startNewWord) {
                            charInt -= 32;
                            startNewWord = false;
                        }
                    }
    
                    currentChar = (char) charInt;
                    camelCaseString += currentChar;
                }
            } else if (!isFirstWord) {
                startNewWord = true;
            }
        }
    
        return camelCaseString;
    }

    public static int[] allIndexOf(String string, char chr) {
        int indexCount = 0; 
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {   
                indexCount++;
            }
        }
    
        int[] indexes = new int[indexCount];
        int current = 0;
    
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                indexes[current] = i;
                current++;
            }
        }
    
        return indexes;
    }
}
