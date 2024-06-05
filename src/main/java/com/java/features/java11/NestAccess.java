package com.java.features.java11;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NestAccess {

    private String name = "Java";

    public static void main(String[] args) {
        var n = new NestAccess();
        n.logName();
    }

    private void logName(){
        log.info("logging NestAccess logName");
        ClassOne c = new ClassOne();
        c.logName();
        ClassTwo t = new ClassTwo();
        t.logName();
    }

    public class ClassOne {
        private String company = "Tech";
        private void logName() {
            log.info("logging ClassOne logName");
            log.info("{}", name);
        }
    }

    public class ClassTwo {
        private void logName() {
            log.info("logging ClassOne logName");
            log.info("{}", name);
            ClassOne o = new ClassOne();
            log.info("{}", o.company);
        }
    }
}
