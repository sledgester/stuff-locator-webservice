package ca.sledgester.stufflocatorwebservice.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @RequestMapping(value="/controllers/allRooms", method= RequestMethod.GET)
    public List<Room> getAllRooms() {

        List<Room> roomList = new ArrayList<>();

        roomList = (List<Room>) roomRepository.findAll();

        return roomList;
    }

}
