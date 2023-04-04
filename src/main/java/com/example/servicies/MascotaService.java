package com.example.servicies;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.entities.Mascota;

public interface MascotaService {
    
    public List<Mascota> findAll(Sort sort);

    public Page<Mascota> findAll(Pageable pageable);

    public Mascota findById(long id);

    public Mascota save(Mascota producto);

    public void delete(Mascota producto);
}
