#$1 = isClearCash

docker stop apr
docker rm apr
docker rmi apr

if [ "$1" = "1" ]; then
  docker builder prune -f
fi

docker build -t apr ../
docker run -it -d --name apr --volume=/Users/wakamatsu/Desktop/share:/share:rw apr
docker exec -it apr /bin/bash

