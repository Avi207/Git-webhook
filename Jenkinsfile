pipeline {
    agent any
    tools {
        maven 'maven3.8.6'
    }
    stages {
        stage ('Clone Code from Repository') {
            steps {                
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/arnabcs10/helloworld.git']]])
            }
        }
        stage ('Build') {
            steps {
                echo 'Running Build phase...'  
                echo 'java --version'
            }
        }
        stage ('Test') {
            steps {
                echo 'Running Test phase...'         
            }
        }        
        stage ('Deploy') {          
            steps {                
                echo 'Deployed...'
            }
        }
        }
}