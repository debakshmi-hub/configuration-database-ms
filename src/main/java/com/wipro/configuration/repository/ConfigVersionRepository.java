package com.wipro.configuration.repository;

import com.wipro.configuration.entity.ConfigVersion;
import com.wipro.configuration.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ConfigVersionRepository extends JpaRepository<ConfigVersion, Long> {
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM config_versions WHERE config_id = :configId", nativeQuery = true)
    void deleteByConfigurationIds(@Param("configId") Long configId);
}
