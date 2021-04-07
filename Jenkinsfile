node () {
    stage ('step1') {
        echo get_current_time_date()
    }
    stage ('step2') {
        sh "gradle wrapper"
    }
}

def get_current_time_date() {
    return 'hoge'
}