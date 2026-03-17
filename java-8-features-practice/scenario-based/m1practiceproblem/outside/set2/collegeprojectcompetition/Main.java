package m1practiceproblem.outside.set2.collegeprojectcompetition;

import java.util.*;

class ProjectTeam {
	
	String teamId;
	String section;
	String domain;
	String projectName;
	int score;
	
	public ProjectTeam(String teamId, String section, String domain,
			String projectName, int score) {
		
		this.teamId= teamId;
		this.section= section;
		this.domain= domain;
		this.projectName= projectName;
		this.score= score;
	}
}

public class Main {
	
	static ArrayList<ProjectTeam> list= new ArrayList<>();
	
	public static void registerTeam(String teamId, String section,
			String domain, String projectName, int score) {
		
		for(ProjectTeam p: list) {
			if(p.teamId.equalsIgnoreCase(teamId)) {
				return;
			}
		}
		
		list.add(new ProjectTeam(teamId, section, domain, projectName, score));
	}
	
	public static void reviseScore(String teamId, int score) {
		
		for(ProjectTeam p: list) {
			if(p.teamId.equalsIgnoreCase(teamId)) {
				p.score= score;
				System.out.println("REVISED "+teamId+" "+score);
				return;
			}
		}
		
		System.out.println("team is not available");
	}
	
	public static void filterByDomain(String domain) {
		
		boolean found=false;
		
		for(ProjectTeam p: list) {
			if(p.domain.equalsIgnoreCase(domain)) {
				System.out.println(p.teamId+" "+p.section+" "+p.domain+" "+p.projectName+" "+p.score);
				found=true;
			}
		}
		
		if(!found) {
			System.out.println("Team is not available for the domain: "+domain);
		}
	}
	
	public static void qualifyTeams(int cutoff) {
		
		boolean found=false;
		
		for(ProjectTeam p: list) {
			if(p.score>=cutoff) {
				System.out.println(p.teamId+" "+p.section+" "+p.domain+" "+p.projectName+" "+p.score);
				found=true;
			}
		}
		
		if(!found) {
			System.out.println("No team qualified");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String line= sc.nextLine();
			String[] strArray= line.split("\\s+");
			
			if(strArray[0].equalsIgnoreCase("REGISTER")) {
				
				registerTeam(strArray[1], strArray[2], strArray[3],
						strArray[4], Integer.parseInt(strArray[5]));
			}
			
			else if(strArray[0].equalsIgnoreCase("REVISE")) {
				
				reviseScore(strArray[1], Integer.parseInt(strArray[2]));
			}
			
			else if(strArray[0].equalsIgnoreCase("FILTERDOMAIN")) {
				
				filterByDomain(strArray[1]);
			}
			
			else {
				
				qualifyTeams(Integer.parseInt(strArray[1]));
			}
		}
	}
}