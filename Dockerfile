
FROM ubuntu:20.04

# Requirements
RUN apt-get update -y
RUN apt-get install -y software-properties-common
RUN apt-get update -y
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y git 
RUN apt-get install -y build-essential 
RUN apt-get install -y subversion
RUN apt-get install -y perl
RUN apt-get install -y curl
RUN apt-get install -y unzip
RUN apt-get install -y cpanminus
RUN apt-get install -y make
RUN apt-get install -y maven
RUN apt-get install -y sudo
RUN apt-get install -y wget
RUN apt-get install -y vim
RUN apt-get install -y bc
RUN apt-get install -y python3
RUN apt-get install -y python3-pip
RUN pip3 install pandas==1.2.4

# Java version
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-arm64
#ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

# Timezone
ENV TZ=America/Los_Angeles
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone



# Defects4J
WORKDIR /
COPY defects4j /defects4j

WORKDIR /defects4j
RUN cpanm --installdeps .
RUN ./init.sh

ENV PATH="/defects4j/framework/bin:${JAVA_HOME}/bin:${PATH}"
ENV D4J="/defects4j"
ENV DEFECTS4J_HOME="/defects4j"

COPY TBar /TBar/
COPY AVATAR /AVATAR/
COPY gzoltar /gzoltar/
COPY SimFix /SimFix/
COPY gzoltar /gzoltar/
COPY Repilot /Repilot/
COPY AlphaRepair /AlphaRepair/
COPY RAP-Gen /Rap-Gen/

COPY tool /tool/
COPY script /script/
COPY pom_for_evosuite /pom_for_evosuite/
COPY SuspiciousCodePositions /SuspiciousCodePositions/
COPY fail_test /fail_test/

WORKDIR /script/

