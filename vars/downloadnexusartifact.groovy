def download(String OUTPUTFILENAME,String NEXUS_USERNAME,String NEXUS_PASSWORD,String NEXUS_URL,String GROUP_ID,String VERSION,String ARTIFACT_NAME){

    def artifact_version = "${ARTIFACT_NAME}-${VERSION}.war"
    sh "curl -v -o ${OUTPUTFILENAME} -u ${NEXUS_USERNAME}:${NEXUS_PASSWORD} ${NEXUS_URL}/${GROUP_ID}/${VERSION}/${artifact_version}"

}
