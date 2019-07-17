package com.project.tripadvisor.hotelres.controller;

import com.project.tripadvisor.hotelres.domain.Room;
import com.project.tripadvisor.hotelres.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/rooms/")
    private List<Room> getRooms(@RequestParam("hotel") String hotel){
        return roomService.findHotelRooms(hotel);
    }
}
