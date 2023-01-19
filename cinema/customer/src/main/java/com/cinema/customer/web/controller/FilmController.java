package com.cinema.customer.web.controller;


import com.cinema.customer.services.FilmService;
import com.cinema.customer.web.model.FilmDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class FilmController {
    private final FilmService filmService;

    @GetMapping("/films")
    public ResponseEntity<List<FilmDto>> getAllFilms() {
        return new ResponseEntity<>(filmService.getAllFilms(), HttpStatus.OK);
    }

    @GetMapping("/filmsWithDate/{date}")
    public ResponseEntity<List<FilmDto>> getBookingsByDate(@PathVariable("date") String date) {
        return new ResponseEntity<>(filmService.findAllByDate(date), HttpStatus.OK);
    }

    @GetMapping("/filmsWithParams")
    public ResponseEntity<FilmDto> getFilmById(@RequestParam("filmId") Long filmId) {
        return new ResponseEntity<>(filmService.findFilmById(filmId), HttpStatus.OK);
    }

    @PostMapping("/films")
    public ResponseEntity<FilmDto> createFilm(@RequestBody FilmDto filmDto) {
        return new ResponseEntity<>(filmService.createFilm(filmDto), HttpStatus.CREATED);
    }

    @PutMapping("/films/{filmId}")
    public ResponseEntity<FilmDto> updateFilm(@PathVariable("filmId") Long filmId, @RequestBody FilmDto filmDto) {
        return new ResponseEntity(filmService.updateFilm(filmId, filmDto), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/films/{filmId}")
    public void deleteFilm(@PathVariable("filmId") Long filmId) {
        filmService.deleteFilm(filmId);
    }


}
