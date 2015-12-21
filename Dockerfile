FROM isuper/java-oracle
MAINTAINER Vlad Khazin <vladimir.khazin@icssolutions.ca>
ADD ./target/universal/play-framework-docker-1.0.tgz /usr/src/play
CMD ["/usr/src/play/play-framework-docker-1.0/bin/play-framework-docker"]

# To create container
# docker run -t -p:80:9000 play-framework-docker