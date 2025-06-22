package com.library.assignment2.service;

import com.library.assignment2.model.Publisher;
import com.library.assignment2.interface2.PublisherRepository;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    // Get all publishers
    public Flux<Publisher> getAll() {
        return publisherRepository.findAll();
    }

    // Get publisher by ID
    public Mono<Publisher> getById(final String id) {
        return publisherRepository.findById(id);
    }

    // Save publisher
    public Mono<Publisher> save(final Publisher publisher) {
        return publisherRepository.save(publisher);
    }
}
