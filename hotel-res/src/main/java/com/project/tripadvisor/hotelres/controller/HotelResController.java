//package com.project.tripadvisor.hotelres.controller;
//
//import com.project.tripadvisor.hotelres.domain.Hotel;
//import com.project.tripadvisor.hotelres.domain.Reservation;
//import com.project.tripadvisor.hotelres.domain.Room;
//import com.project.tripadvisor.hotelres.service.HotelService;
//import com.project.tripadvisor.hotelres.service.ReservationService;
//import com.project.tripadvisor.hotelres.service.RoomService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class HotelResController {
//    @Autowired
//    HotelService hotelService;
//    @Autowired
//    RoomService roomService;
//    @Autowired
//    ReservationService reservationService;
//
//    @GetMapping("/hotels/")
//    public List<Hotel> getHotels(@RequestParam("city") String city){
//        return hotelService.findAllByCity(city);
//    }
//
////    @GetMapping("hotels/")
////    public List<Hotel> getHotelsByStars(@RequestParam("city") String city, @RequestParam("star") int star){
////        return hotelService.findAllByCityAndStar(city,star);
////    }
//
//    @GetMapping("/rooms/")
//    private List<Room> getRooms(@RequestParam("hotel") String hotel){
//        return roomService.findHotelRooms(hotel);
//    }
//
//    @GetMapping("/allhotels")
//    public List<Hotel> getAllHotels(){
//        return hotelService.findAllHotels();
//    }
//
//    @PostMapping("/hotel-res/reserve/")
//    public void reserve(@RequestParam("email") String email,
//                        @RequestParam("checkIn")String checkIn,
//                        @RequestParam("checkOut") String checkOut,
//                        @RequestParam("roomId") Long roomId){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate cIn = LocalDate.parse(checkIn, formatter);
//        LocalDate cOut = LocalDate.parse(checkOut, formatter);
//        Room room = roomService.findRoom(roomId);
//        reservationService.reserve(new Reservation(email,cIn,cOut,room));
//    }
//}
