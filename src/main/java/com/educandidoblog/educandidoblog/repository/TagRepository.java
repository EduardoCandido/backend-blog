package com.educandidoblog.educandidoblog.repository;

import com.educandidoblog.educandidoblog.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

    @Query(nativeQuery = true,
    value = "SELECT tag.* FROM tag tag WHERE tag.name LIKE ':name%'")
    Optional<List<Tag>> findByName(String name);
}
