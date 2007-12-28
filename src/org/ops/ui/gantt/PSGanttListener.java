package org.ops.ui.gantt;

import java.awt.Color;

public interface PSGanttListener 
{
	// All these methods return true if the operation is allowed by the underlying model, false otherwise	
    public boolean activityAdded   (PSGanttResource r, PSGanttActivity act);
    public boolean activityDeleted (PSGanttResource r, PSGanttActivity act);
    
    public boolean activityMoved        (PSGanttActivity act, long fromStart, long toStart);
    public boolean activityMoved        (PSGanttActivity act, PSGanttResource fromResource, PSGanttResource toResource);
    public boolean activityStartChanged (PSGanttActivity act, long oldStart, long newStart);
    public boolean activityEndChanged   (PSGanttActivity act, long oldEnd, long newEnd);
    
    // Mouse events
    void mouseMoved(PSGanttActivity a);
    void mouseClicked(PSGanttActivity a);
    
    // USeful to display violation information
    Color getActivityColor(PSGanttActivity act);
    Color getBackgroundColor(PSGanttResource r, long start, long end);   
}
