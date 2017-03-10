name := "scala-bootcamp"

version := "1.0"

scalaVersion := "2.12.1"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version := "0.1.0-SNAPSHOT"
    )),
    libraryDependencies += scalaTest % Test
  )
