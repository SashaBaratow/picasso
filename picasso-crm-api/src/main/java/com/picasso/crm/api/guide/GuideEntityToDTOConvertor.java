package com.picasso.crm.api.guide;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GuideEntityToDTOConvertor implements Converter<GuideEntity, Guide> {
    @Override
    public Guide convert(GuideEntity source) {
        Guide guide = new Guide();
        guide.setId(source.getId());
        guide.setName(source.getName());
        guide.setLanguages(source.getLanguages());
        guide.setPhone(source.getPhone());
        return guide;
    }
}
