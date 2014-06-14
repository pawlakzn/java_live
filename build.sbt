import play.Project._

name := "live"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean)

playJavaSettings
