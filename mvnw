#!/bin/sh
set -e
MAVEN_PROJECTBASEDIR=$(dirname "$0")
exec java -Dmaven.multiModuleProjectDirectory="$MAVEN_PROJECTBASEDIR" -cp "$MAVEN_PROJECTBASEDIR/.mvn/wrapper/maven-wrapper.jar" org.apache.maven.wrapper.MavenWrapperMain "$@"
