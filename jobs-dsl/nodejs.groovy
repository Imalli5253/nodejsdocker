job('NodeJsMyDemo')
{
    scm{
     git('https://github.com/Imalli5253/nodejsdocker.git')   
    }
    triggers{
        scm('H/5 * * * *')
    }
    wrappers{
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
