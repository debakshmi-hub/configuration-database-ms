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

    // http://localhost:8088/api/config/add
//       {
//            "deviceId": "CISCO-ROUTER-2",
//                "configData": "id-user pass-123",
//                "version": 1
//        }
    @PostMapping(value = "/add")
    public ResponseEntity<Configuration> addConfiguration(final @RequestBody Configuration configuration) {
        final Configuration savedConfiguration = configurationService.addConfig(configuration);
        return new ResponseEntity<>(savedConfiguration, HttpStatus.CREATED);
    }
    //  http://localhost:8088/api/config/getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<Configuration>> getAllConfiguration() {
        final List<Configuration> configurations = configurationService.getAll();
        return new ResponseEntity<>(configurations, HttpStatus.OK);
    }

    // http://localhost:8088/api/config/update/1
//    {
//        "deviceId": "TP-LINK-ROUTER-1",
//            "configData": "id-USER1 pass-12345678"
//    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Configuration> updateConfiguration(final @RequestBody Configuration configuration,
                                                             final @PathVariable Long id) {
        final Configuration updatedConfiguration = configurationService.updateConfiguration(configuration, id);
        return new ResponseEntity<>(updatedConfiguration, HttpStatus.OK);
    }

    //  http://localhost:8088/api/config/4
    @GetMapping("/{configId}")
    public ResponseEntity<Configuration> getConfiguration(final @PathVariable Long configId) {
        final Configuration configuration = configurationService.getConfiguration(configId);
        return new ResponseEntity<>(configuration, HttpStatus.OK);
    }
    //  http://localhost:8088/api/config/2
    @DeleteMapping("/{configId}")
    public ResponseEntity<Void> deleteConfiguration(final @PathVariable Long configId) {
        configurationService.deleteConfig(configId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
