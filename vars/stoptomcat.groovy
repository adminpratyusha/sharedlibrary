def stop(String SSHCONFIGNAME){
   sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME , transfers: [
                                    sshTransfer(
                                        execCommand: "sudo systemctl stop tomcat9 && sudo rm -rf /var/lib/tomcat9/webapps/*",
                                        execTimeout: 120000
                                    )
                                ])
                    ])
}
