package com.rest;

import java.util.HashMap;
import java.util.Map;

public enum TodoDao {
instance;
private Map<String,Todo> contentProvider = new HashMap<String,Todo>();

private TodoDao() {
	Todo do1= new Todo("1","Learn REST");
	do1.setDescription("Learn REST and do some POC's on it to get a good hold on the subject");
	Todo do2= new Todo("2","Push Project code to git");
	do2.setDescription("Push the various important project/POc's present in the java_workspace folder,that have been done so far into GIT");
	
	contentProvider.put("1",do1);
	contentProvider.put("2",do2);
}

public Map<String,Todo> getModel()
{
	return contentProvider;
}

}
