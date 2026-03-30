package com.picasso.crm.api.erm.tour.participant.guide;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GuideServiceImpl implements GuideService {
    private final GuideRepository guideRepository;
    private final GuideDTOToEntityConvertor toEntityConvertor;
    private final GuideEntityToDTOConvertor toDTOConvertor;

    @Override
    public Guide save(Guide guide) {
        GuideEntity guideEntity = toEntityConvertor.convert(guide);
        GuideEntity savedGuideEntity = guideRepository.save(guideEntity);
        return toDTOConvertor.convert(savedGuideEntity);
    }

    @Override
    public Optional<Guide> findById(Long id) {
        Optional<GuideEntity> guide = guideRepository.findById(id);
        return guide.map(toDTOConvertor::convert);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id can't be null");
        }
        guideRepository.deleteById(id);
    }
}
