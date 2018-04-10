pipeline {
    agent any

    parameters {
         string(name: 'tomcat_dev', defaultValue: '107.22.24.187', description: 'Staging Server')
    }

    triggers {
         pollSCM('* * * * *')
     }

stages{
        stage('Build'){
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }

        stage ('Deployments'){
            
                stage ('Deploy to Staging'){
                    steps {
                        bat "scp -r C:/Users/akkot/Devops/maven_project.pem **/target/*.war ec2-user@${params.tomcat_dev}:/var/lib/tomcat8/webapps"
                    }
                }
            }
       }
    }
}