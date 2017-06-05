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
			System.out.println("ͶƱ�����");
			return;
		}
		if (voters.contains(this)) {
			System.out.println(name+":���������ظ�ͶƱ");
			
		} else {
			count++;
			voters.add(this);
			System.out.println(name + ":��л��ͶƱ");
		}
	}
	
	public static void printVoteResult() {
		System.out.println("��ǰͶƱ��Ϊ��" + count);
		System.out.println("����ͶƱ��ѡ������:");
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
