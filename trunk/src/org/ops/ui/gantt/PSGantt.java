package org.ops.ui.gantt;

import org.ops.ui.PSComponent;

public interface PSGantt 
    extends PSComponent
{
	public PSGanttModel getModel();
	public void setModel(PSGanttModel m);
	
	// Displays the time scale and manages conversion between model times and display times
	public PSGanttTimeline getTimeline();
	public void setTimeline(PSGanttTimeline t);
}
