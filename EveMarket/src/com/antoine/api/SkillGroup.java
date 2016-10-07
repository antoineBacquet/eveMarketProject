package com.antoine.api;

import java.util.ArrayList;

public class SkillGroup {
	
	private ArrayList<Skill> skills;
	
	private int id;
	private String name;

	public SkillGroup(int id, String name){
		this.id = id;
		this.name = name;
		
		skills = new ArrayList<Skill>();
	}
	
	
	public void addSkill(Skill skill){
		skills.add(skill);
	}

}
