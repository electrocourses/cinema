package com.cinema.customer.web.mappers;

import com.cinema.customer.domain.CinemaHall;
import com.cinema.customer.domain.CinemaHall.CinemaHallBuilder;
import com.cinema.customer.domain.LayoutCapacity;
import com.cinema.customer.domain.LayoutCapacity.LayoutCapacityBuilder;
import com.cinema.customer.web.model.CinemaHallDto;
import com.cinema.customer.web.model.CinemaHallDto.CinemaHallDtoBuilder;
import com.cinema.customer.web.model.LayoutCapacityDto;
import com.cinema.customer.web.model.LayoutCapacityDto.LayoutCapacityDtoBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-20T15:17:46+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
@Qualifier("delegate")
public class CinemaHallMapperImpl_ implements CinemaHallMapper {

    @Override
    public CinemaHallDto cinemaHallToCinemaHallDto(CinemaHall cinemaHall) {
        if ( cinemaHall == null ) {
            return null;
        }

        CinemaHallDtoBuilder cinemaHallDto = CinemaHallDto.builder();

        cinemaHallDto.id( cinemaHall.getId() );
        cinemaHallDto.lastUpdate( cinemaHall.getLastUpdate() );
        cinemaHallDto.name( cinemaHall.getName() );
        cinemaHallDto.location( cinemaHall.getLocation() );
        cinemaHallDto.capacities( layoutCapacityListToLayoutCapacityDtoList( cinemaHall.getCapacities() ) );

        return cinemaHallDto.build();
    }

    @Override
    public CinemaHall cinemaHallDtoToCinemaHall(CinemaHallDto cinemaHallDto) {
        if ( cinemaHallDto == null ) {
            return null;
        }

        CinemaHallBuilder cinemaHall = CinemaHall.builder();

        cinemaHall.id( cinemaHallDto.getId() );
        cinemaHall.lastUpdate( cinemaHallDto.getLastUpdate() );
        cinemaHall.name( cinemaHallDto.getName() );
        cinemaHall.location( cinemaHallDto.getLocation() );
        cinemaHall.capacities( layoutCapacityDtoListToLayoutCapacityList( cinemaHallDto.getCapacities() ) );

        return cinemaHall.build();
    }

    protected LayoutCapacityDto layoutCapacityToLayoutCapacityDto(LayoutCapacity layoutCapacity) {
        if ( layoutCapacity == null ) {
            return null;
        }

        LayoutCapacityDtoBuilder layoutCapacityDto = LayoutCapacityDto.builder();

        layoutCapacityDto.id( layoutCapacity.getId() );
        layoutCapacityDto.lastUpdate( layoutCapacity.getLastUpdate() );
        layoutCapacityDto.layout( layoutCapacity.getLayout() );
        layoutCapacityDto.capacity( layoutCapacity.getCapacity() );

        return layoutCapacityDto.build();
    }

    protected List<LayoutCapacityDto> layoutCapacityListToLayoutCapacityDtoList(List<LayoutCapacity> list) {
        if ( list == null ) {
            return null;
        }

        List<LayoutCapacityDto> list1 = new ArrayList<LayoutCapacityDto>( list.size() );
        for ( LayoutCapacity layoutCapacity : list ) {
            list1.add( layoutCapacityToLayoutCapacityDto( layoutCapacity ) );
        }

        return list1;
    }

    protected LayoutCapacity layoutCapacityDtoToLayoutCapacity(LayoutCapacityDto layoutCapacityDto) {
        if ( layoutCapacityDto == null ) {
            return null;
        }

        LayoutCapacityBuilder layoutCapacity = LayoutCapacity.builder();

        layoutCapacity.id( layoutCapacityDto.getId() );
        layoutCapacity.lastUpdate( layoutCapacityDto.getLastUpdate() );
        layoutCapacity.layout( layoutCapacityDto.getLayout() );
        layoutCapacity.capacity( layoutCapacityDto.getCapacity() );

        return layoutCapacity.build();
    }

    protected List<LayoutCapacity> layoutCapacityDtoListToLayoutCapacityList(List<LayoutCapacityDto> list) {
        if ( list == null ) {
            return null;
        }

        List<LayoutCapacity> list1 = new ArrayList<LayoutCapacity>( list.size() );
        for ( LayoutCapacityDto layoutCapacityDto : list ) {
            list1.add( layoutCapacityDtoToLayoutCapacity( layoutCapacityDto ) );
        }

        return list1;
    }
}
