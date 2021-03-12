package com.ocp.day08;

import java.util.Date;

public class BigData {

    //建構子的任務就是初始物件
    //private String data = "我是一個大資料" + new Date();
    private String data;
    private String author = "Yun";
    private static String version = "1.0";

    //物件初始區段  會自動將此區段程式碼放在建構子第一行
    {
        if (version.equals("1.0")) {
            data = "盤中資料";
        } else {
            data = "盤後資料";
        }
    }
    //類別變數初使區塊
    static{
        if (new Date().getTime() % 2 == 0) {
            version = "1.0";
        } else {
            version = "2.0";
        }
    }
    
    public BigData() {

        //data="我是小資料";
    }

    @Override
    public String toString() {
        return "BigData{" + "data=" + data + ", author=" + author + ", version=" + version + '}';
    }
}
