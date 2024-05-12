def call(Map config = [:]) {
    withSonarQubeEnv(config.sonarServer) {
        withEnv( ["PATH+MAVEN=${tool config.maven}/bin"] ) {
            sh 'mvn clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184:sonar'
        }
    }
}