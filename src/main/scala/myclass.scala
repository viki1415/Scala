object myclass {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 5 by 1){
      for(j<-1 to i){
        print(i+" ")
      }
      println(" ")
    }

    var num = 1
    for(i<-1 to 5){
      for(j<-1 to i){
        print(num+" ")
        num = num + 1
      }
      println(" ")
    }
  }
}

//Pattern 1: Star Pyramid (Odd Rows)

object CenteredTrianglePattern {
  def main(args: Array[String]): Unit = {
    val rows = 3

    for (i <- 1 to rows) {
      val spaces = " " * (rows - i)
      val stars = "*" * (2 * i - 1)
      println(spaces + stars)
    }
  }
}

//Pattern 2: Alternating Alphabet Triangle
object rightangletriangle {
  def main(args: Array[String]): Unit = {
    val num = 5
    var cnt = "A"
    for(i<-1 to num){
      if(i==1){
        cnt = "A " * i
        print(cnt)
      }
      else if(i==2){
        cnt = "b " * i
        print(cnt)
      }
      else if(i==3){
        cnt = "C " * i
        print(cnt)
      }
      else if(i==4){
        cnt = "d " * i
        print(cnt)
      }
      else{
        cnt = "E " * i
        print(cnt)
      }
      println(" ")
    }
  }
}

//Pattern 3: Odd Number in Odd Positions
object oddposition {
  def main(args: Array[String]): Unit = {
    var cnt = 1
    for(i<-1 to 5){
      var row = ""
      for(j<-1 to i){
        if(j%2==1){
          row = row + s"$cnt"
          cnt = cnt + 2
        }
        else{
          row = row + "_"
        }
      }
      println(row)
    }
  }
}


//Pattern 4: Hourglass Star Pattern

object HourglassPattern {
  def main(args: Array[String]): Unit = {

    val rows = 3

    for (i <- rows to 1 by -1) {
      val spaces = " " * (rows - i)
      val stars = "*" * (2 * i - 1)
      println(spaces + stars)
    }
    for (i <- 2 to rows) {
      val spaces = " " * (rows - i)
      val stars = "*" * (2 * i - 1)
      println(spaces + stars)
    }
  }
}

//Pattern 5: Hollow Diamond
object hollowdiamond {
  def main(args: Array[String]): Unit={
    val n = 3
    val totalrow = 2 * n - 1

    for(i<-1 to totalrow){
      val currentrow = if(i<=n) i else totalrow - i + 1
      val space = " " * (n - currentrow)

      if(currentrow == 1){
        println(space + "*")
      }
      else{
        val middlespace = " " * (2 * currentrow - 3)
        println(space + "*" + middlespace + "*")
      }
    }
  }
}


//1.Right-Angled Triangle
object righttriangle {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 5){
      for(j<-1 to i){
        print("*"+" ")
      }
      println(" ")
    }
  }
}


//2.Inverted Right-Angled Triangle
object inverttriangle {
  def main(args: Array[String]): Unit = {
    for(i<-5 to 1 by -1){
      for(j<-1 to i){
        print("*"+" ")
      }
      println(" ")
    }
  }
}

//3.Pyramid
object pyramid {
  def main(args: Array[String]): Unit={
    val row = 5
    for (i <- 1 to row) {
      val spaces = " " * (row - i)
      val stars = "*" * (2 * i - 1)
      println(spaces + stars)
    }
  }
}

