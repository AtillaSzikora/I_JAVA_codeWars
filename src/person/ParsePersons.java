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
        int numOfColsInFile = 0;
        File file = new File("src\\person\\persons.csv");
        String[] nextLineArray;
        Person person;
        ArrayList<Person> resultList = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            numOfColsInFile = ",".split(scanner.nextLine()).length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (scanner != null && scanner.hasNextLine()) {
            nextLineArray = scanner.nextLine().split(",");
            person = new Person();
            person.setName(nextLineArray[0]);
            person.setEmail(nextLineArray[1]);
            person.setSkill(nextLineArray[2].toLowerCase());
            person.setSkillDescription(nextLineArray[3]);
            person.setSkillRate(Integer.parseInt(nextLineArray[4]));
            if (nextLineArray.length == numOfColsInFile) {
                person.setSalary(Integer.parseInt(nextLineArray[5]));
            }
            resultList.add(person);
        }
        scanner.close();
        return resultList;
    }
}
