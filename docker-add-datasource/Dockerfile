FROM airhacks/wildfly

ADD mysql-connector-java-5.1.31-bin.jar ${INSTALL_DIR}
ADD execute.sh ${INSTALL_DIR}

ENV MYSQL_HOST localhost
ENV MYSQL_PORT 3306
ENV DB_PORT_3306_TCP_ADDR 3306
ENV DB_PORT_3306_TCP_PORT 3306
ENV MYSQL_URI localhost
ENV MYSQL_DB sample

RUN "${INSTALL_DIR}/execute.sh"
RUN rm -rf ${WILDFLY_HOME}/standalone/configuration/standalone_xml_history/current
