package se331.rest.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Organizer;
import se331.rest.repository.OrganizerRepository;

@Repository
@Profile("db")
public class OrganizerDaoDbImpl implements OrganizerDao {
    @Autowired
    OrganizerRepository organizerRepo;
    @Override
    public Integer getOrganizerSize() {
        return Math.toIntExact(organizerRepo.count());
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerRepo.findAll(PageRequest.of(page - 1, pageSize));
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerRepo.findById(id).orElse(null);
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepo.save(organizer);
    }


}