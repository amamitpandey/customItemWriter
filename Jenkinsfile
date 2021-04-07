node () {
	agent any
    triggers {
        pollSCM '* * * * *'
    }
    stage ('step1') {
        echo get_current_time_date()
    }
    stage ('step2') {
        sh "gradle --version"
        sh "gradle build"
    }
}

def get_current_time_date() {
    return 'hoge'
}