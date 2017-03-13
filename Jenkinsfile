node {
    stage('Dev') {
        concurrency = 1
        sh "echo DEV"
        input message: 'Promote  to QA?', ok: 'Promote'
    }
    stage('QA') {
        concurrency = 1
        sh "echo QA"
        input message: 'Promote  to Staging?', ok: 'Promote'
    }
    stage('Staging') {
        concurrency = 1
        sh "echo Staging"
        input message: 'Promote  to Production?', ok: 'Promote'
    }
    stage('Production') {
        concurrency = 1
        sh "echo Production"
    }
}