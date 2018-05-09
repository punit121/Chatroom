// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/punit/Downloads/play-java-chatroom-example/conf/routes
// @DATE:Wed May 09 17:07:50 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
