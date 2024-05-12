def call() {
    sh 'mvn clean verify sonar:sonar'
}