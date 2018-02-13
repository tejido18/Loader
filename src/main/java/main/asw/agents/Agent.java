package main.asw.agents;

public interface Agent {
	
	public static final int PERSON = 1;
	public static final int ENTITY = 2;
	public static final int SENSOR = 3;
	
	String getName();

	String getEmail();
	
	String getId();
	
	int getAgentKind();
	
}