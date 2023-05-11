package com.strato.skylift.equipment.repository;

import com.strato.skylift.entity.Equipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepositroy extends JpaRepository<Equipment , Long>
{
    @EntityGraph(attributePaths = {"equCategory"})
    Page<Equipment> findAll(Pageable pageable);
}
