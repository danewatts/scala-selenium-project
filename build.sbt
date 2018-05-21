name := "scala-selenium-project"

version := "1.0"

scalaVersion := "2.11.8"

val cucumberVersion = "1.2.5"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test",
  "org.scala-lang" % "scala-library" % "2.11.1",
  "info.cukes" % "cucumber-scala_2.11" % cucumberVersion,
  "info.cukes" % "cucumber-junit" % cucumberVersion,
  "info.cukes" % "cucumber-picocontainer" % cucumberVersion,
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "3.6.0" % "test")