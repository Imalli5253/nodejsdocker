job('NodeJSDockerBuild'){
    scm{
        git('https://github.com/Imalli5253/nodejsdocker.git')
    }
    triggers{
     scm('H/5 * * * *')
    }
    wrappers{
        nodejs('nodejs')
    }
 steps{
       dockerBuildAndPublish {
            repositoryName('nagamalli/dockerpublish')
            tag('${GIT_REVISION,length=9}')
            registryCredentials('dockerhub')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
 }

}