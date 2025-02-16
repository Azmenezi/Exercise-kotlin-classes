fun main() {
    val book = Book("Harry Potter", "Homoud Alghanim", 2000, "action")

    book.getBookInfo()
}

class Book(var title: String, var author: String, var yearPublished: Int, var genre: String) {
    fun getBookInfo() {
        println("$title by $author ($yearPublished) genre: $genre")
    }
}