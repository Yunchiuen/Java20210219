package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoService {
    static Random r = new Random();
    public static Set<Integer> get539() {
        Set<Integer> letto = new LinkedHashSet<>();
        
        while (letto.size() < 5) {
            letto.add(r.nextInt(39) + 1);
        }
        return letto;
    }
    
    public static List<Integer> get4Stars() {
        List<Integer> lotto=new ArrayList<>();
        for(int i=0;i<4;i++){
            lotto.add(r.nextInt(10));//0~9
        }
        return lotto;
    }
}
