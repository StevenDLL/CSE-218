package Homeworks.HW_05.p5;

public class CharacterCounter {
    public static int countCharacter(char[] arrayOfCharacters, int start, char charToCount) {
        if (start == arrayOfCharacters.length) {
            return 0;
        }
        if (arrayOfCharacters[start] == charToCount) {
            return (1 + countCharacter(arrayOfCharacters, start + 1, charToCount));
        } else {
            return countCharacter(arrayOfCharacters, start + 1, charToCount);
        }
    }
}
