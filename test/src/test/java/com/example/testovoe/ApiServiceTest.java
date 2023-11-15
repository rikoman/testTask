package com.example.testovoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ApiServiceTest {

    private ApiService apiService;

    @BeforeEach
    void setUp() {
        apiService = new ApiService();
    }

    @Test
    void testDuplicatesSymbolInText() {
        String text = "aaaaabcccc";

        String extend = "{a=5, c=4, b=1}";

        String actual = apiService.duplicatesSymbolInText(text).toString();

        assertEquals(extend,actual);
    }

    @Test
    void testShouldReturnOneSymbol(){
        String text = "w";

        String extend = "{w=1}";

        String actual = apiService.duplicatesSymbolInText(text).toString();

        assertEquals(extend,actual);
    }

    @Test
    void testShouldReturnEmpty(){
        String text = "";

        String extend = "{}";

        String actual = apiService.duplicatesSymbolInText(text).toString();

        assertEquals(extend,actual);
    }

    @Test
    void testDuplicatesSymbolInTextWithNumber(){
        String text = "abcccc22344aabbggg5637";

        String actual = apiService.duplicatesSymbolInText(text).toString();

        String extend = "{c=4, a=3, b=3, g=3, 2=2, 3=2, 4=2, 5=1, 6=1, 7=1}";

        assertEquals(extend,actual);
    }
}