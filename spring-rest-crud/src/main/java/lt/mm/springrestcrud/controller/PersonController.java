package lt.mm.springrestcrud.controller;

import lt.mm.springrestcrud.model.Person;
import lt.mm.springrestcrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public Person create(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping("/person/{id}")
    public Person findById(@PathVariable Long id) {
        return personService.findById(id);
    }

}
