/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String[] a){
        long startTime = System.currentTimeMillis();

        HostBlackListsValidator hblv = new HostBlackListsValidator();
        List<Integer> blackListOccurrences = hblv.checkHost("200.24.34.55", 100); // Use the desired number of threads
        System.out.println("The host was found in the following blacklists:" + blackListOccurrences);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Execution time: " + (elapsedTime / 1000.0) + " seconds");
    }
    
}
