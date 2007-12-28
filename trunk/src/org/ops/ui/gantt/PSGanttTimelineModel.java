package org.ops.ui.gantt;

import java.util.Calendar;

// manages the conversion between times in the model and Calendar dates if necessary
public interface PSGanttTimelineModel 
{
    public long calendarToGanttTime(Calendar c);
    public Calendar ganttTimeToCalendar(long gt);
}
