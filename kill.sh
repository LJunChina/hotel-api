#!/bin/bash

c_id=`docker ps |grep hotel|awk '{print $1}'`
echo "last contains id is:$c_id"
docker rm -f $c_id
sleep 3s
