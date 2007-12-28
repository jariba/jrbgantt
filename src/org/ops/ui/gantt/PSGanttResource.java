package org.ops.ui.gantt;

import java.util.Map;

public interface PSGanttResource 
{
    public Object getKey();
    public Map<String,String> getAttributes();
    
    // TODO: support for a resource hierarchy could be added later
    // public Iterator<PSGanttResource> getChildren();
}
