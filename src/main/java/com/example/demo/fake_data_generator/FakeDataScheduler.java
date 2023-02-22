package com.example.demo.fake_data_generator;

import com.example.demo.converters.RegistryConverter;
import com.example.demo.models.dtos.RegistryDTO;
import com.example.demo.models.entities.Message;
import com.example.demo.models.entities.Registry;
import com.example.demo.repositories.RegistryRepository;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class FakeDataScheduler {

    private static final long period = 10000L, delay = 1000L;
    private RegistryConverter registryConverter;
    private final SimpMessagingTemplate simpMessagingTemplate;
    private final FakeDataGenerator fakeDataGenerator;
    private final RegistryRepository registryRepository;


    public FakeDataScheduler(RegistryConverter registryConverter, SimpMessagingTemplate simpMessagingTemplate, FakeDataGenerator fakeDataGenerator, RegistryRepository registryRepository) {
        this.registryConverter = registryConverter;
        this.simpMessagingTemplate = simpMessagingTemplate;
        this.fakeDataGenerator = fakeDataGenerator;
        this.registryRepository = registryRepository;
    }

    @Scheduled(initialDelay = delay, fixedRate = period)
    public void someJob() throws Exception {
        Registry registry = fakeDataGenerator.generateFakeData();
        RegistryDTO registryDTO = registryConverter.convert(registry);
        registryRepository.save(registry);
        simpMessagingTemplate.convertAndSend("/topic/registry",new Message(registryDTO.toString()) );
        //System.out.println("Now is " + new Date());
    }

}