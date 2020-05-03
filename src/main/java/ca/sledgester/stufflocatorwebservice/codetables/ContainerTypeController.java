package ca.sledgester.stufflocatorwebservice.codetables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContainerTypeController {

    @Autowired
    ContainerTypeRepository containerTypeRepository;

    @RequestMapping(value="/controllers/allContainerTypes", method= RequestMethod.GET)
    public List<ContainerType> getAllContainerTypes() {

        List<ContainerType> containerTypeList = new ArrayList<>();

        containerTypeList = (List<ContainerType>) containerTypeRepository.findAll();

        return containerTypeList;
    }
}
