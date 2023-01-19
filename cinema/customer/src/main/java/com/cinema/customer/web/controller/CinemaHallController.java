package com.cinema.customer.web.controller;


import com.cinema.customer.services.CinemaHallService;
import com.cinema.customer.web.model.CinemaHallDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class CinemaHallController {

    private final CinemaHallService cinemaHallService;

    @GetMapping("/cinemaHalls")
    public ResponseEntity<List<CinemaHallDto>> getAllCinemaHalls() throws InterruptedException {
        return new ResponseEntity<>(cinemaHallService.getAllCinemaHalls(), HttpStatus.OK);
    }

    @GetMapping("/cinemaHalls/{hallId}")
    public ResponseEntity<CinemaHallDto> getCinemaHallById(@PathVariable("hallId") Long hallId) {
        return new ResponseEntity<>(cinemaHallService.getCinemaHallById(hallId), HttpStatus.OK);
    }

    @PostMapping("/cinemaHalls")
    public ResponseEntity<CinemaHallDto> createCinemaHall(@RequestBody CinemaHallDto cinemaHallDto) {
        return new ResponseEntity<>(cinemaHallService.createFilm(cinemaHallDto), HttpStatus.CREATED);
    }

    @PutMapping("/cinemaHalls/{hallId}")
    public ResponseEntity<CinemaHallDto> updateCinemaHall(@PathVariable("hallId") Long hallId, @RequestBody CinemaHallDto cinemaHallDto) {
        return new ResponseEntity<>(cinemaHallService.updateCinemaHall(hallId, cinemaHallDto), HttpStatus.OK);
    }

    @DeleteMapping("/cinemaHalls/{hallId}")
    public void deleteCinemaHall(@PathVariable() Long hallId) {
        cinemaHallService.deleteCinemaHall(hallId);
    }
}
