package com.antoine.api;

import java.io.File;
import java.util.ArrayList;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class SkillsAPI {

	
	
	private static ArrayList<SkillGroup> skills = new ArrayList<SkillGroup>();
	

	
	private final static String SKILL_FILE_PATH = "data/xml/SkillAPI.xml";
	
	public static Document getSkillAPI(){
		
		Document doc = null;
		SAXBuilder sxb = new SAXBuilder();
	      try
	      {
	         //On crée un nouveau document JDOM avec en argument le fichier XML
	         //Le parsing est terminé ;)
	    	  doc = sxb.build(new File(SKILL_FILE_PATH));
	      }
	      catch(Exception e){
	    	  e.printStackTrace();
	      }
	
		
	      return doc;
		
		
	}
	
	
	public static void setSkillTree(){
		Document doc = getSkillAPI(); //TODO test si null
		
		Element data = doc.getRootElement().getChild("result");
		
		
		System.out.println(data.toString());
		for (Element child: data.getChildren("skillGroups")) {
			System.out.println(data.getAttributeValue("groupName"));
			
			//for(Element element : )
		}
		
		
		
	}
	
}
