package com.gye.service.impl;

import com.gye.domain.Detail;
import com.gye.domain.Paytype;
import com.gye.mapper.DetailMapper;
import com.gye.mapper.PaytypeMapper;
import com.gye.service.DetailService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailMapper detailMapper;

    @Autowired
    private PaytypeMapper paytypeMapper;

    @Override
    public void save(Detail detail) {
        detailMapper.save(detail);
    }

    @Override
    public List<Detail> findAll() {
        return detailMapper.findAll();
    }

    @Override
    public void del(int id) {
        detailMapper.del(id);
    }

    @Override
    public Detail update(int id) {
        return detailMapper.update(id);
    }

    @Override
    public List<Paytype> findAllByPayType() {
        return paytypeMapper.findAllByPayType();
    }

    @Override
    public void updateEntity(Detail detail) {
        detailMapper.updateEntity(detail);
    }


}
