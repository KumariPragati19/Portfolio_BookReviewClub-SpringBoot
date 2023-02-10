package com.example.demo.repository;
import javax.xml.stream.events.Comment;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.comment;

public interface CommentRepository extends CrudRepository<comment,Integer>{

	Comment save(Comment comment);

}
