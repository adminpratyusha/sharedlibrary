def start(String SSHCONFIGNAME)
{
              
                    sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                        execCommand: "sudo cp -rf /home/ubuntu/* /opt/tomcat/webapps && rm -rf /home/ubuntu/* && sudo systemctl restart tomcat",
                                        execTimeout: 120000
                                    )
                                ])
                    ])






  
}
