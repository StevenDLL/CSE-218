package Homeworks.HW_05.p1;

public class MemberCheck {
    public <T> boolean isMember(T[] array, T itemToFind, int indexToStartFrom) {
        for (int i = indexToStartFrom; i < array.length; i++) {
            if (array[indexToStartFrom] == itemToFind) {
                return true;
            } else {
                return isMember(array, itemToFind, ++indexToStartFrom);
            }
        }
        return false;
    }
}
