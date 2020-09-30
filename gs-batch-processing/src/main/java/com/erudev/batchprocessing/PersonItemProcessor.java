package com.erudev.batchprocessing;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 12:47
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person item) throws Exception {
        final String firstName = item.getFirstName().toUpperCase();
        final String lastName = item.getLastName().toUpperCase();
        return new Person(firstName, lastName);
    }
}
