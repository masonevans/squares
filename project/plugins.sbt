logLevel := Level.Warn

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.1")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")

resolvers += "Flyway" at "http://flywaydb.org/repo"