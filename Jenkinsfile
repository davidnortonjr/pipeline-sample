node {
    stage('Dev') {
        sh "echo DEV"
        input message: 'Promote  to QA?', ok: 'Promote'
    }
    stage('QA') {
        sh "echo QA"
        input message: 'Promote  to Staging?', ok: 'Promote'
    }
    stage('Staging') {
        sh "echo Staging"
        input message: 'Promote  to Production?', ok: 'Promote'
    }
    stage('Production') {
        sh "echo Production"
    }
}