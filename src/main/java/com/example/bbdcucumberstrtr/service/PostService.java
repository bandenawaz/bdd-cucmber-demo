package com.example.bbdcucumberstrtr.service;

import com.example.bbdcucumberstrtr.entity.Post;
import com.example.bbdcucumberstrtr.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class PostService {

    private PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Post findById(String id) {
        return repository.findById(id).get();
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public Post deleteById(String id) {
        Post post = findById(id);
        repository.deleteById(post.getId());

        return post;
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}