# mongoms

## Overview
A Simple implementation of a springboot service presenting a simple logging api to a mongodb.

## run

runmongo script starts up the db container, a linked mongoexpress image to manage it ,the mongoms microservice with the api for loggin to mongo and a few osfamicroservice instances to exercise it.
Note that you need docker-compose installed.

    @RequestMapping(method = RequestMethod.GET, value = "/logentry") - returns all log entries

    @RequestMapping(method = RequestMethod.GET, value = "/logentry/last5") - returns the last 5 log entries

    @GetMapping("/logentry/{service}/{data}/{time2live}/{result}") - writes a new log entry

    @RequestMapping(method = RequestMethod.DELETE, value = "/logentry/{id}") - deletes log entry with supplied id

    @RequestMapping(method = RequestMethod.GET, value = "/logentry/{id}") - returns the log entry with supplied id

    @RequestMapping(method = RequestMethod.POST, value = "/logentry") - updates log entry


mongo express on 8081

mongo ms on 8089
