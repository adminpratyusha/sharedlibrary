def deploy(String SSHCONFIGNAME,String OUTPUTFILENAME){
  sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME ,
                        transfers: [sshTransfer(flatten: false, sourceFiles: OUTPUTFILENAME)])
                    ])

}
