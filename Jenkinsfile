
pipeline {
//    agent any

    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
//             label 'my-defined-label'
//             args  '-v /tmp:/tmp'
        }
    }

   stages{
        stage ('Build'){
            steps{
                echo("Build")
                sh 'mvn --version'
            }
        }
        stage ('Test'){
            steps{
                echo("Test")
            }
        }
        stage ('Test Integration'){
            steps{
                echo("Test Integration")
            }
        }

   }

   post{
     always {
      echo("I ran always")
     }
     success {
      echo("I ran in success")
     }
     failure {
      echo("I ran in failure")
     }
   }
}