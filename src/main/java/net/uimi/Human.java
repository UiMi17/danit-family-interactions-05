package net.uimi;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int bDayYear;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int bDayYear) {
        this.name = name;
        this.surname = surname;
        this.bDayYear = bDayYear;
    }

    public Human(String name, String surname, int bDayYear, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.bDayYear = bDayYear;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getbDayYear() {
        return bDayYear;
    }

    public void setbDayYear(int bDayYear) {
        this.bDayYear = bDayYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String greetPet() {
        return String.format("Привіт, %s", family.getPet().getNickname());
    }

    public String describePet() {
        String trickyDesc = family.getPet().getTrickLevel() <= 50 ? "майже не хитрий" : "дуже хитрий";
        return String.format("У мене є %s, їй %s років, він %s", family.getPet().getSpecies(), family.getPet().getAge(), trickyDesc);
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year='%s', iq='%s', schedule='%s'}", name, surname, bDayYear, iq, Arrays.deepToString(schedule));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return bDayYear == human.bDayYear &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, bDayYear);
    }
}
