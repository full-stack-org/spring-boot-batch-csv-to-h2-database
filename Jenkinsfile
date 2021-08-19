pipeline {
    agent any

    triggers {
        pollSCM('*/5 * * * *')
    }
    stages {
        stage('Compile') {
            steps {
                gradlew('clean', 'classes')
            }
        }
        stage('Unit Tests') {
            steps {
                gradlew('test')
            }
                    }
	}
	
}

def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}