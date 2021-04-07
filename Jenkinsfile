node () {
    stage ('step1') {
        echo get_current_time_date()
    }
    stage ('step2') {
        sh "cd ${GRADLE_HOME}"
        sh "gradle --version"
    }
}

def get_current_time_date() {
    return 'hoge'
}