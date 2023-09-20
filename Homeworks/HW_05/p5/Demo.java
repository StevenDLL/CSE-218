package Homeworks.HW_05.p5;


public class Demo {
    public static void main(String[] args) {
        //P5
        char[] chars = {'a', 'b', 'c', 'd', 'a', 'b', 'a'};
        System.out.println("'a' char count: " + CharacterCounter.countCharacter(chars, 0, 'a'));
        System.out.println("'b' char count: " + CharacterCounter.countCharacter(chars, 0, 'b'));
    }
}
