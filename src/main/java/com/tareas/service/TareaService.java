package com.tareas.service;

import com.tareas.repository.TareaRepository;
import com.tareas.dto.TareaDto;
import com.tareas.model.TareaModel;
import java.util.List;
import org.springframework.stereotype.Service;

@Service 
public class TareaService {
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<TareaDto> findAll(){
        return tareaRepository.findAll().stream().map(TareaModel::toDto).toList();
    }

    public TareaDto save(TareaDto tareaDto){
        TareaModel tareaModel = tareaDto.toModel();
        TareaModel savedModel = tareaRepository.save(tareaModel);
        return savedModel.toDto();
    }
}
