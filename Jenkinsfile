pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps { 
                echo 'Running Build Phase..' 
            }
        }
        stage('Test'){
            steps {
                echo 'Running Test Phase..' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'Running Deploy Phase..' 
            }
        }
    }
}
