package skilledPersonFinder;

class Person implements Comparable{
    private String name;
    private String email;
    private String skill;
    private String skillDescription;
    private int skillRate;
    private int salary;

    private Person() {}

    private void setName(String name) {
        this.name = name;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    String getSkill() {
        return skill;
    }
    private void setSkill(String skill) {
        this.skill = skill;
    }
    private void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }
    private void setSkillRate(int skillRate) {
        this.skillRate = skillRate;
    }
    private void setSalary(int salary) {
        this.salary = salary;
    }

    static Person parse(String lineOfFile) {
        Person person = new Person();
        String[] lineOfFileArray = lineOfFile.split(",");
        person.setName(lineOfFileArray[0]);
        person.setEmail(lineOfFileArray[1]);
        person.setSkill(lineOfFileArray[2].toLowerCase());
        person.setSkillDescription(lineOfFileArray[3]);
        person.setSkillRate(Integer.parseInt(lineOfFileArray[4]));
        if (lineOfFileArray.length == PersonFinder.numOfColsInFile) {
            person.setSalary(Integer.parseInt(lineOfFileArray[5]));
        }
        return person;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return name.compareTo(person.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) { return false; }
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", skill=" + skill +
                ", skillDescription='" + skillDescription + '\'' +
                ", skillRate=" + skillRate +
                ", salary=" + salary +
                '}';
    }
}
