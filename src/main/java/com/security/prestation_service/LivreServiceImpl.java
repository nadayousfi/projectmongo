package com.security.prestation_service;

import java.util.function.Function;

import org.reactivestreams.Publisher;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.ReactiveFluentQuery;
import org.springframework.stereotype.Service;

import com.security.documents.Livre;
import com.security.pensions.LivreRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class LivreServiceImpl implements LivreService {
public final LivreRepository repository;
	@Override
	public Flux<Livre> getAllLivre() {
		return repository.findAll();
	}

	@Override
	public Mono<Livre> getOneLivre(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Mono<Livre> addOneLivre(Livre livre) {
		// TODO Auto-generated method stub
		return repository.save(livre);
	}

	@Override
	public Mono<Void> deleteOneLivre(String id) {
		// TODO Auto-generated method stub
		return repository.deleteById(id);
	}

}
