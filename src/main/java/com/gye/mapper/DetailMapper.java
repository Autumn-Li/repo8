package com.gye.mapper;

import com.gye.domain.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailMapper {

    void save(Detail detail);

    List<Detail> findAll();

    void  del(int id);

    Detail update(@Param("id") int id);

    void updateEntity(Detail detail);
}
