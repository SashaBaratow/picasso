package com.picasso.crm.api.configurations.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

public class H2FileModeCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String url = context.getEnvironment().getProperty("spring.datasource.url");
        return StringUtils.hasText(url) && url.startsWith("jdbc:h2:file");
    }
}