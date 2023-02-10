package com.example.demo.dto;

import java.util.HashSet;
import java.util.Set;

public class BookDto<Comment> {
	
  private Set<Comment> comments=new HashSet<>();

public Set<Comment> getComments() {
	return comments;
}

public void setComments(Set<Comment> comments) {
	this.comments = comments;
}
}
