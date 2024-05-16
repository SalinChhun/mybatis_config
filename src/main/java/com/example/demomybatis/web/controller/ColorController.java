package com.example.demomybatis.web.controller;

import com.example.demomybatis.service.color.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ColorController {

    private final ColorService colorService;

    @GetMapping("/colors")
    public ResponseEntity<?> getAllColor() {
        return ResponseEntity.ok(colorService.getAllColor());
//        return ResponseEntity.ok("OK");
    }
}
