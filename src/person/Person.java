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
