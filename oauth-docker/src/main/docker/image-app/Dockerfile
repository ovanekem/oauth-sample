FROM jboss/wildfly:8.2.0.Final
ADD oauth-app1.war /opt/jboss/wildfly/standalone/deployments/
ADD oauth-app2.war /opt/jboss/wildfly/standalone/deployments/
ADD oauth-client.war /opt/jboss/wildfly/standalone/deployments/
ADD oauth-client2.war /opt/jboss/wildfly/standalone/deployments/
ADD oauth-server.war /opt/jboss/wildfly/standalone/deployments/
RUN /opt/jboss/wildfly/bin/add-user.sh admin knoware --silent

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "--debug", "8787", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]