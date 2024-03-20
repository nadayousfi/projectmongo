package com.security.manette;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.documents.Auteur;
import com.security.prestation_service.AuteurService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("auteur")
public class AuthorController {
private final AuteurService service;
@GetMapping
public Flux<Auteur> getAll(){
	return service.getAllAuteur();
}
@GetMapping("/{id}")
public Mono<Auteur> getOne(@PathVariable String id  ){
	return service.getOneAuteur(id);
}
@PostMapping
public Mono<Auteur> addOne(@RequestBody Auteur auteur){
	return service.addOneAuteur(auteur);
}
@DeleteMapping("/{id}")
public Mono<Void> deleteOne(@PathVariable String id){
	return  service.deleteOneAuteur(id);
}
}
