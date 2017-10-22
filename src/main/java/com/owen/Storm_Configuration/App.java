package com.owen.Storm_Configuration;

import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.generated.AlreadyAliveException;
import org.apache.storm.generated.AuthorizationException;
import org.apache.storm.generated.InvalidTopologyException;

public class App 
{
    public static void main( String[] args ) throws AlreadyAliveException, InvalidTopologyException, AuthorizationException
    {
        Config config = new Config();
        config.setNumWorkers(1);
        config.setDebug(true);
        
        StormSubmitter.submitTopology("configuration-topology", config, ConfigurationTopologyBuilder.build().createTopology());
    }
}
