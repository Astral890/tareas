package com.tareas.controller;

import com.tareas.service.TareaService;
import com.tareas.dto.TareaDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/tareas")
@CrossOrigin(origins = "*")
public class TareaController {
    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(tareaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public TareaDto save(@RequestBody TareaDto tareaDto){
        return tareaService.save(tareaDto);
    }

}
