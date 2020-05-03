package ca.sledgester.stufflocatorwebservice.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value="/controllers/allPeople", method= RequestMethod.GET)
    public List<Person> getAllPeople() {

        List<Person> peopleList = new ArrayList<>();

        peopleList = (List<Person>) personRepository.findAll();

        return peopleList;
    }

    @RequestMapping(value="/controllers/searchPeople", method= RequestMethod.GET)
    public List<Person> searchPeople(@RequestParam String lastName, @RequestParam String firstName, @RequestParam String age) {

        List<Person> peopleList = new ArrayList<>();

        peopleList = (List<Person>) personRepository.findByLastNameContainingIgnoreCaseOrFirstNameContainingIgnoreCase(lastName, firstName);

        return peopleList;
    }

}
