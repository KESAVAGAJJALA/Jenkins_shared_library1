def call() {
    sh 'trivy image kesava/youtube:latest > trivyimage.txt'
}
