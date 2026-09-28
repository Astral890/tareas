package com.tareas.model;

import com.tareas.dto.TareaDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;

@Data 
@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 
@Table (name = "tareas")
public class TareaModel {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String status;
    private String due_date;

    public TareaDto toDto() {
        return TareaDto.builder()
                .id(this.id)
                .title(this.title)
                .description(this.description)
                .status(this.status)
                .due_date(this.due_date)
                .build();
    }
}
