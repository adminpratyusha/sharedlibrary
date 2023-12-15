def stop(String SSHCONFIGNAME){
   sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME , transfers: [
                                    sshTransfer(
                                        execCommand: "sudo systemctl stop tomcat && sudo rm -rf /opt/tomcat/webapps/*",
                                        execTimeout: 120000
                                    )
                                ])
                    ])
}
