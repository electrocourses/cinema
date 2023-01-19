package com.cinema.customer.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
public class CinemaHallDto extends BaseItem {

    @Builder
    public CinemaHallDto(Long id, Timestamp lastUpdate, String name, String location, List<LayoutCapacityDto> capacities) {
        super(id, lastUpdate);
        this.name = name;
        this.location = location;
        this.capacities = capacities;
    }
    private String name;
    private String location;
    private List<LayoutCapacityDto> capacities;

    public void setCapacity(LayoutCapacityDto capacity) {
        for (LayoutCapacityDto lc : this.capacities) {
            if (lc.getLayout() == capacity.getLayout()) {
                lc.setCapacity(capacity.getCapacity());
            }
        }
    }
}
