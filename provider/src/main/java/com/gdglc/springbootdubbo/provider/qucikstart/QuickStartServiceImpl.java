package com.gdglc.springbootdubbo.provider.qucikstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.gdglc.springbootdubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quickstaet-provider-message = " + message;
    }
}
