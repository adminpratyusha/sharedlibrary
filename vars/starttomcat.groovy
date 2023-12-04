def start(String SSHCONFIGNAME)
{
              
                    sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                        execCommand: "sudo cp -rf /home/ubuntu/* /var/lib/tomcat9/webapps && rm -rf /home/ubuntu/* && sudo systemctl start tomcat9",
                                        execTimeout: 120000
                                    )
                                ])
                    ])






  
}
