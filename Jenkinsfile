pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh 'mvn -B -DskipTests clean package'
                archiveArtifacts artifacts: 'dist/trainSchedule.zip'
            }
        }
    }
