package com.example.bbdcucumberstrtr.repository;

import com.example.bbdcucumberstrtr.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}