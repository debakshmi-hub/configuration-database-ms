package com.wipro.configuration.service;

import com.wipro.configuration.entity.Configuration;

import java.util.List;

public interface ConfigurationService {

    Configuration addConfig(Configuration configuration);

    List<Configuration> getAll();

    Configuration updateConfiguration(Configuration configuration, Long id);

    Configuration getConfiguration(Long deviceId);
    void deleteConfig(Long deviceId);
}
