package com.picasso.crm.api.guide;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GuideDTOToEntityConvertor implements Converter<Guide, GuideEntity> {
    @Override
    public GuideEntity convert(Guide source) {
        GuideEntity guideEntity = new GuideEntity();

        guideEntity.setId(source.getId());
        guideEntity.setName(source.getName());
        guideEntity.setLanguages(source.getLanguages());
        guideEntity.setPhone(source.getPhone());
        return guideEntity;
    }
}
