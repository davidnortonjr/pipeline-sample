['deployment-pipeline'].each { String projectName ->
  pipelineJob(projectName) {
    definition {
      cps {
        script("""
        node {
            stage('Dev') {
                milestone 1
                sh "echo DEV"
                input message: 'Promote  to QA?', ok: 'Promote'
            }
            stage('QA') {
                milestone 2
                sh "echo QA"
                input message: 'Promote  to Staging?', ok: 'Promote'
            }
            stage('Staging') {
                milestone 3
                sh "echo Staging"
                input message: 'Promote  to Production?', ok: 'Promote'
            }
            stage('Production') {
                milestone 4
                concurrency = 1
                sh "echo Production"
            }
        }
      """.stripIndent())
      }
    }
  }
}