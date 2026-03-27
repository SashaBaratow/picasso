package com.picasso.crm.api.tour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface TourRepository extends JpaRepository<TourEntity, Long> {
    List<TourEntity> findTourEntitiesByNameContaining(String name);

    @Query("from TourEntity t WHERE t.startDate >= :from AND t.endDate <= :to")
    List<TourEntity> findAllByDateWithIn(@Param("from") LocalDateTime from, @Param("to") LocalDateTime to);
}
