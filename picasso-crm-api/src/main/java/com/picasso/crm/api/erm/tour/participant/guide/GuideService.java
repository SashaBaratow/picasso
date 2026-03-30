package com.picasso.crm.api.erm.tour.participant.guide;

import java.util.Optional;

public interface GuideService {
    Guide save(Guide guide);

    Optional<Guide> findById(Long id);
}
