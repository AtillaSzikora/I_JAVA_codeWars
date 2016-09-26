package person;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ParsePersons {
    public static void main(String[] args) {
        System.out.println(getWantedPersons().toString().replace("}, ", "\n"));
    }

    private static ArrayList<Person> getWantedPersons() {
        ArrayList<Person> resultList = new ArrayList<>();
        String[] wantedSkills = getWantedSkills();
        ArrayList<Person> personList = csvToPersonList();
        for (Person person : personList) {
            if (Arrays.asList(wantedSkills).contains(person.getSkill().toLowerCase())) {
                resultList.add(person);
            }
        }
        return resultList;
    }

    private static String[] getWantedSkills() {
        System.out.print("List the skills you're looking for separated by a comma: ");
        return new Scanner(System.in).nextLine().split(",");
    }

    private static ArrayList<Person> csvToPersonList() {
        Scanner scanner = null;
        File file = new File("src\\person\\persons.csv");
        String currentLineOfFile;
        ArrayList<Person> resultList = new ArrayList<>();
        try {
            scanner = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String skipFirstLineOfFile = scanner.nextLine();
        while (scanner.hasNextLine()) {
            currentLineOfFile = scanner.nextLine();
            Person person = Person.parse(currentLineOfFile);
            resultList.add(person);
        }
        scanner.close();
        return resultList;
    }
}
