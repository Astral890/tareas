package com.tareas.dto;

import com.tareas.model.TareaModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
public class TareaDto {
     
    @JsonIgnore 
    private Integer id;
    private String title;
    private String description;
    private String status;
    private String due_date;

    public TareaModel toModel() {
        return TareaModel.builder()
                .id(this.id)
                .title(this.title)
                .description(this.description)
                .status(this.status)
                .due_date(this.due_date)
                .build();
    }
}
