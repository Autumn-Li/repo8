package com.gye.mapper;

import com.gye.domain.Paytype;

import java.util.List;

public interface PaytypeMapper {

    List<Paytype> findAllByPayType();

}
