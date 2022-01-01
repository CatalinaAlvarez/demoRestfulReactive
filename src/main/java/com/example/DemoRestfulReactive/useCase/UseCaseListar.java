package com.example.DemoRestfulReactive.useCase;

import com.example.DemoRestfulReactive.dto.DatoDTO;
import com.example.DemoRestfulReactive.mapper.MapperUtils;
import com.example.DemoRestfulReactive.repositories.Repositorio;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@Service
@Validated
public class UseCaseListar implements Supplier<Flux<DatoDTO>> {

    private final Repositorio repositorio;
    private final MapperUtils mapperUtils;

    public UseCaseListar(MapperUtils mapperUtils, Repositorio repositorio) {
        this.repositorio = repositorio;
        this.mapperUtils = mapperUtils;
    }

    @Override
    public Flux<DatoDTO> get() {
        return repositorio.findAll().map(mapperUtils.mapDatoToDTO());
    }
}
