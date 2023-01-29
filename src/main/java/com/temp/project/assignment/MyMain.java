package com.temp.project.assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MyMain {

    /*
    * [11:38 am] Arora, Priya
    Tesco has around 3200 stores and more than 10% of the stores have around 800 colleagues each.
In a store, a colleague can work for multiple departments. Here are shifts of a colleague in various departments:
In Bakery department: From 8 to 10
In Checkout department: From 10 to 12
In Diary department: From 14 to 19
 Given the above split of shifts, provide an API/method to
 * return the different shifts of a colleague for the day after merging shifts.
 * This will be exposed to the colleague in different UI and help them plan their day accordingly.
His shift timings in this case are 8 to 12 and 14 to 19.
*/

    public static void main(String[] args) throws Exception {
        MyMain obj  =  new MyMain();
        List<Slot> blockedSlots = new LinkedList<>();

        blockedSlots.add(new Slot(5,8));
        blockedSlots.add(new Slot(7,9));
        blockedSlots.add(new Slot(14,19));

        // 1-3, 4-6, 8-10

        obj.getShift(blockedSlots);
    }

    public List<Slot> getShift(List<Slot> blockedSlots) {
        List<Slot> mergedSlots = new LinkedList<>();

        mergedSlots = merge(blockedSlots);

        System.out.println(mergedSlots);

        return mergedSlots;
    }

    private List<Slot> merge(List<Slot> blockedSlots) {
        LinkedList<Slot> sortedSlots =
                new LinkedList<>(blockedSlots.stream().sorted((o1,o2)-> o1.getStartTime() - o2.getStartTime()).collect(Collectors.toList()));

        List<Slot> mergedSlots = new LinkedList<>();

        while(sortedSlots.size()>1){

            Slot mergedSlot = new Slot();
            // 1-4 2-8
            Slot s1 = sortedSlots.removeFirst();
            Slot s2 = sortedSlots.removeFirst();

            if(s1.getStartTime()<s2.getStartTime() && s1.getEndTime() > s2.getEndTime()){
                mergedSlot.setStartTime(s1.getStartTime());
                mergedSlot.setEndTime(s1.getEndTime());
                mergedSlots.add(mergedSlot);
            }else{

                if(s1.getEndTime()==s2.getStartTime()){
                    mergedSlot.setStartTime(s1.getStartTime());
                    mergedSlot.setEndTime(s2.getEndTime());
                    mergedSlots.add(mergedSlot);
                }else if(s1.getEndTime() > s2.getStartTime()){
                    mergedSlot.setStartTime(s1.getStartTime());
                    mergedSlot.setEndTime(s2.getEndTime());
                    mergedSlots.add(mergedSlot);
                }else if(s1.getEndTime() < s2.getStartTime()){
                    mergedSlots.add(s1);
                    sortedSlots.addFirst(s2);
                }

            }


        }

        mergedSlots.add(sortedSlots.removeFirst());

        return mergedSlots;
    }
}
