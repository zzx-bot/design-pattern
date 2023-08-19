package com.zzx.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public void removePerson(Person person) {
        this.personList.remove(person);
    }

    public void attach(Action action) {
        this.personList.forEach(person -> person.accept(action));
    }
}
