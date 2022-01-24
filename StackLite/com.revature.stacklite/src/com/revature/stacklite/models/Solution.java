package com.revature.stacklite.models;

public class Solution {
	
	private String answer;
	private int id;
	private int upvote;
	
	public Solution() {
		
	}
	public Solution(String answer, int upvote) {
		this.answer = answer;
		this.upvote = upvote;
	}

	public Solution (String answer) {
		this.answer = answer;
		this.upvote = 0;
	}
}
