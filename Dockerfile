FROM isuper/java-oracle

MAINTAINER Vlad Khazin <vladimir.khazin@icssolutions.ca>

ADD ./target/universal/play-framework-docker.tgz /usr/src/play

CMD ["/usr/src/play/play-framework-docker/bin/play-framework-docker"]