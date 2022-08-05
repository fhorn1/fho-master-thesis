#docker compose
go to /src/deploy/docker and do "./stack up"

#run native image
docker pull goafabric/person-service-quarkus:2.0.0-SNAPSHOT && docker run --name person-service-quarkus --rm -p50800:50800 goafabric/person-service-quarkus:2.0.0-SNAPSHOT

#run native image arm64
docker run --name person-service-quarkus --rm -p50800:50800 goafabric/person-service-quarkus-arm64v8:2.0.0-SNAPSHOT

