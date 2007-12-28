package org.ops.ui.gantt;

public interface PSGanttActivity 
{
	public Object getKey();
    public long getStart();
    public long getFinish();
    public double getViolation();
}
