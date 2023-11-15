package com.example.testovoe;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private final ApiService apiService;

    public RestApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping
    public ResponseEntity<Map<Character,Integer>> duplicatesInText(@RequestParam String body){
        return new ResponseEntity<>(apiService.duplicatesSymbolInText(body), HttpStatus.OK);
    }
}
