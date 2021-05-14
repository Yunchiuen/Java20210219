
package com.lab.cdc;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;
//負責抓取網路jason資料
public class JasonThread implements Callable<String>{
    private String Path;//jason路徑

    public JasonThread(String Path) {
        this.Path = Path;
    }
    
    @Override
    public String call() throws Exception {
        URL url=new URL(Path);
        // \A這個 pattern 代表的是全部選擇
        // 透過 Scanner 可以將網路串流(openStream())變成字串
        //利用inputStreamReader中文編碼
        InputStreamReader isr=new InputStreamReader(url.openStream(),"utf-8");
        String json=new Scanner(isr).useDelimiter("\\A").next();
        return json;
    }
    
}
