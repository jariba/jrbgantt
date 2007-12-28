package org.ops.ui.gantt;

public interface PSGanttModelListener 
{
    public void activityAdded(Object resourceKey, PSGanttActivity act);
    public void activityChanged(Object resourceKey, PSGanttActivity act); // TODO: be more specific about change?
    public void activityDeleted(Object resourceKey, PSGanttActivity act);
    
    public void modelReset(); // if the old model was thrown away
}
