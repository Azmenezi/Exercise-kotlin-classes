fun main() {
    val book = Book("Harry Potter", "Homoud Alghanim", 2000)

    book.getBookInfo()
}

class Book(var title: String, var author: String, var yearPublished: Int) {
    fun getBookInfo() {
        println("$title by $author ($yearPublished)")
    }
}