package com.owen.Storm_Configuration;

import org.apache.storm.topology.TopologyBuilder;

import com.owen.spouts.EmployeeSpout;

public class ConfigurationTopologyBuilder
{
	public static TopologyBuilder build()
	{
		TopologyBuilder builder = new TopologyBuilder();
		EmployeeSpout employeeSpout = new EmployeeSpout();
		
		builder.setSpout("employeeSpout", employeeSpout);
		
		return builder;
	}
}
