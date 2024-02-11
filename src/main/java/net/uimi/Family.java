package net.uimi;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        child.setFamily(this);
        if (children == null) {
            children = new Human[1];
            children[0] = child;
        } else {
            children = Arrays.copyOf(this.children, this.children.length + 1);
            children[children.length - 1] = child;
        }
    }

    public boolean deleteChild(int childIndex) {
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != childIndex) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        int familyCount = 2;
        if (children != null) {
            familyCount += children.length;
        }
        return familyCount;
    }

    @Override
    public String toString() {
        return String.format("mother='%s', father='%s', pet='%s', children='%s'", mother.toString(), father.toString(), pet.toString(), Arrays.toString(children));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }
}
