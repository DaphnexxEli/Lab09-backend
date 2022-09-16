package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.Event;
import se331.rest.repository.EventRepository;
import se331.rest.entity.Organizer;
import se331.rest.repository.OrganizerRepository;
import se331.rest.service.OrganizerService;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
     @Autowired
     EventRepository eventRepository;
     @Autowired
     OrganizerRepository organizerRepository;
     @Override
     public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent){
        eventRepository.save(Event.builder()
          .category(" Academic ")
          .title(" Midterm Exam ")
          .description(" A time for taking the exam ")
          .location(" CAMT Building ")
          .date(" 3rd Sept ")
          .time(" 3.00-4.00 pm . ")
          .petAllowed(false)
          .organizer(" CAMT ").build());
        eventRepository.save(Event.builder()
          .category(" Academic ")
          .title(" Commencement Day ")
          .description(" A time for celebration ")
          .location(" CMU Convention hall ")
          .date(" 21th Jan ")
          .time(" 8.00am - 4.00 pm . ")
          .petAllowed(false)
          .organizer(" CMU ").build());
        eventRepository.save(Event.builder()
        .category(" Cultural ")
        .title(" Loy Krathong ")
        .description(" A time for Krathong ")
        .location(" Ping River ")
        .date(" 21th Nov ")
        .time(" 8.00-10.00 pm . ")
        .petAllowed(false)
        .organizer("Chiang Mai").build());
        eventRepository.save(Event.builder()
        .category("Cultural")
        .title("Songkran")
        .description("Let's Play Water")
        .location("Chiang Mai Moat")
        .date("13th April")
        .time("10.00am-6.00pm.")
        .petAllowed(true)
        .organizer("Chiang Mai Municipality").build());
         organizerRepository.save(Organizer.builder()
                 .id(1L)
                 .organizationName("Sheila Mosley")
                 .address("9191 Corona Court " + "Champlin, MN 55316")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(2L)
                 .organizationName("Violet French")
                 .address("7430 Deerfield Circle " + "Mechanicsburg, PA 17050")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(3L)
                 .organizationName("Rahul Porter")
                 .address("176 Maiden St. " + "Whitehall, PA 18052")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(4L)
                 .organizationName("Padraig James")
                 .address("586 Washington St. " + "Newark, NJ 07103")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(5L)
                 .organizationName("Shoaib Morse")
                 .address("7610 Westminster Lane " + "Vincentown, NJ 08088")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(6L)
                 .organizationName("Siena Mcdonnell")
                 .address("9107 Swanson Street " + "Worcester, MA 01604")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(7L)
                 .organizationName("Mirza Russo")
                 .address("7843 Forest St. " + "Fernandina Beach, FL 32034")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(8L)
                 .organizationName("Tyler-James Preece")
                 .address("8638 Oak Meadow St. " + "Port Saint Lucie, FL 34952")
                 .build());
         organizerRepository.save(Organizer.builder()
                 .id(9L)
                 .organizationName("Haseeb Justice")
                 .address("92 W. Foster Court " + "Warminster, PA 18974")
                 .build());
        }
}