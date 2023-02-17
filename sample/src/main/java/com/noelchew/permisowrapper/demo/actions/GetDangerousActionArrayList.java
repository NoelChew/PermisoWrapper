package com.noelchew.permisowrapper.demo.actions;

import java.util.ArrayList;

/**
 * Created by noelchew on 16/08/2016.
 */
public class GetDangerousActionArrayList {
    public static ArrayList<DangerousAction> getDangerousActions() {
        ArrayList<DangerousAction> dangerousActionArrayList = new ArrayList<>();
        dangerousActionArrayList.add(new DangerousAction("Pick Folder/File"));
        dangerousActionArrayList.add(new DangerousAction("Scan QR Code"));
        dangerousActionArrayList.add(new DangerousAction("Pick Picture/Video"));
        dangerousActionArrayList.add(new DangerousAction("Take Picture"));
        dangerousActionArrayList.add(new DangerousAction("Take Video"));
        dangerousActionArrayList.add(new DangerousAction("Pick Audio"));
        dangerousActionArrayList.add(new DangerousAction("Record Voice"));
        dangerousActionArrayList.add(new DangerousAction("Send Voice Message"));
        dangerousActionArrayList.add(new DangerousAction("Make Voice Call"));
        dangerousActionArrayList.add(new DangerousAction("Make Video Call"));
        dangerousActionArrayList.add(new DangerousAction("Share Location"));
        dangerousActionArrayList.add(new DangerousAction("Locate User"));
        dangerousActionArrayList.add(new DangerousAction("Autofill Area Code"));
        dangerousActionArrayList.add(new DangerousAction("Access Contacts"));
        dangerousActionArrayList.add(new DangerousAction("Recommend New Friends"));
        dangerousActionArrayList.add(new DangerousAction("Save Media to Storage"));
        dangerousActionArrayList.add(new DangerousAction("Save Content to Storage"));
        dangerousActionArrayList.add(new DangerousAction("Access Calendar"));
        dangerousActionArrayList.add(new DangerousAction("Access Phone Features"));
        dangerousActionArrayList.add(new DangerousAction("Get Phone Number"));
        dangerousActionArrayList.add(new DangerousAction("Make Phone Call"));
        dangerousActionArrayList.add(new DangerousAction("Answer Phone Call"));
        dangerousActionArrayList.add(new DangerousAction("Access SMS"));
        dangerousActionArrayList.add(new DangerousAction("Send SMS"));
        dangerousActionArrayList.add(new DangerousAction("Read SMS"));
        dangerousActionArrayList.add(new DangerousAction("Access Phone Sensors"));
        dangerousActionArrayList.add(new DangerousAction("Enable BLE"));
        dangerousActionArrayList.add(new DangerousAction("Receive Notifications"));

        return dangerousActionArrayList;
    }

}
