package scope

class ClosureOtherScope {
  def doTask(function: () => String): String = {
    function()
  }
}
