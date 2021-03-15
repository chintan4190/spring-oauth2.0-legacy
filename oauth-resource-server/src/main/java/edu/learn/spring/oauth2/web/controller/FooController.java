package edu.learn.spring.oauth2.web.controller;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foos")
public class FooController {

    @PreAuthorize("#oauth2.hasScope('read')")
    @GetMapping("/{id}")
    public String retrieveFoo(@PathVariable("id") Long id) {
        return "Hello" + RandomStringUtils.randomAlphabetic(6);
    }

}
