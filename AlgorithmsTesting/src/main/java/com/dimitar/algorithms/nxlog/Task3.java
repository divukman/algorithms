package com.dimitar.algorithms.nxlog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  The following code filters elements from a collection by statuses to another collection:
 *
 *   Rewrite this code using Java8 stream and functions API.
 */
public class Task3 {


    public static void main(String[] args) {
       /* final List<AgentInfoBean> agentInfos = fetchItems();
        List<AgentInfoBean> filteredResults = new LinkedList<AgentInfoBean>();
        for (AgentInfoBean item : agentInfos) {
            if (states.contains(item.getStatus())) {
                filteredResults.add(item);
            }
        }*/

        // Ok should be routine

        // MY VERSION
        final List<String> agentInfos = new ArrayList<>();
        agentInfos.add("JOHN");
        agentInfos.add("JEAN LUC");
        agentInfos.add("FRANK");
        agentInfos.add("WORF SON OF MOOGH");

        final List<String> states = new ArrayList<>();
        states.add("FRANK");

        List<String> filteredResults =
                agentInfos.stream()
                        .filter(info -> states.contains(info))
                        .collect(Collectors.toList());

        System.out.println(filteredResults);


        //SOLUTION
     /*   List<String> filteredResults2 =
                agentInfos.stream()
                        .filter(info -> states.contains(info.getStatus()))
                        .collect(Collectors.toList());*/

    }
}
