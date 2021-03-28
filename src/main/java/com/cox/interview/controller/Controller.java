package com.cox.interview.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.cox.interview.model.Greeting;
import com.cox.interview.service.DatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {


    @Autowired
    DatasetService datasetService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello World";
    }

    @GetMapping("/{datasetId}")
    public String postDataset(@PathVariable String datasetId) {
        return datasetService.createDataset(datasetId);
    }
}