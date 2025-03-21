package org.hyeon.tour.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.File;
import java.util.Map;

@SpringBootTest
@ActiveProfiles("test")
public class ApiTest {

    @Autowired
    private ObjectMapper om;

    @Test
    void test1() throws Exception{
        File file = new File("D:/data/data.json");
        Map<String, Object> data = om.readValue(file, new TypeReference<>(){});
        System.out.println(data);
    }

}
