package com.example.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "mascotas")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Mascota implements Serializable    {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "El nombre no puede estar vacío")
    @Size(min = 2, max = 25, message = "El nombre tiene que estar entre 2 y 25 caracteres")
    private String nombre;

    @NotEmpty(message = "La raza no puede estar vacía")
    @Size(min = 4, max = 25, message = "La raza debe contener entre 4 y 25 caracteres")
    private String raza;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    public enum Genero {
        MACHO, HEMBRA,
    }


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    //@JsonManagedReference
    @JsonIgnore
    private Cliente cliente;

    
}
