object Tuesday_Exercise_2 extends App {



  var ArraySorted = Array.range(1, 1000000)
  ArraySorted(1000)=2000
  def arrayCheck2(size:Int):Unit={
    for(i<- 0 until size-1){
      if(ArraySorted(i)==ArraySorted(i+1)) println(s"There is a duplicate of value ${ArraySorted(i)}")
    }
  }
  arrayCheck2(ArraySorted.length)
}

