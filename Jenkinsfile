pipeline {
    agent any
  
    stages {
        stage('Test') {
            steps {
                bat "mvn -D clean test"
            }
  
            post {                
                 
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.               
                success {
                  publishHTML([
                              allowMissing: false, 
                              alwaysLinkToLastBuild: false, 
                              keepAll: false, 
                              reportDir: 'C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\MavenProject\\target\\Reports', 
                              reportFiles: '*.html', 
                              reportName: 'ExtentReport', 
                              reportTitles: '', 
                              useWrapperFileDirectly: true])
                }
            }
        }
    }
}