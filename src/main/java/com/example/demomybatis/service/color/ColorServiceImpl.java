package com.example.demomybatis.service.color;

import com.example.demomybatis.dao.ColorDAO;
import com.example.demomybatis.dto.ColorDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    ColorDAO colorDAO;

    @Override
    public List<ColorDTO> getAllColor() {
        return colorDAO.getAllColor();
    }

}
