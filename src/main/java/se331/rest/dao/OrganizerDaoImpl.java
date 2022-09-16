package se331.rest.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Organizer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("manual")
public class OrganizerDaoImpl implements OrganizerDao{
    List<Organizer> eventList2;
    @PostConstruct
    public void init() {
        eventList2 = new ArrayList<>();
        eventList2.add(Organizer.builder()
                .id(1L)
                .organizationName("Name1")
                .address("address1")
                .build());
        eventList2.add(Organizer.builder()
                .id(2L)
                .organizationName("Name2")
                .address("address2")
                .build());
        eventList2.add(Organizer.builder()
                .id(3L)
                .organizationName("Name3")
                .address("address3")
                .build());
        eventList2.add(Organizer.builder()
                .id(4L)
                .organizationName("Name4")
                .address("address4")
                .build());
        eventList2.add(Organizer.builder()
                .id(5L)
                .organizationName("Name5")
                .address("address5")
                .build());
        eventList2.add(Organizer.builder()
                .id(6L)
                .organizationName("Name6")
                .address("address6")
                .build());
    }
    //ADD THE ORGANIZER
    @Override
    public Integer getOrganizerSize() {
        return eventList2.size();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? eventList2.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return new
                PageImpl<Organizer>(eventList2.subList(firstIndex, firstIndex + pageSize),
                PageRequest.of(page, pageSize), eventList2.size());
    }
    @Override
    public Organizer getOrganizer(Long id) {
        return eventList2.stream().filter(organizer ->
                organizer.getId().equals(id)).findFirst().orElse(null);
    }
    @Override
    public Organizer save(Organizer organizer) {
        organizer.setId(eventList2.get(eventList2.size()-1).getId()+1);
        eventList2.add(organizer);
        return organizer;
    }
}