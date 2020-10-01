FROM mysql:5.7
MAINTAINER yuanhang<zhangyuanhang94@gmail.com>

ENV MYSQL_ROOT_PASSWORD=root
RUN echo "character-set-server=utf8" >> /etc/mysql/mysql.conf.d/mysqld.cnf
RUN service mysql restart

EXPOSE 3306
CMD /bin/bash