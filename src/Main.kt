fun main() {
    val book = Book()
    book.title = "harry potter"
    book.author = "humoud alghanim"
    book.yearPublished = 2023

    println(book)
}

class Book {
    var title: String = ""
    var author: String = ""
    var yearPublished: Int = 1900
}