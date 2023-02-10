package com.example.demo.service;
import java.util.Optional;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.Commentdto;
import com.example.demo.entity.Book;
import com.example.demo.entity.comment;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.CommentRepository;

public abstract class CommentServiceImpl implements CommentService {
	@Autowired
	private BookRepository bRepo;
	@Autowired
    private CommentRepository cRepo;
	
	private Object modelMapper;
//	
//   @Override
//   public Commentdto createComment(Commentdto commentdto, Integer id) {
//		Book book=this.bRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Book","book id",id));
//		Comment comment = this.modelMapper.map(commentdto,Comment.class);
//		comment.setBook(book);
//		Comment savedComment=this.cRepo.save(comment);
//		return this.modelMapper.map(savedComment,Commentdto.class);
//		
	
//	@Override
//	public void deleteComment(Integer commentId) {
//		comment com=this.cRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("comment","CommentId",commentId));
//		this.cRepo.delete(com);
//		
//	}

}