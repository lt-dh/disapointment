package com.lt.mapper;

import com.lt.pojo.TooSad;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface sadMapper {
    boolean addSad(TooSad tooSad);
    List<TooSad> query0();
}
