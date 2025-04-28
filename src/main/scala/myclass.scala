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


object vikram {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 5 by 1){
      for(j<-1 to i){
        print(j+" ")
      }
      println(" ")
    }

    for(i<-5 to 1 by -1){
      for(j<-i to 1 by -1){
        print(j+" ")
      }
      println(" ")
    }
  }
}