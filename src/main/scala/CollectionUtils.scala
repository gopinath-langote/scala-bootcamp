import scala.collection.mutable

case class CollectionUtils() {
  def reverse(list: List[Int]): List[Int] = {
    val buffer = mutable.Buffer.empty[Int]
    val iterator = list.iterator
    while (iterator.hasNext) {
      buffer += iterator.next()
    }
    buffer.toList.reverse
  }
}
