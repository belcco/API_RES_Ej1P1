package com.example.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dao.MascotaDao;
import com.example.entities.Mascota;

@Service
public class MascotaServiceImpl implements MascotaService   {
    
    @Autowired
    private MascotaDao mascotaDao;

    @Override
    public List<Mascota> findAll(Sort sort) {
        return mascotaDao.findAll(sort);
    }

    @Override
    public Page<Mascota> findAll(Pageable pageable) {
        return mascotaDao.findAll(pageable);
    }

    @Override
    public Mascota findById(long id) {
        return mascotaDao.findById(id).get();
    }


    @Override
    public Mascota save(Mascota mascota) {
        return mascotaDao.save(mascota);
    }

    @Override
    public void delete(Mascota mascota) {
        mascotaDao.delete(mascota);
    
    }

}
    
