package com.en.Repository;

import com.en.Entity.AdapterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by azafirov on 10/25/2016.
 */
@Transactional
public interface AdapterRepository extends JpaRepository<AdapterEntity, Long> {
}
