
package com.lab.test_rice;

import com.lab.rice.RiceJsonThread;
import java.util.concurrent.FutureTask;
import org.junit.Test;

public class Test_RiceJsonThread {
    @Test
    public void Test(){
        String path="https://data.coa.gov.tw/Service/RedirectService.aspx?UnitId=268&url=https%3a%2f%2fdata.coa.gov.tw%2fService%2fOpenData%2fFromM%2fAgricultureiRiceFailure.aspx";
        RiceJsonThread rice=new RiceJsonThread(path);
        
        FutureTask<String> task=new FutureTask<>(rice);
        
        new Thread(task).start();
        
        try {
            String json=task.get();
            System.out.println(json);
        } catch (Exception e) {
        }
    }
}
