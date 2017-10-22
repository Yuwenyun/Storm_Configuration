package com.owen.spouts;

import java.util.Map;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.owen.Storm_Models.Employee;
import com.owen.services.EmployeeClientService;

public class EmployeeSpout extends BaseRichSpout
{
	public static Logger logger = LoggerFactory.getLogger(EmployeeSpout.class);
	
	private static final long serialVersionUID = 1L;
	private SpoutOutputCollector collector;
	private EmployeeClientService client;

	public void open(Map conf, TopologyContext context, SpoutOutputCollector collector)
	{
		this.collector = collector;
		this.client = new EmployeeClientService();
	}

	public void nextTuple()
	{
		Employee emp = client.getEmployee();
		logger.info("Get employee from client: " + emp.toString());
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer)
	{
	}
}
