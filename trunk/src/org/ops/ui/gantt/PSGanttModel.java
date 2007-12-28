package org.ops.ui.gantt;

import java.util.Iterator;

/*
 * Notice there are no mehotds to change the data, all changes are supposed to come from inside
 * the model and propagated through events to the view, if there are changes amde through the gantt
 * the component listening to the gantt events should trap them and change the underlying data, which should then 
 * propagate those changes through model events
 */ 

public interface PSGanttModel 
{	
	public Iterator<String> getResourceAttributeNames();	
	// TODO: These calls could be made smarter to load data only within a window
	public Iterator<PSGanttResource> getResources();
	public Iterator<PSGanttActivity> getActivities(Object resourceKey);
	
	public PSGanttResource getResource(Object key);
	public PSGanttResource getResourceForActivity(Object actKey);
	
	public PSGanttActivity getActivity(Object key);	
}
