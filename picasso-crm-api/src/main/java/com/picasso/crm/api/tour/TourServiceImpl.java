package com.picasso.crm.api.tour;

import com.picasso.crm.api.guide.GuideEntity;
import com.picasso.crm.api.guide.GuideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TourServiceImpl implements TourService {
    private final TourRepository tourRepository;
    private final GuideRepository guideRepository;
    private final TourToEntityConvertor toEntityConvertor;
    private final TourEntityToDTOConvertor toDTOConvertor;

    @Override
    public Tour save(Tour tour) {
        TourEntity tourEntity = toEntityConvertor.convert(tour);
        TourEntity savedTourEntity = tourRepository.save(tourEntity);
        return toDTOConvertor.convert(savedTourEntity);
    }

    @Override
    public Optional<Tour> findById(Long id) {
        Optional<TourEntity> tour = tourRepository.findById(id);
        return tour.map(toDTOConvertor::convert);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id can't be null");
        }
        tourRepository.deleteById(id);
    }

    @Override
    public Tour update(Tour tour) {
        if (tour.getId() == null) {
            throw new IllegalArgumentException("Id can't be null for update");
        }

        TourEntity existingTour = tourRepository.findById(tour.getId())
                .orElseThrow(() -> new RuntimeException("Tour not found"));

        existingTour.setName(tour.getName());
        existingTour.setDescription(tour.getDescription());
        existingTour.setDuration(tour.getDuration());
        existingTour.setStartDate(tour.getStartDate());
        existingTour.setEndDate(tour.getEndDate());

        TourEntity updatedTourEntity = tourRepository.save(existingTour);

        return toDTOConvertor.convert(updatedTourEntity);
    }

    public void addGuide(List<Long> guideIds, Long tourId) {
        TourEntity tourEntity = tourRepository.findById(tourId).orElseThrow(() -> new IllegalArgumentException("Tour with" + tourId + "not exist"));
        List<GuideEntity> guides = guideRepository.findAllById(guideIds);
        tourEntity.setGuides(guides);
        for (GuideEntity guide : guides) {
            guide.add(tourEntity);
        }
        TourEntity savedTour = tourRepository.save(tourEntity);
        guideRepository.saveAll(guides);
    }
}
