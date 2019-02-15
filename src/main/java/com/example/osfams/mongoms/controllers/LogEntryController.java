package com.example.osfams.mongoms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.osfams.mongoms.models.LogEntry;
import com.example.osfams.mongoms.repositories.LogEntryRepository;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LogEntryController {

    @Autowired
    LogEntryRepository logEntryRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/logentry")
    public Iterable<LogEntry> logEntry() {
        return logEntryRepo.findAll();
    }
    
    @GetMapping("/logentry/{service}/{data}/{time2live}")
    public String save(@PathVariable("service") String service,
                       @PathVariable("data") String data,
                       @PathVariable("time2live") String time2live){
        
        LogEntry le = new LogEntry();
        le.setData(data);
        le.setService(service);
        le.setTime2Live(Integer.parseInt(time2live));
        
        logEntryRepo.save(le);
        
        return "saved";
        
    }

    @RequestMapping(method = RequestMethod.POST, value = "/logentry")
    public String save(@RequestBody LogEntry product) {
        logEntryRepo.save(product);

        return product.getId();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/logentry/{id}")
    public LogEntry show(@PathVariable String id) {
        Optional leo = logEntryRepo.findById(id);

        if (leo.isPresent()) {
            return (LogEntry) leo.get();
        }

        return new LogEntry();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/logentry/{id}")
    public LogEntry update(@PathVariable String id, @RequestBody LogEntry logentry) {
        LogEntry loge = new LogEntry();

        Optional leo = logEntryRepo.findById(id);
        if (leo.isPresent()) {
            loge = (LogEntry) leo.get();
            if (logentry.getEventTime() != null) {
                loge.setEventTime(logentry.getEventTime());
            }
            if (logentry.getService() != null) {
                loge.setService(logentry.getService());
            }
            loge.setTime2Live(logentry.getTime2Live());
            if (logentry.getData() != null) {
                loge.setData(logentry.getData());
            }
            logEntryRepo.save(loge);
        }
        return loge;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/logentry/{id}")
    public String delete(@PathVariable String id) {
        String returnMessage = "logeEntry not found";
        Optional leo = logEntryRepo.findById(id);
        if (leo.isPresent()) {
            LogEntry logentry = (LogEntry) leo.get();
            logEntryRepo.delete(logentry);
            returnMessage = "LogEntry deleted";
        }

        return returnMessage;
    }
}
