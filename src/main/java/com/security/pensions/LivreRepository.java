package com.security.pensions;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.security.documents.Livre;

public interface LivreRepository extends ReactiveMongoRepository<Livre,String> {

}
