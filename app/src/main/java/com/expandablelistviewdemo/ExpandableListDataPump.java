package com.expandablelistviewdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {

    public static HashMap<String,List<String>> getData()
    {
        HashMap<String,List<String>> expandableListDetails=new HashMap<String,List<String>>();

        List<String> cricket=new ArrayList<String>();

        cricket.add("India");
        cricket.add("Pakistan");
        cricket.add("Australia");
        cricket.add("England");
        cricket.add("South Africa");

        List<String> football = new ArrayList<String>();
        football.add("Brazil");
        football.add("Spain");
        football.add("Germany");
        football.add("Netherlands");
        football.add("Italy");


        List<String> basketball = new ArrayList<String>();
        basketball.add("United States");
        basketball.add("Spain");
        basketball.add("Argentina");
        basketball.add("France");
        basketball.add("Russia");

        expandableListDetails.put("CRICKET TEAMS", cricket);
        expandableListDetails.put("FOOTBALL TEAMS", football);
        expandableListDetails.put("BASKETBALL TEAMS", basketball);
        return expandableListDetails;
    }
}
