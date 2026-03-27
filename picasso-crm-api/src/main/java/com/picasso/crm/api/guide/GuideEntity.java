package com.picasso.crm.api.guide;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(
        name = "GUIDES",
        indexes = {
                @Index(columnList = "phone")
        }
)
public class GuideEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GUIDES_ID_GENERATOR")
    @SequenceGenerator(name = "GUIDES_ID_GENERATOR", sequenceName = "GUIDES_SEQ", allocationSize = 1)
    Long id;
    String name;
    String phone;
    String languages;
}
