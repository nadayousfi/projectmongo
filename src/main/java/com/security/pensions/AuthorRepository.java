package com.security.pensions;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.security.documents.Auteur;

public interface AuthorRepository extends ReactiveMongoRepository<Auteur, String> {

}
