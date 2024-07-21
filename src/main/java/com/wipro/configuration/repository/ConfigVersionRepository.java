package com.wipro.configuration.repository;

import com.wipro.configuration.entity.ConfigVersion;
import com.wipro.configuration.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfigVersionRepository extends JpaRepository<ConfigVersion, Long> {
    List<ConfigVersion> findByDeviceId(String deviceId);
}
