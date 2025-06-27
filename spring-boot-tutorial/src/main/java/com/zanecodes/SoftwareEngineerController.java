package com.zanecodes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(new SoftwareEngineer(1, "Zane Peck", "js, node.js, express.js, vue.js"), 
                       new SoftwareEngineer(2, "Emily Tin", "Java, Spring Boot, SQL, Python"));
    }

}
