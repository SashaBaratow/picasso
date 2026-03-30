package com.picasso.crm.api.erm.tour.participant.guide;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/guides")
@RequiredArgsConstructor
public class GuideController {

    private final GuideService guideService;

    @PostMapping
    public Guide save(@RequestBody Guide guide) {
        return guideService.save(guide);
    }

    @GetMapping("/{id}")
    public Guide findById(@PathVariable Long id) {
        return guideService.findById(id).orElse(null);
    }

}
