package lt.mm.micronautrestcrud.service;

import lt.mm.micronautrestcrud.model.Person;
import lt.mm.micronautrestcrud.repository.PersonRepository;

import javax.inject.Inject;

public class PersonService {

    @Inject
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person findById(Long id) {
        return personRepository.findById(id)
                .orElseGet(Person::new);
    }
}
