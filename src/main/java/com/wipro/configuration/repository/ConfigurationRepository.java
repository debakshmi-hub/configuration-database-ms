package com.wipro.configuration.repository;

import com.wipro.configuration.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository<Configuration,Long> {

}
