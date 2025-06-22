package com.library.assignment2.controller;

import com.library.assignment2.model.Publisher;
import com.library.assignment2.service.PublisherService;

import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    private final PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    // Get publisher by ID
    @GetMapping("/{id}")
    public Mono<Publisher> getPublisherById(@PathVariable String id) {
        return publisherService.getById(id);
    }

    // Get all publishers
    @GetMapping
    public Flux<Publisher> getAllPublishers() {
        return publisherService.getAll();
    }

    // Save a publisher
    @PostMapping
    public Mono<Publisher> savePublisher(@RequestBody Publisher publisher) {
        return publisherService.save(publisher);
    }

    // For testing
    @GetMapping("/test")
    public Publisher getTestPublisher() {
        Publisher publisher = new Publisher();
        publisher.setPub_Id(1);
        publisher.setName("Jane Doe");

        Publisher.Address address = new Publisher.Address("45B", "Queen Street");
        publisher.setAddress(address);

        return publisher;
    }
}
