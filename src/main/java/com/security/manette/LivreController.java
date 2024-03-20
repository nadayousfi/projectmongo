package com.security.manette;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.documents.Livre;
import com.security.prestation_service.LivreService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequiredArgsConstructor
@RequestMapping("livre")
public class LivreController {
public final LivreService service;
@GetMapping
public Flux<Livre> getAll(){
	return service.getAllLivre();
}
@GetMapping("/{id}")
public Mono<Livre> getOne(@PathVariable String id){
	return service.getOneLivre(id);
}
@PostMapping
public Mono<Livre>addOne(@RequestBody Livre livre){
	return service.addOneLivre(livre);
}
@DeleteMapping("/{id}")
public Mono<Void> deleteOne(@PathVariable String id) {
	return service.deleteOneLivre(id);
}
}
