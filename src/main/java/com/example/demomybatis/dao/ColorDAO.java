package com.example.demomybatis.dao;

import com.example.demomybatis.dto.ColorDTO;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ColorDAO {

    public List<ColorDTO> getAllColor();

}
