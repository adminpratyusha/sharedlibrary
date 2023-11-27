    def sonarscanner(String projectName, String projectKey,String projectV){
                                sh """${scannerHome}/bin/sonar-scanner \
                                -Dsonar.projectKey=${projectKey} \
                                -Dsonar.projectName=${projectName} \
                                -Dsonar.projectVersion=1.0 \
                                -Dsonar.sources=src\
                                -Dsonar.java.binaries=target/test-classes/com/visualpathit/account/controllerTest/ \
                                -Dsonar.junit.reportsPath=target/surefire-reports/ \
                                 -Dsonar.jacoco.reportsPath=target/jacoco.exec \
                                 -Dsonar.java.checkstyle.reportPaths=target/checkstyle-result.xml"""
   }
