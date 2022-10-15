#docker compose
go to /src/deploy/docker and do "./stack up"

#run jvm multi image
docker pull fho.master.thesis/person-service:2.0.1-SNAPSHOT && docker run --name person-service --rm -p50900:50900 fho.master.thesis/person-service:2.0.1-SNAPSHOT

#run native image
docker pull fho.master.thesis/person-service-native:2.0.1-SNAPSHOT && docker run --name person-service-native --rm -p50900:50900 fho.master.thesis/person-service-native:2.0.1-SNAPSHOT -Xmx64m

#force amd64
docker pull fho.master.thesis/person-service:2.0.1-SNAPSHOT && docker run --platform linux/amd64 --name person-service --rm -p50900:50900 fho.master.thesis/person-service:2.0.1-SNAPSHOT
