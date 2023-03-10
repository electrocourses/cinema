package com.cinema.customer.services;

import com.cinema.customer.repositories.FilmRepository;
import com.cinema.customer.web.mappers.FilmMapper;
import com.cinema.customer.web.model.FilmDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmRepository filmRepository;
    private final FilmMapper filmMapper;

    public List<FilmDto> getAllFilms() {
        return filmRepository.findAll().stream()
                .map(filmMapper::filmToFilmDto)
                .collect(Collectors.toList());
    }

    public FilmDto findFilmById(Long filmId) {
        return filmMapper
                .filmToFilmDto
                        (filmRepository.findById(filmId).get());
    }

    public FilmDto createFilm(FilmDto filmDto) {
        return filmMapper.filmToFilmDto(filmRepository.save(filmMapper.filmDtoToFilm(filmDto)));
    }

    public void deleteFilm(Long filmId) {
        filmRepository.deleteById(filmId);
    }

    public FilmDto updateFilm(Long filmId, FilmDto filmDto) {

        FilmDto filmToSave = filmMapper.filmToFilmDto(filmRepository.findFilmById(filmId));

        filmToSave.setLayout(filmDto.getLayout());
        filmToSave.setParticipants(filmDto.getParticipants());
        filmToSave.setStartTime(filmDto.getStartTime());
        filmToSave.setEndTime(filmDto.getEndTime());
        filmToSave.setTitle(filmDto.getTitle());
        filmToSave.setUser(filmDto.getUser());
        filmToSave.setCinemaHall(filmDto.getCinemaHall());
        filmToSave.setDate(filmDto.getDate());

        return filmMapper.filmToFilmDto(filmRepository.save(filmMapper.filmDtoToFilm(filmToSave)));
    }

    public List<FilmDto> findAllByDate(String date) {
        Date sqlDate = Date.valueOf(date);
        return filmRepository.findAllByDate(sqlDate).stream().map(filmMapper::filmToFilmDto).collect(Collectors.toList());
    }

}
