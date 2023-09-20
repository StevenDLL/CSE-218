package Homeworks.Final_HW.p1;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class StudentBag {
    public final HashMap<Integer, Student> studentHashSet = new HashMap<>(100000);

    public StudentBag() {
        doGeneration();
    }

    private void doGeneration() {

        String[] listOfNames = getAllPossibleNames(new File("./src/Homeworks/Final_HW/p1/LastNames.txt"));
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        int sizeOfNames = listOfNames.length;
        int randomAmount = random.nextInt(100001);

        for (int i = 0; i < randomAmount; i++) {
            Double gpa = random.nextDouble() * (4.0 - 0.0);
            Student student = new Student(listOfNames[random.nextInt(sizeOfNames)], Double.valueOf(decimalFormat.format(gpa)));
            this.studentHashSet.put(Integer.valueOf(student.getUniqueID()), student);
        }
    }

    private String[] getAllPossibleNames(File fileToRead) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileToRead);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String tempStr = "";
            while ((tempStr = bufferedReader.readLine()) != null) {
                stringBuilder.append(tempStr).append("\s");
            }
            reader.close();
            bufferedReader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return stringBuilder.toString().split("[ ]+");
    }

    public void displayIfHigherThan(Double minGPA) {
        List<Integer> list = studentHashSet.keySet().stream()
                .filter(s -> studentHashSet.get(s).getGpa() >= minGPA).toList();
        list.forEach(s -> System.out.println(studentHashSet.get(s)));
    }

    public void displayIfBetween(int min, int max) {
        List<Integer> list = studentHashSet.keySet().stream()
                .filter(s -> studentHashSet.get(s).getName().toUpperCase().charAt(0) >= min
                        && studentHashSet.get(s).getName().toUpperCase().charAt(0) <= max).toList();
        list.forEach(s -> System.out.println(studentHashSet.get(s)));
    }


}
