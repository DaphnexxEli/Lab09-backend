package se331.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
    List<Organizer> findAll();
}