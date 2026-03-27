package com.picasso.crm.api.guide;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
        return  toDTOConvertor.convert(savedGuideEntity);
    }
}
