package com.example.demo.fake_data_generator;

import com.example.demo.model.Registry;
import com.example.demo.repository.RegistryRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class FakeDataScheduler {

    private static final long period = 1000L, delay = 1000L;
    private final FakeDataGenerator fakeDataGenerator;
    private final RegistryRepository registryRepository;


    public FakeDataScheduler(FakeDataGenerator fakeDataGenerator, RegistryRepository registryRepository) {
        this.fakeDataGenerator = fakeDataGenerator;
        this.registryRepository = registryRepository;
    }

    @Scheduled(initialDelay = delay, fixedRate = period)
    public void someJob() throws Exception {
        Registry registry = fakeDataGenerator.generateFakeData();
        registryRepository.save(registry);
        //System.out.println("Now is " + new Date());
    }

}