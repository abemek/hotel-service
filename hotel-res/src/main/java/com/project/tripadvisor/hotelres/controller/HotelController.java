package com.project.tripadvisor.hotelres.controller;

import com.project.tripadvisor.hotelres.domain.Hotel;
import com.project.tripadvisor.hotelres.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @GetMapping("/hotel/add")
    public Long addHotel(Hotel hotel){
        return hotelService.addHotel(hotel);
    }

    @GetMapping("/hotel/update")
    public Long updateHotel(Hotel hotel){
        return hotelService.updateHotel(hotel);
    }

    @GetMapping("/hotels/")
    public List<Hotel> getHotels(@RequestParam("city") String city){
        return hotelService.findAllByCity(city);
    }

    @GetMapping("/allhotels")
    public List<Hotel> getAllHotels(){
        return hotelService.findAllHotels();
    }

        @GetMapping("hotels/star/")
    public List<Hotel> getHotelsByStars(@RequestParam("city") String city, @RequestParam("star") int star){
        return hotelService.findAllByCityAndStar(city,star);
    }
}
