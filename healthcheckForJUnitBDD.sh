#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# BROWSER
# MODULE
	
#java -cp selenium-docker-tests.jar;selenium-docker.jar;libs/* -Dcucumber.options=classpath:features org.junit.runner.JUnitCore com.runner.JUnitTestRunner

echo "Checking if hub is ready - $HUB_HOST"

while [[ "$( curl -s http://$SE_EVENT_BUS_HOST:4444/wd/hub/status | jq -r .value.ready )" != "true" ]]; do
	sleep 1
done

# start the java command
java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* \
    -DSE_EVENT_BUS_HOST=$SE_EVENT_BUS_HOST \
    -DBROWSER=$BROWSER \
    -Dcucumber.options="$CUCUMBER_OPTIONS" \
    org.junit.runner.JUnitCore com.runner.JUnitTestRunner
	
