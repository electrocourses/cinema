package com.cinema.customer.web.mappers;

import com.cinema.customer.domain.LayoutCapacity;
import com.cinema.customer.domain.LayoutCapacity.LayoutCapacityBuilder;
import com.cinema.customer.web.model.LayoutCapacityDto;
import com.cinema.customer.web.model.LayoutCapacityDto.LayoutCapacityDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-19T20:04:05+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
@Qualifier("delegate")
public class LayoutCapacityMapperImpl_ implements LayoutCapacityMapper {

    @Override
    public LayoutCapacityDto layoutCapacityToLayoutCapacityDto(LayoutCapacity layoutCapacity) {
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

    @Override
    public LayoutCapacity layoutCapacityDtoToLayoutCapacity(LayoutCapacityDto layoutCapacityDto) {
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
}
