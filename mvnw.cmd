@ECHO OFF
SET MAVEN_PROJECTBASEDIR=%~dp0
SET MAVEN_OPTS=%MAVEN_OPTS%
"%JAVA_HOME%\bin\java.exe" -Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR% -cp "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar" org.apache.maven.wrapper.MavenWrapperMain %*
