package com;


import org.apache.log4j.Logger;

/**
 * Created by amirkhani on 2/3/2019.
 */

public class MainBean {
    final static Logger logger = Logger.getLogger(MainBean.class);
    private SampleService bbbpar;
    private String ccc = "gholi";
    private SampleServiceImpl service;
    private ApplicationConfig applicationConfig;

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public void setService(SampleServiceImpl service) {
        this.service = service;
        Logger logger = Logger.getLogger(MainBean.class);

    }

    public SampleServiceImpl getService() {
        return service;
    }

    public String toDoo(){
        logger.info("ghoooooooooooo-----------------------------------------");
       String temp = service.doIt();
       return temp;
    }

    public void doo(){
        logger.info("Doooooooooooo-----------------------------------------"+applicationConfig.getTimer());
        ccc = "done!";
    }


    public void setApplicationConfig(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }
}
