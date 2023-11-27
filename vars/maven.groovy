def build(){
                sh 'mvn clean install -DskipTests'
      }
def unittest(){
                  sh 'mvn test'
}
def integrationtest(){
                sh 'mvn verify -DskipUnitTests'

}
