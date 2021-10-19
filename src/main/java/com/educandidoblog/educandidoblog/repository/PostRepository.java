package com.educandidoblog.educandidoblog.repository;

import com.educandidoblog.educandidoblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


    @Query(nativeQuery = true,
    value = "SELECT pos.* from post pos where pos.user_id = :userId")
    List<Post> findPostsByUser(Long userId);
}
