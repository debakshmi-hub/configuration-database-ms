package com.wipro.configuration.service.impl;

import com.wipro.configuration.entity.Configuration;
import com.wipro.configuration.repository.ConfigurationRepository;
import com.wipro.configuration.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {


    @Autowired
    private ConfigurationRepository configurationRepository;

    @Override
    public Configuration addConfig(Configuration configuration) {
        final Configuration dataReceivedFromDb = configurationRepository.save(configuration);
        return dataReceivedFromDb;

    }

    @Override
    public List<Configuration> getAll() {
        return configurationRepository.findAll();
    }
}
