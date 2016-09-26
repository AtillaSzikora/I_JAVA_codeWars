package person;

class Person {
    private String name;
    private String email;
    private String skill;
    private String skillDescription;
    private int skillRate;
    private int salary;

    Person() {}

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getEmail() {
        return email;
    }
    void setEmail(String email) {
        this.email = email;
    }
    String getSkill() {
        return skill;
    }
    void setSkill(String skill) {
        this.skill = skill;
    }
    String getSkillDescription() {
        return skillDescription;
    }
    void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }
    int getSkillRate() {
        return skillRate;
    }
    void setSkillRate(int skillRate) {
        this.skillRate = skillRate;
    }
    int getSalary() {
        return salary;
    }
    void setSalary(int salary) {
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
        if (lineOfFileArray.length == 6) {
            person.setSalary(Integer.parseInt(lineOfFileArray[5]));
        }
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", skill=" + skill +
                ", getSkillDescription='" + skillDescription + '\'' +
                ", getSkillRate=" + skillRate +
                ", salary=" + salary +
                '}';
    }
}
