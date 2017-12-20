package com.uttara.project;

import java.util.Comparator;
import java.util.Date;

public class DueDateComparator implements Comparator<TaskBean> 
{

	public int compare(TaskBean task1, TaskBean task2)
	{
		Date d1 = task1.getEnd_dt();
		Date d2 = task2.getEnd_dt();
		
		return d1.compareTo(d2);
		
	}

}
