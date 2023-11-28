def docker(String IMAGE_NAME,String BUILD_ID,String dockercred){
                    // Assuming your Dockerfile is in the root directory of your project
                    def dockerImage = docker.build("${IMAGE_NAME}:${BUILD_ID}")

                    
                    docker.withRegistry('https://registry.hub.docker.com', dockercred) {
                        dockerImage.push()


                    }



  
}
