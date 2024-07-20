package com.wipro.configuration.repository;

import com.wipro.configuration.entity.ConfigVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigVersionRepository extends JpaRepository<ConfigVersion,Long> {

}
