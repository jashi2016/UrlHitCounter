package com.kiran.urlHitCounter.Service;

import com.kiran.urlHitCounter.Model.User;
import org.springframework.stereotype.Service;

@Service
public class urlHitImpl implements urlHit{

    static int hitCount=0;
    @Override
    public String getHitCount() {
        hitCount=hitCount+1;
        return "Visitors : "+hitCount;
    }
}
