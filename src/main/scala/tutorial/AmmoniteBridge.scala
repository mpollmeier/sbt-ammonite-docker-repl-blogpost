package tutorial

object AmmoniteBridge extends App {
  ammonite.Main(
    predefCode = """repl.prompt() = "cpgql> "
                    import tutorial._""",
    welcomeBanner = Some("Welcome to the CPG REPL - what would you like to query today? ;)"),
    remoteLogging = false
  ).run()
}
