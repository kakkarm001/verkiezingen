name := """verk_server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  evolutions,
  javaJdbc,
  cache,
  javaWs,
  javaJpa
)

libraryDependencies ++= Seq(
    "com.h2database" % "h2" % "1.4.191",
    "mysql" % "mysql-connector-java" % "5.1.38",
    "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final" 
)

 
//Running Play in development mode while using JPA will work fine, but in order to deploy the application you will need to add this to your //build.sbt file.
//PlayKeys.externalizeResources := false
