package com.testing;

import java.util.*;

public class MapEx{
  public static void main (String args[]){
    Map map = new HashMap();
    map.put("Name","Doom");
    map.put("Gun","Shotgun");
    map.put("Ammo",new Integer(30));
    //overwrites
    map.put("Ammo",new Integer(5));
    
    Set st = map.keySet();
    
    Collection collection = map.values();
    Set st1 = map.entrySet();
    System.out.println(st +"\n"+ collection + "\n" + st1); 
    System.out.println("Value of Ammo Key :"+map.get("Ammo"));
  }
}