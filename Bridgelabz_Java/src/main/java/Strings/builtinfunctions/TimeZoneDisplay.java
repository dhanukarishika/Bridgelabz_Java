/*
 * Q1. Time Zones and ZonedDateTime
 * Write a Java program to display the current time
 * in GMT, IST, and PST using ZonedDateTime and ZoneId.
 */
package Strings.builtinfunctions;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZoneDisplay {
    // Method to display current time in a given time zone
    public static void displayTime(String zoneName, String zoneId) {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        System.out.println(zoneName + ": " + currentTime.format(formatter));
    }
    public static void main(String[] args) {
        System.out.println("Current Time in Different Time Zones:");
        displayTime("GMT", "GMT");
        displayTime("IST", "Asia/Kolkata");
        displayTime("Pacific Time", "America/Los_Angeles");
    }
}