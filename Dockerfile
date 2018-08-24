FROM airhacks/glassfish
COPY ./target/jenkins-web-test.war ${DEPLOYMENT_DIR}
