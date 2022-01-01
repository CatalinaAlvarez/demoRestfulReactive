package com.example.DemoRestfulReactive.mapper;

import com.example.DemoRestfulReactive.collections.Dato;
import com.example.DemoRestfulReactive.dto.DatoDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperUtils {

    public Function<DatoDTO, Dato> mapperToDato(String id) {
        return updateDato -> {
            var dato = new Dato();
            dato.setId(id);
            dato.setInformacion(updateDato.getInformacion());
            return dato;
        };
    }

    public Function<Dato, DatoDTO> mapDatoToDTO() {
        return entity -> new DatoDTO(entity.getId(), entity.getInformacion());
    }
}
