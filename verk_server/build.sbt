name := """verk_server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  evolutions,
  javaJdbc,
  cache,
  javaWs
)

libraryDependencies ++= Seq(
    "com.h2database" % "h2" % "1.4.191",
    "org.hibernate" % "hibernate" % "3.2.0.cr5",
    "mysql" % "mysql-connector-java" % "5.1.38"
)

