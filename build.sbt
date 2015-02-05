name := "squares"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "1.3.174"
)

seq(flywaySettings: _*)

flywayUrl := "jdbc:h2:file:target/foobar"

flywayUser := "SA"