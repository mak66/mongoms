# mongoms

## Overview

## run

runmongo script starts up the db container a linked mongoexpress image to manage it and the mongoms microservice with the api for loggin to mongo.
Note that you need docker-compose installedy

@RequestMapping(method = RequestMethod.GET, value = "/logentry")
@GetMapping("/logentry/{service}/{data}/{time2live}/{result}")
@RequestMapping(method = RequestMethod.DELETE, value = "/logentry/{id}")
@RequestMapping(method = RequestMethod.PUT, value = "/logentry/{id}")
@RequestMapping(method = RequestMethod.GET, value = "/logentry/{id}")
@RequestMapping(method = RequestMethod.POST, value = "/logentry")

mongo express on 8081
mongo ms on 8089
