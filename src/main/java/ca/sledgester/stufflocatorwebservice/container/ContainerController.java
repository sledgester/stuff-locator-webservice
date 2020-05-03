package ca.sledgester.stufflocatorwebservice.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContainerController {

    @Autowired
    ContainerRepository containerRepository;

    @RequestMapping(value="/controllers/allContainers", method= RequestMethod.GET)
    public List<Container> getAllContainers() {

        List<Container> containerList = new ArrayList<>();

        containerList = (List<Container>) containerRepository.findAll();

        return containerList;
    }

    @RequestMapping(value="/controllers/searchContainers", method= RequestMethod.GET)
    public List<Container> searchContainers(@RequestParam String description) {

        List<Container> containerList = new ArrayList<>();

        containerList = (List<Container>) containerRepository.findByDescriptionContainingIgnoreCase(description);

        return containerList;
    }

}
