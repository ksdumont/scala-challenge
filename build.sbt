ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"


lazy val root = (project in file("."))
  .settings(
    name := "scala-challenge",
    assembly / assemblyJarName := "q01.jar"
  )

libraryDependencies += "com.github.scopt" %% "scopt" % "4.0.1"

