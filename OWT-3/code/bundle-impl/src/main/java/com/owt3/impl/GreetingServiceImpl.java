package com.owt3.impl;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;
import javax.inject.Singleton;

import com.owt3.api.GreetingService;
import com.owt3.lib.DemoUtil;

@Singleton
@OsgiServiceProvider(classes = {GreetingService.class})
public class GreetingServiceImpl implements GreetingService {
    public String sayHello(String name) {
        DemoUtil util = new DemoUtil();
        return "Hello " + util.upperCaseIt(name);
    }
}
