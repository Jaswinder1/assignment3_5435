package com.library.assignment2.interface2;

//package com.spring.web.flux;

import com.library.assignment2.model.*;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

 

@Repository

public interface BookInterface extends  ReactiveMongoRepository<Book, String>{ 

}
