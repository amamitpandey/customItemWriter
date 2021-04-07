node () {
    stage ('step1') {
        echo get_current_time_date()
    }
    stage ('step2') {
        sh "cd /Users/pandey/Downloads/gradle-6.8.3/bin"
        sh "/Users/pandey/Downloads/gradle-6.8.3/bin/gradle"
        sh "gradle --version"
        sh "gradle build"
    }
}

def get_current_time_date() {
    return 'hoge'
}