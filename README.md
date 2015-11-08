

## Teknologinoter

### Spring Security

http://kielczewski.eu/2014/12/spring-boot-security-application/

http://stackoverflow.com/questions/25692735/spring-security-with-thymeleaf-simple-example

https://spring.io/blog/2015/01/12/spring-and-angular-js-a-secure-single-page-application

#### ...og Active Directory

http://stackoverflow.com/questions/26791654/partialresultexception-when-authenticating-with-spring-security-and-javaconfig/26872236#26872236


### Generelt good stuff

http://blog.codeleak.pl/2014/04/how-to-spring-boot-and-thymeleaf-with-maven.html

### Ember tips'n'tricks

Remember to set() and get() properties on Ember objects
See (http://guides.emberjs.com/v2.1.0/object-model/classes-and-instances/#toc_accessing-object-properties)

### JSON API
http://katharsis.io/
http://projects.spring.io/spring-data-rest/

### Build pipeline

http://www.slideshare.net/SpringCentral/cd-pipeline-gradlejenkins

### Bintray

https://github.com/bintray/gradle-bintray-plugin

    bintray {
        user = 'bintray_user'
        key = 'bintray_api_key'
        pkg {
            repo = 'generic'
            name = 'gradle-project'
            userOrg = 'bintray_user'
            licenses = ['Apache-2.0']
            vcsUrl = 'https://github.com/bintray/gradle-bintray-plugin.git'

            version {
                    name = '1.0-Final'
                    desc = 'Gradle Bintray Plugin 1.0 final'
                    released  = new Date()
                    vcsTag = '1.3.0'
                    attributes = ['gradle-plugin': 'com.use.less:com.use.less.gradle:gradle-useless-plugin']
            }
        }
    }

### Spring Assets

https://spring.io/blog/2014/07/24/spring-framework-4-1-handling-static-web-resources

also see https://github.com/bclozel/spring-resource-handling for seperation of client and server in seperate projects
