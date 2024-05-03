
package ru.flibasta.server.books;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.flibasta.server.Books package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _DeleteBook_QNAME = new QName("http://service.booksserver.flibasta.ru/", "deleteBook");
    private static final QName _DeleteBookResponse_QNAME = new QName("http://service.booksserver.flibasta.ru/", "deleteBookResponse");
    private static final QName _GetAllBooks_QNAME = new QName("http://service.booksserver.flibasta.ru/", "getAllBooks");
    private static final QName _GetAllBooksResponse_QNAME = new QName("http://service.booksserver.flibasta.ru/", "getAllBooksResponse");
    private static final QName _GetBookById_QNAME = new QName("http://service.booksserver.flibasta.ru/", "getBookById");
    private static final QName _GetBookByIdResponse_QNAME = new QName("http://service.booksserver.flibasta.ru/", "getBookByIdResponse");
    private static final QName _GetBookByTitle_QNAME = new QName("http://service.booksserver.flibasta.ru/", "getBookByTitle");
    private static final QName _GetBookByTitleResponse_QNAME = new QName("http://service.booksserver.flibasta.ru/", "getBookByTitleResponse");
    private static final QName _SaveBook_QNAME = new QName("http://service.booksserver.flibasta.ru/", "saveBook");
    private static final QName _SaveBookResponse_QNAME = new QName("http://service.booksserver.flibasta.ru/", "saveBookResponse");
    private static final QName _UpdateBook_QNAME = new QName("http://service.booksserver.flibasta.ru/", "updateBook");
    private static final QName _UpdateBookResponse_QNAME = new QName("http://service.booksserver.flibasta.ru/", "updateBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.flibasta.server.Books
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     * @return
     *     the new instance of {@link DeleteBook }
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     * @return
     *     the new instance of {@link DeleteBookResponse }
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     * @return
     *     the new instance of {@link GetAllBooks }
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     * @return
     *     the new instance of {@link GetAllBooksResponse }
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetBookById }
     * 
     * @return
     *     the new instance of {@link GetBookById }
     */
    public GetBookById createGetBookById() {
        return new GetBookById();
    }

    /**
     * Create an instance of {@link GetBookByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetBookByIdResponse }
     */
    public GetBookByIdResponse createGetBookByIdResponse() {
        return new GetBookByIdResponse();
    }

    /**
     * Create an instance of {@link GetBookByTitle }
     * 
     * @return
     *     the new instance of {@link GetBookByTitle }
     */
    public GetBookByTitle createGetBookByTitle() {
        return new GetBookByTitle();
    }

    /**
     * Create an instance of {@link GetBookByTitleResponse }
     * 
     * @return
     *     the new instance of {@link GetBookByTitleResponse }
     */
    public GetBookByTitleResponse createGetBookByTitleResponse() {
        return new GetBookByTitleResponse();
    }

    /**
     * Create an instance of {@link SaveBook }
     * 
     * @return
     *     the new instance of {@link SaveBook }
     */
    public SaveBook createSaveBook() {
        return new SaveBook();
    }

    /**
     * Create an instance of {@link SaveBookResponse }
     * 
     * @return
     *     the new instance of {@link SaveBookResponse }
     */
    public SaveBookResponse createSaveBookResponse() {
        return new SaveBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     * @return
     *     the new instance of {@link UpdateBook }
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     * @return
     *     the new instance of {@link UpdateBookResponse }
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     * @return
     *     the new instance of {@link Book }
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Country }
     * 
     * @return
     *     the new instance of {@link Country }
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     * @return
     *     the new instance of {@link Genre }
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link Title }
     * 
     * @return
     *     the new instance of {@link Title }
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "getBookById")
    public JAXBElement<GetBookById> createGetBookById(GetBookById value) {
        return new JAXBElement<>(_GetBookById_QNAME, GetBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "getBookByIdResponse")
    public JAXBElement<GetBookByIdResponse> createGetBookByIdResponse(GetBookByIdResponse value) {
        return new JAXBElement<>(_GetBookByIdResponse_QNAME, GetBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "getBookByTitle")
    public JAXBElement<GetBookByTitle> createGetBookByTitle(GetBookByTitle value) {
        return new JAXBElement<>(_GetBookByTitle_QNAME, GetBookByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByTitleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "getBookByTitleResponse")
    public JAXBElement<GetBookByTitleResponse> createGetBookByTitleResponse(GetBookByTitleResponse value) {
        return new JAXBElement<>(_GetBookByTitleResponse_QNAME, GetBookByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "saveBook")
    public JAXBElement<SaveBook> createSaveBook(SaveBook value) {
        return new JAXBElement<>(_SaveBook_QNAME, SaveBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "saveBookResponse")
    public JAXBElement<SaveBookResponse> createSaveBookResponse(SaveBookResponse value) {
        return new JAXBElement<>(_SaveBookResponse_QNAME, SaveBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booksserver.flibasta.ru/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

}
