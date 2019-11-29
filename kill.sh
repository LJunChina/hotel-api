#!/bin/bash

c_id=`docker ps |grep hotel|awk '{print $1}'`
echo "last contains id is:$c_id"
