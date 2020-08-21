package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String s = "asdf";
        String s1 = "asdf";
        char[] cha = s.toCharArray();
        char[] cha1 = s1.toCharArray();
        Arrays.sort(cha);
        Arrays.sort(cha1);
        System.out.println(Arrays.toString(cha));
        System.out.println(Arrays.toString(cha1));

        List<char[]> allCharArray = new ArrayList<>();
        allCharArray.add(cha);
        System.out.println(allCharArray.contains(cha1));
    }
}
