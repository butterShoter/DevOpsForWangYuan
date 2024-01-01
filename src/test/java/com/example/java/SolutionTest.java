package com.example.java;

import org.junit.Test;
import  java.util.*;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void findMinHeightTressTest(){
        Solution solution=new Solution();

        //define input,res for test
        List<List<Integer>>inputList=new ArrayList<>();
        List<List<Integer>>resList=new ArrayList<>();

        inputList.add(Arrays.asList(4,1,0,1,2,1,3));
        resList.add(Arrays.asList(1));

        inputList.add(Arrays.asList(6,3,0,3,1,3,2,3,4,5,4));
        resList.add(Arrays.asList(3,4));

        for (int i=0;i<inputList.size();i++) {
            //load input,res
            List<Integer>input=inputList.get(i);
            List<Integer>resExcept=resList.get(i);
            //build params
            int n=input.get(0);
            int edgesSize=(input.size()-1)/2;
            int[][]edges=new int[edgesSize][2];
            for(int j =0;j<edgesSize;j++){
                int[] eachEdge=new int[2];
                eachEdge[0]=input.get(1+2*j);
                eachEdge[1]=input.get(2+2*j);
                edges[j]=eachEdge;
            }
            //run
            List<Integer> res = solution.findMinHeightTrees(n,edges);
            //check
            assertEquals(resExcept,res);
        }
    }

    @Test
    public void certainlyFaultTest(){
        assertEquals(false,true);
        assertEquals(0,1);
        assertEquals('A','B');
        assertEquals("Wrong","Right");
    }
}
