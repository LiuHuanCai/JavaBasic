package com.decorate;

import java.util.HashSet;
import java.util.Set;

public class Voter {
	
	private static final int MAX_COUNT=100;
	private static int count;
	private static Set<Voter> voters = new HashSet<Voter>();
	private String name;
	
	public Voter(String name) {
		this.name = name;
	}
	
	
	/*Voter*/
	public void voteFor() {
		if(count == MAX_COUNT) {
			System.out.println("投票活动结束");
			return;
		}
		if (voters.contains(this)) {
			System.out.println(name+":您不允许重复投票");
			
		} else {
			count++;
			voters.add(this);
			System.out.println(name + ":感谢你投票");
		}
	}
	
	public static void printVoteResult() {
		System.out.println("当前投票数为：" + count);
		System.out.println("参与投票的选民如下:");
		for (Voter voter : voters) {
			System.out.println(voter.name);
		}
	}
	
	public static void main(String[] args) {
		Voter tom = new Voter("Tom");
		Voter mike = new Voter("Mike");
		Voter jack = new Voter("Jack");
		
		tom.voteFor();
		tom.voteFor();
		mike.voteFor();
		jack.voteFor();
		
		Voter.printVoteResult();
	}

}
