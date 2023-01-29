package com.temp.project.assignment;

import java.util.LinkedList;
import java.util.List;

public class MyMainTest {

    public static void main(String[] args) {
        MyMainTest obj =  new MyMainTest();
        obj.testhappyPath();
    }

    //@Test
    public void testhappyPath(){

        List<Slot> blockedSlots = new LinkedList<>();

        blockedSlots.add(new Slot(5,8));
        blockedSlots.add(new Slot(7,9));
        blockedSlots.add(new Slot(14,19));

        MyMain obj = new MyMain();

        List<Slot> result = obj.getShift(blockedSlots);

        if(result==null){
            System.out.println("Failed");
        }else{
            System.out.println("null check passed");
        }

        if(result.size()==2){
            System.out.println("Passed the size test");
        }else{
            System.out.println("Failed the size test, the slots are not merged correctly");
        }


//        assertEquals(result.size(), 2);
//        assertEquals(result.get(0).getStartTime(), 5);
//        assertEquals(result.get(0).getEndTime(), 9);
//

    }

}
