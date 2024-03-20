package com.security.prestation_service;

import org.springframework.stereotype.Service;

import com.security.documents.Auteur;
import com.security.pensions.AuthorRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class AuteurServiceImpl implements AuteurService {
public final AuthorRepository repository;
	@Override
	public Flux<Auteur> getAllAuteur() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mono<Auteur> getOneAuteur(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Mono<Auteur> addOneAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		return repository.save(auteur);
	}

	@Override
	public Mono<Void> deleteOneAuteur(String id) {
		// TODO Auto-generated method stub
		return repository.deleteById(id);
	}

}
