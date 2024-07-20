package com.wipro.configuration.service;

import com.wipro.configuration.entity.Configuration;

import java.util.List;

public interface ConfigurationService {

    Configuration addConfig(Configuration configuration);

    List<Configuration> getAll();
}
