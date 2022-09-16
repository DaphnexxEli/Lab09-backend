package se331.rest.dao;

import org.springframework.data.domain.Page;
import se331.rest.entity.Organizer;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrganizerDao {
    //ADD THE ORGANIZER
    Integer getOrganizerSize();
    Page<Organizer> getOrganizers(Integer pageSize, Integer page);
    Organizer getOrganizer(Long id);
    Organizer save(Organizer organizer);
}