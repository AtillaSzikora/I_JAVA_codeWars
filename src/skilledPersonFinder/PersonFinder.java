package skilledPersonFinder;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.File;
import java.util.*;

public class PersonFinder {
    static int numOfColsInFile;
    private static String[] wantedSkills;
    private static ArrayList<Person> personList;

    public static void main(String[] args) {
        wantedSkills = enterWantedSkills();
        personList = csvToPersonList();
        System.out.println(soloSkillPersons().toString().replace("}, ", "\n"));
        System.out.println();
        System.out.println(multipleSkillsPersons().toString().replace("}, ", "\n"));
    }

    private static ArrayList<Person> soloSkillPersons() {
        ArrayList<Person> resultList = new ArrayList<>();
        for (Person person : personList) {
            if (Arrays.asList(wantedSkills).contains(person.getSkill().toLowerCase())) {
                resultList.add(person);
            }
        }
        Collections.sort(resultList);
        return resultList;
    }

    private static ArrayList<Person> multipleSkillsPersons() {
        ArrayList<Person> resultList = new ArrayList<>();
        ArrayList<Person> sortedPersons = soloSkillPersons();
        int listSize = sortedPersons.size();
        for (int i = 0; i < listSize; i++) {
//            if () {}
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
        numOfColsInFile = scanner.nextLine().split(",").length;  // also skip heading line of file
        while (scanner.hasNextLine()) {
            currentLineOfFile = scanner.nextLine();
            resultList.add(Person.parse(currentLineOfFile));
        }
        scanner.close();
        return resultList;
    }
}