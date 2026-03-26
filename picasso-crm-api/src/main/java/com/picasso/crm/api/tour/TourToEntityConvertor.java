package com.picasso.crm.api.tour;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TourToEntityConvertor implements Converter<Tour, TourEntity> {
    @Override
    public TourEntity convert(Tour source) {
        TourEntity tourEntity = new TourEntity();
        tourEntity.setId(source.getId());
        tourEntity.setDescription(source.getDescription());
        tourEntity.setName(source.getName());
        tourEntity.setDuration(source.getDuration());
        tourEntity.setStartDate(source.getStartDate());
        tourEntity.setEndDate(source.getEndDate());
        return tourEntity;
    }
}
