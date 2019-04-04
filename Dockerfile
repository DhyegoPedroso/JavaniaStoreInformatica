FROM   phusion / baseimage: 0.9.17

  Nome do Autor MAINTAINER <author@email.com>

RUN echo "deb http://archive.ubuntu.com/ubuntu universo principal" > /etc/apt/sources.list

RUN atualização do apt-get -y

RUN DEBIAN_FRONTEND = não-interativo apt-get install -y -q python-software-propriedades software-propriedades-comum

ENV JAVA_VER 8
ENV JAVA_HOME / usr / lib / jvm / java-8-oracle

RUN echo 'deb http://ppa.launchpad.net/webupd8team/java/ubuntu principal confiável' >> /etc/apt/sources.list && \
    eco 'deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu principal confiável' >> /etc/apt/sources.list && \
    apt-key adv --keyserver keyservidor.ubuntu.com --recv-keys C2518248EEA14886 && \
    apt-get update && \
    echo oracle-java $ {JAVA_VER} -instalador compartilhado / aceito-oracle-license-v1-1 select true | sudo / usr / bin / debconf-conjunto-seleções && \
    apt-get install -y --force-yes --no-install-recomenda o oracle-java $ {JAVA_VER} -installer oracle-java $ {JAVA_VER} -set-default && \
    apt-get clean && \
    rm -rf / var / cache / oracle-jdk $ {JAVA_VER} -instalador

RUN update-java-alternatives -s java-8-oracle

RUN echo "exportar JAVA_HOME = / usr / lib / jvm / java-8-oracle" >> ~ / .bashrc

RUN apt-get clean &&rm -rf / var / lib / apt / lists / * / tmp / * / var / tmp / *

CMD [ "/ sbin / my_init" ]
