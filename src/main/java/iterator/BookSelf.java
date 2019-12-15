package iterator;

/**
 * @author 穆繁强
 * @date 2019/12/15
 */
public class BookSelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookSelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last++] = book;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookSelfIterator(this);
    }
}
