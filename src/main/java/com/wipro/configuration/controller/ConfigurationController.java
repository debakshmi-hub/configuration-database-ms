package com.wipro.configuration.controller;

import com.wipro.configuration.entity.Configuration;
import com.wipro.configuration.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/config")
public class ConfigurationController {
    @Autowired
    private ConfigurationService configurationService;

    @PostMapping(value = "/add")
    public ResponseEntity<Configuration> addConfiguration(@RequestBody Configuration configuration) {
        final Configuration savedConfiguration = configurationService.addConfig(configuration);
        return new ResponseEntity<>(savedConfiguration, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Configuration>> getAllConfiguration() {
        final List<Configuration> configurations = configurationService.getAll();
        return new ResponseEntity<>(configurations, HttpStatus.OK);
    }
}
