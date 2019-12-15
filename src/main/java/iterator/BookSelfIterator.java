package iterator;

/**
 * @author 穆繁强
 * @date 2019/12/15
 */
public class BookSelfIterator implements Iterator {
    private BookSelf bookSelf;
    private int index;

    public BookSelfIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookSelf.getLength() ? true : false;
    }

    @Override
    public Object next() {
        Book book = bookSelf.getBookAt(index);
        index++;
        return book;
    }
}
