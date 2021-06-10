
pipeline {
   agent any
   environment {
    mavenHome = tool 'myMaven'
    PATH = "$mavenHome/bin:PATH"
   }
   stages{
        stage ('Clean'){
            steps{
                sh "mvn clean"
            }
        }
        stage ('Build'){
            steps{
                sh  "mvn compile"
            }
        }
        stage ('Test'){
            steps{
                echo("Test")
            }
        }

         stage ('Integration Test'){
              steps{
                 echo("Integration Test")
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