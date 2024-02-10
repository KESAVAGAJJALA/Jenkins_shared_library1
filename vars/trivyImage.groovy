def call() {
    sh 'trivy image gajjalakesava/youtube3:latest > trivyimage.txt'
}
