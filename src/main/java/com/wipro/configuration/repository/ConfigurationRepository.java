package com.wipro.configuration.repository;

import com.wipro.configuration.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfigurationRepository extends JpaRepository<Configuration,Long> {
    List<Configuration> findByDeviceId(String deviceId);
}
