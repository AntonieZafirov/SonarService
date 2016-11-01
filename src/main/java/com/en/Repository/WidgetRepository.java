package com.en.Repository;

import com.en.Entity.WidgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by azafirov on 10/21/2016.
 */
@Transactional
public interface WidgetRepository extends JpaRepository<WidgetEntity, Long> {
}
