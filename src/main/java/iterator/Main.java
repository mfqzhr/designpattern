package iterator;

/**
 * @author 穆繁强
 * @date 2019/12/15
 */
public class Main {
    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf(4);
        bookSelf.appendBook(new Book("时间简史"));
        bookSelf.appendBook(new Book("水浒传"));
        bookSelf.appendBook(new Book("三国演义"));
        bookSelf.appendBook(new Book("笑傲江湖"));
        Iterator iterator = bookSelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
