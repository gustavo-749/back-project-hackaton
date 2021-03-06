package com.herox.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value="/")
public class AuxController {

    @RequestMapping(method = RequestMethod.GET, path = "")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
    }

}
