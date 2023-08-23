package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlacklistSearchThread extends Thread{
    private final int startIndex, endIndex;
    private final String ipaddress;
    private final HostBlacklistsDataSourceFacade skds;
    private int occurrences = 0;
    private final LinkedList<Integer> blackListOccurrences = new LinkedList<>();


    public BlacklistSearchThread(int startIndex, int endIndex, String ipaddress, HostBlacklistsDataSourceFacade skds) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.ipaddress = ipaddress;
        this.skds = skds;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            if (skds.isInBlackListServer(i, ipaddress)) {
                blackListOccurrences.add(i);
                occurrences++;
            }
        }
    }

    public int getOccurrences() {
        return occurrences;
    }

    public LinkedList<Integer> getBlackListOccurrences() {
        return blackListOccurrences;
    }
}
