package com.picasso.crm.api.tour;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TourEntityToDTOConvertor implements Converter<TourEntity, Tour> {
    @Override
    public Tour convert(TourEntity source) {
        Tour tour = new Tour();
        tour.setId(source.getId());
        tour.setDescription(source.getDescription());
        tour.setName(source.getName());
        tour.setDuration(source.getDuration());
        tour.setStartDate(source.getStartDate());
        tour.setEndDate(source.getEndDate());
        return tour;
    }
}
