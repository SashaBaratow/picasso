package com.picasso.crm.api.tour;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tour {
    Long id;
    LocalDateTime startDate;
    LocalDateTime endDate;
    Duration duration;
    String name;
    String description;
    List<Integer> guideIds;
}
