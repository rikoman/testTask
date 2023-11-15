package com.example.testovoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestApiControllerTest {


    private RestApiController restApiController;

    @BeforeEach
    void setUp() {
        restApiController = new RestApiController(new ApiService());
    }

    @Test
    void testDuplicatesInText() {
        String text = "aaaaabcccc";

        String extend = "{a=5, c=4, b=1}";

        ResponseEntity<Map<Character,Integer>> response = restApiController.duplicatesInText(text) ;

        assertEquals(extend,response.getBody().toString());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}