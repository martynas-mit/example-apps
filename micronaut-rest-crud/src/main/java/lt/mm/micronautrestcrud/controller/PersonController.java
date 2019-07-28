package lt.mm.micronautrestcrud.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import lt.mm.micronautrestcrud.model.Person;
import lt.mm.micronautrestcrud.service.PersonService;

import javax.inject.Inject;

@Controller("/api")
public class PersonController {

    @Inject
    private PersonService personService;

    @Post("/person")
    public Person create(@Body Person person) {
        return personService.save(person);
    }

    @Get("/person/{id}")
    public Person findById(@PathVariable Long id) {
        return personService.findById(id);
    }

}