#TODO: Write stuff here

build container: 
./gradlew build buildDocker

run container:
docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -t _imageID_