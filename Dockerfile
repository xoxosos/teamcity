FROM java:8
# 作者
MAINTAINER LinRenJie <xoxosos666@gmail.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp 
# 将jar包添加到容器中并更名为meeting.jar
COPY *.jar /teamcity.jar 
CMD ["--server.port=8081"]
EXPOSE 8081
# 运行jar包
ENTRYPOINT ["java","-jar","/teamcity.jar"]