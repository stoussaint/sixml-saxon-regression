# sixml-saxon-regression
A simple project to provide information about a spring-integration-xml regression with Saxon.

Compile the project with :

`./gradlew build`

The build is successfully completed with the preset versions.

Replace the **org.springframework.integration:spring-integration-xml:4.3.18.RELEASE** dependency by **org.springframework.integration:spring-integration-xml:4.3.19.RELEASE**

Compile the project once again :

The build failed with the _Unknown configuration property http://javax.xml.XMLConstants/property/accessExternalDTD_ related exception.

The regression seems to be related to **XsltPayloadTransformer** now settings the http://javax.xml.XMLConstants/property/accessExternalDTD property that Saxon does not handle.

Note that if Saxon is removed from the classpath, the project build is also successfully completed (of course it can't be a solution).
