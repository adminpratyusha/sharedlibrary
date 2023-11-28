def docker(String IMAGE_NAME,String BUILD_ID,String DOCKER_CREDENTIALS_ID){
                    // Assuming your Dockerfile is in the root directory of your project
                    def dockerImage = docker.build("${IMAGE_NAME}:${BUILD_ID}")

                    
                    docker.withRegistry('https://registry.hub.docker.com', DOCKER_CREDENTIALS_ID) {
                        dockerImage.push()


                    }



  
}
