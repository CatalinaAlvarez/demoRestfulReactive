package com.example.DemoRestfulReactive.repositories;

import com.example.DemoRestfulReactive.collections.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Repositorio  extends ReactiveMongoRepository<Dato, String> {
}
