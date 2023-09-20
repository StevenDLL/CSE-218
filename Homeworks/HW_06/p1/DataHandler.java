package Homeworks.HW_06.p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class DataHandler implements Cloneable {
    private LinkedList<String> firstNames;
    private LinkedList<String> lastNames;

    private final Student[] listOfStudents;
    private Student[] sortedByGpa;
    private Student[] sortedByNames;

    public DataHandler() {
        this.firstNames = getCustomData("./src/Homeworks/HW_06/p1/Data/FirstNames.txt");
        this.lastNames = getCustomData("./src/Homeworks/HW_06/p1/Data/LastNames.txt");
        this.listOfStudents = generateStudents(1000);
        this.sortedByGpa = sortArray(this.listOfStudents, compareByGpa());
        this.sortedByNames = sortArray(this.listOfStudents, compareByName());
    }

    public DataHandler(String fNamesPath, String lNamesPath, int amountOfStudents) {
        this.firstNames = getCustomData(fNamesPath);
        this.lastNames = getCustomData(lNamesPath);
        this.listOfStudents = generateStudents(amountOfStudents);
    }

    private LinkedList<String> getCustomData(String path) {
        LinkedList<String> list = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Student[] getListOfStudents() {
        return this.listOfStudents;
    }

    private Student[] generateStudents(int amount) {
        Student[] students = new Student[amount];
        int fSize = firstNames.size();
        int lSize = lastNames.size();
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < amount; i++) {
            Double gpa = random.nextDouble() * (4.0 - 0.0);
            Student student = new Student(this.firstNames.get(random.nextInt(fSize)),
                    this.lastNames.get(random.nextInt(lSize)), Double.valueOf(decimalFormat.format(gpa)));
            students[i] = student;
        }

        return students;
    }

    private Student[] sortArray(Student[] arr, Comparator<Student> comparator) {
        Student[] array = createDeepCopy(arr);
        Arrays.sort(array, comparator);
        return array;
    }

    public LinkedList<Student> searchByGpa(double key) {
        LinkedList<Student> result = new LinkedList<Student>();

        Student keyStudent = new Student("", "", key);

        int startIdx = Arrays.binarySearch(this.sortedByGpa, keyStudent, compareByGpa());
        if (startIdx < 0) {
            return result;
        }
        //Check right of idx
        for (int i = startIdx; i < this.sortedByGpa.length; i++) {
            if (this.sortedByGpa[i].getGpa() == key) {
                result.add(this.sortedByGpa[i]);
            }
        }
        //Check left of idx
        for (int i = startIdx - 1; i > -1; i--) {
            if (this.sortedByGpa[i].getGpa() == key) {
                result.add(this.sortedByGpa[i]);
            }
        }
        return result;
    }

    public LinkedList<Student> searchByFullName(String key) {
        LinkedList<Student> result = new LinkedList<Student>();
        String[] temp = key.split(" ");
        Student keyStudent = new Student(temp[0], temp[1], 0.0);

        int startIdx = Arrays.binarySearch(this.sortedByNames, keyStudent, compareByName());
        if (startIdx < 0) {
            return result;
        }
        //Check right of idx
        for (int i = startIdx; i < this.sortedByNames.length; i++) {
            if (this.sortedByNames[i].getFullName().equals(key)) {
                result.add(this.sortedByNames[i]);
            }
        }
        //Check left of idx
        for (int i = startIdx - 1; i > -1; i--) {
            if (this.sortedByNames[i].getFullName().equals(key)) {
                result.add(this.sortedByNames[i]);
            }
        }
        return result;
    }

    private Comparator<Student> compareByName() {
        return new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getFullName().compareTo(s2.getFullName());
            }
        };
    }

    private Comparator<Student> compareByGpa() {
        return new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getGpa(), s2.getGpa());
            }
        };
    }

    public void saveData(String text, File fileToSave) {

        try {
            FileWriter fileWriter = new FileWriter(fileToSave, false);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Student[] createDeepCopy(Student[] arr) {
        Student[] newData = new Student[arr.length];
        Student[] clone = arr.clone();
        for (int i = 0; i < newData.length; i++) {
            newData[i] = clone[i];
        }
        return newData;
    }
}
