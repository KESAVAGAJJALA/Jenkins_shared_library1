def call() {
    sh 'trivy image gajjalakesava/youtube2:latest > trivyimage.txt'
}
