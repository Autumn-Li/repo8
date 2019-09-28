package com.gye.service;

import com.gye.domain.Detail;
import com.gye.domain.Paytype;

import java.util.List;

public interface DetailService {

    void save(Detail account);

    List<Detail> findAll();

    void  del(int id);

    Detail update(int id);

    List<Paytype> findAllByPayType();

    void updateEntity(Detail detail);
}
