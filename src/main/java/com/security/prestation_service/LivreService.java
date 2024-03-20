package com.security.prestation_service;

import com.security.documents.Livre;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LivreService  {
	public Flux<Livre> getAllLivre();
	public Mono<Livre> getOneLivre(String id);
	public Mono<Livre> addOneLivre(Livre livre);
	public Mono<Void> deleteOneLivre(String id);
}
