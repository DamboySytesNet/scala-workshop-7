package scope

class ClosureOtherScope {
  def doTask(function: (Int) => String, day: Int): String = {
    function(day)
  }
}
