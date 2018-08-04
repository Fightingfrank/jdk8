package org.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);

        Person person2 = new Person("lisi", 30);

        Person person3 = new Person("wangwu", 40);

        List<Person> persons = Arrays.asList(person1,person2,person3);


    }

    public List<Person> getPersonByUsername(String username, List<Person> persons){
        return persons.stream().filter( person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }
}
