package com.cinema.customer.services;


import com.cinema.customer.repositories.CinemaHallRepository;
import com.cinema.customer.web.controller.NotFoundException;
import com.cinema.customer.web.mappers.CinemaHallMapper;
import com.cinema.customer.web.model.CinemaHallDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CinemaHallService {
    private final CinemaHallRepository cinemaHallRepository;
    private final CinemaHallMapper cinemaHallMapper;

    public List<CinemaHallDto> getAllCinemaHalls() {
        return cinemaHallRepository.findAll().stream()
                .map(cinemaHallMapper::cinemaHallToCinemaHallDto)
                .collect(Collectors.toList());
    }

    public CinemaHallDto getCinemaHallById(Long hallId) {
        return cinemaHallMapper
                .cinemaHallToCinemaHallDto
                        (cinemaHallRepository.findById(hallId).orElseThrow(() -> new NotFoundException("Not found Hall with ID: " + hallId)));
    }

    public CinemaHallDto createFilm(CinemaHallDto cinemaHallDto) {
        return cinemaHallMapper
                .cinemaHallToCinemaHallDto(
                        cinemaHallRepository.save(
                                cinemaHallMapper.cinemaHallDtoToCinemaHall(cinemaHallDto)));
    }

    public CinemaHallDto updateCinemaHall(Long hallId, CinemaHallDto cinemaHallDto) {

        CinemaHallDto cinemaHallDtoToSave = cinemaHallMapper.cinemaHallToCinemaHallDto(cinemaHallRepository.findById(hallId).orElseThrow(() -> new NotFoundException("Not found Hall with ID: " + hallId)));
        cinemaHallDtoToSave.setCapacities(cinemaHallDto.getCapacities());
        cinemaHallDtoToSave.setLocation(cinemaHallDto.getLocation());
        cinemaHallDtoToSave.setName(cinemaHallDto.getName());

        return cinemaHallMapper
                .cinemaHallToCinemaHallDto(
                        cinemaHallRepository.save(
                                cinemaHallMapper.cinemaHallDtoToCinemaHall(cinemaHallDtoToSave)));
    }

    public void deleteCinemaHall(Long hallId) {
        cinemaHallRepository.deleteById(hallId);
    }
}
