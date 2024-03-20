package com.security.prestation_service;

import com.security.documents.Auteur;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AuteurService {
public Flux<Auteur> getAllAuteur();
public Mono<Auteur> getOneAuteur(String id);
public Mono<Auteur> addOneAuteur(Auteur auteur);
public Mono<Void> deleteOneAuteur(String id);
}
