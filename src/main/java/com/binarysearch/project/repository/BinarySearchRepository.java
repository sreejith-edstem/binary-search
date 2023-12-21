package com.binarysearch.project.repository;

import com.binarysearch.project.model.Binary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinarySearchRepository extends JpaRepository<Binary,Long> {
}
