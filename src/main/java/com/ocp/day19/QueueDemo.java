
package com.ocp.day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //排隊打針
        //Queue佇列
        Queue<String> names=new LinkedList<>();
        names.offer("john");//新增
        names.offer("Mary");
        names.offer("Helen");
        System.out.println("排隊打針: "+names);
        while (!names.isEmpty()) {            
            String name=names.poll();//檢索並刪除此列表的頭（第一個元素）
            System.out.println(name+"在打針 排隊打針:"+names);
        }
    }
}
