package com.galvez.developer.eventplanner;

import com.galvez.developer.eventplanner.model.Event;
import com.galvez.developer.eventplanner.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.galvez.developer.eventplanner.repository.GroupRepository;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner {


    private final GroupRepository groupRepository;


    public Initializer(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Sherwin Williams", "Site Estimate", "Visit the job",
                "Lunch").forEach(name ->
                groupRepository.save(new Group(name))
        );

        Group dGroup = groupRepository.findByName("Sherwin Williams");
        Event e = Event.builder().title("New Supplies for the Job")
                .description("Pick up supplies for the job site.")
                .date(Instant.parse("2022-09-13T17:00:00.000Z"))
                .build();
        dGroup.setEvents(Collections.singleton(e));
        groupRepository.save(dGroup);

        groupRepository.findAll().forEach(System.out::println);
    }
}
