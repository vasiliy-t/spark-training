# Apache Spark training cluster

Intended to be used with docker swarm mode.

```
docker stack deploy --compose-file docker-compose.yml spark
```

Connect to cluster:

```
spark-shell spark://DOCKER_HOST_IP:7077
```

Connect to cluster with additional JAR's:

```
spark-shell spark://DOCKER_HOST_IP:7077 --jars mysql-connector-java-5.1.42/mysql-connector-java-5.1.42-bin.jar
```
