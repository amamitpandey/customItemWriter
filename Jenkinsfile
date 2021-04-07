node () {
    stage ('step1') {
        echo get_current_time_date()
    }
    stage ('step2') {
    	// Get some code from a GitHub repository
15
        git 'https://github.com/amamitpandey/customItemWriter.git'
        
        sh "gradle --version"
        sh "gradle build"
    }
}

def get_current_time_date() {
    return 'hoge'
}