#!/bin/bash

netstat -tlnp|grep 8005|awk '{print $7}'|sed 's/\/java//g'|xargs -r kill -9
nohup /home/app/jdk1.8.0_131/bin/java -jar /home/app/push-service-dev/push-service-0.0.1-SNAPSHOT.jar --spring.config.location=/home/app/push-service-dev/bootstrap.yml > push-service-`date +%Y-%m-%d_%H:%M:%S`.log &