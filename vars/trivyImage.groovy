def call() {
    sh 'trivy image gajjalakesava/youtube:latest > trivyimage.txt'
}
