pipeline {
    agent any

    stages {
        stage('pull code where env') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '84a98eb0-0438-4c71-ac29-c7a925a8dffd', url: 'git@github.com:zyhanghang/AccountBackend.git']]])
            }
        }
        stage('build project') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('publish project') {
            steps {
                deploy adapters: [tomcat7(credentialsId: 'a5b35cc0-2325-4c64-b922-8940a4d8e67e', path: '', url: 'http://54.153.20.234:8080')], contextPath: null, war: 'target/*.war'
            }
        }
    }
}

