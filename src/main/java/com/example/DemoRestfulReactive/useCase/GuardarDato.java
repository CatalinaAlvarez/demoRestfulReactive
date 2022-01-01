package com.example.DemoRestfulReactive.useCase;

import com.example.DemoRestfulReactive.dto.DatoDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface GuardarDato {
    public Mono<String> apply(DatoDTO datoDTO);

}
