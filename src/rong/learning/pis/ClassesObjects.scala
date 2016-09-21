/**
  * Created by 宋荣 on 2016/9/22.
  */

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = {
    //b+=1 -- This won't be compile as function parameter is val/immutable
    sum += b
  }
  def add2(b:Byte):Unit = sum+=b;

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
  //Check the same line styple
  def checksum2():int = ~(sum & 0xFF) + 1

  def apply() = sum=1
}

