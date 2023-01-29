package com.temp.project;

import org.apache.commons.lang3.*;


import java.util.*;


public class ZigZagMain {
    public String convert(String s, int numRows) {
        /*
        if(s.length()==1) return s;
        boolean goOn = true;
        boolean normalRow = true;
        String result = "";
        String shortString = "";
        int iteration = 1;
        do{
            int itMod = iteration%numRows;
            System.out.println("iteration mod "+itMod);
            if(normalRow && itMod!=0){
                if(numRows>s.length()) numRows = s.length();
                System.out.println(s.substring(0,numRows));
                s = s.substring(numRows);
            }else{
                shortString = s.substring(0,1);
                shortString = StringUtils.leftPad(shortString,itMod," ");
                shortString = StringUtils.rightPad(shortString, numRows, " ");
                System.out.println(shortString);
                s = s.substring(1);
            }
            normalRow = (!normalRow);
            iteration++;
        }while(s.length()>=0);

        String lastRow = s.substring(0,s.length());
        System.out.println(lastRow);
*/
        //[0,0],[0,1],[0,2],[0,3]
        //[1,0],[1,1],[1,2],[1,3]
        //[2,0],[2,1],[2,2],[2,3]
        //[3,0],[3,1],[3,2],[3,3]

/*        Map<Integer, List<Integer>> map = new HashMap();
        map.put(0,new LinkedList());*/
        int i=0,j=0,k=0;
        int len = s.length();
        char[][] arr = new char[len][len];
        StringBuffer result = new StringBuffer();
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                arr[i][j]=' ';
            }
            //System.out.println("\n");
        }

        for(i=0,j=0;i<numRows && k<len ;i++) {
            //System.out.println(i + " " + j+ " "+s.charAt(k));
            arr[i][j]=s.charAt(k);
            k++;
            if (i == numRows - 1) {
                while (i != 0) {
                    i--;
                    j++;
                    //System.out.println(i + " " + j+ " "+s.charAt(k));
                    arr[i][j]=s.charAt(k);
                    k++;
                }
            }
        }

        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                //System.out.print(arr[i][j]);
                if(arr[i][j]!=' ')
                    result.append(arr[i][j]);
            }
            //result.trimToSize();
            //result.append("\n");
            //System.out.println("\n");
        }

        System.out.println(result);

        return result.toString();
    }

    public static void main(String[] args) {
        //System.out.println();
        new ZigZagMain().convert("PAYPALISHIRING",3);
    }
}
