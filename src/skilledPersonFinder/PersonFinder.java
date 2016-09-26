package skilledPersonFinder;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PersonFinder {
    static int numOfColsInFile;
    
    public static void main(String[] args) {
        System.out.println(getWantedPersons().toString().replace("}, ", "\n"));
    }

    private static ArrayList<Person> getWantedPersons() {
        ArrayList<Person> resultList = new ArrayList<>();
        String[] wantedSkills = enterWantedSkills();
        ArrayList<Person> personList = csvToPersonList();
        for (Person person : personList) {
            if (Arrays.asList(wantedSkills).contains(person.getSkill().toLowerCase())) {
                resultList.add(person);
            }
        }
        return resultList;
    }

    private static String[] enterWantedSkills() {
        System.out.print("Enter the skills you're looking for separated by a comma: ");
        String[] wantedSkills = new Scanner(System.in).nextLine().split(",");
        for (int i = 0; i < wantedSkills.length; i++) {
            wantedSkills[i] = wantedSkills[i].trim().toLowerCase();
        }
        return wantedSkills;
    }

    private static ArrayList<Person> csvToPersonList() {
        Scanner scanner = null;
        File file = new File("src\\skilledPersonFinder\\persons.csv");
        String currentLineOfFile;
        ArrayList<Person> resultList = new ArrayList<>();
        try {
            scanner = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        numOfColsInFile = scanner.nextLine().length();  // also skip heading line of file
        while (scanner.hasNextLine()) {
            currentLineOfFile = scanner.nextLine();
            resultList.add(Person.parse(currentLineOfFile));
        }
        scanner.close();
        return resultList;
    }
}