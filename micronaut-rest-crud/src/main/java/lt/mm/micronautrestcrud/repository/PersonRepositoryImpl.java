package lt.mm.micronautrestcrud.repository;

import io.micronaut.spring.tx.annotation.Transactional;
import lt.mm.micronautrestcrud.model.Person;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Singleton
public class PersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Person save(Person person) {
        entityManager.persist(person);
        return person;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Person> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Person.class, id));
    }

}
