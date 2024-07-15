import scala.collection.mutable.Set

object practical_5_2 {
   
  case class Book(title: String, author: String, isbn: String)
  
  val book1 = Book("Madolduwa", "Martin Wikramasinghe", "978955564007")
  val book2 = Book("Baddegama", "A.P. Gunarathne", "00548090050")
  val book3 = Book("Hunuwataya", "Henry", "9556580832")
  
  val library: Set[Book] = Set(book1, book2, book3)
  
  def addBook(book: Book): Unit = {
    library += book
  }
  
  def removeBook(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) => library -= book
      case None =>
    }
  }
  
  def containsBook(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }
  
  def displayLibrary(): Unit = {
    println("Library's Book Collection:")
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))
  }
  
  def searchBookByTitle(title: String): Unit = {
    val foundBooks = library.filter(_.title.toLowerCase == title.toLowerCase)
    if (foundBooks.nonEmpty) {
      println(s"Found ${foundBooks.size} book(s) with title '$title':")
      foundBooks.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))
    } else {
      println(s"No books found with title '$title'.")
    }
  }
  
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"${book.title} (ISBN: ${book.isbn})"))
    } else {
      println(s"No books found by $author.")
    }
  }
  
  def main(args: Array[String]): Unit = {
    displayLibrary()
  }
}
