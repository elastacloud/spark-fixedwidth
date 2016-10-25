name := "spark-fixedwidth"

version := "1.2"

organization := "com.quartethealth"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.univocity" % "univocity-parsers" % "1.5.1",
  "org.apache.spark" %% "spark-sql" % "2.0.1" % "provided",
  "org.apache.spark" %% "spark-core" % "2.0.1" % "provided",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",

  "org.specs2" %% "specs2-core" % "3.7" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")
//test in assembly := {}