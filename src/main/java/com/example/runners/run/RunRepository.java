package com.example.runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Monday morning run",
                LocalDateTime.now(), LocalDateTime.now().plusMinutes(30),
                3, Location.INDOOR));

        runs.add(new Run(2, "Wednesday morning run",
                LocalDateTime.now(), LocalDateTime.now().plusMinutes(30),
                3, Location.INDOOR));
    }
}
