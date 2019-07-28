package lt.mm.micronautrestcrud.repository;

import lt.mm.micronautrestcrud.model.Person;

import java.util.Optional;

public interface PersonRepository {

    Person save(Person person);

    Optional<Person> findById(Long id);

}
