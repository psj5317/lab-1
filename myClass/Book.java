package myClass;

/**
 * 책에 대한 정보를 담고있는 클래스
 *
 * 
 * @author (2023320029 정지후, 2023320010 박성준, 2023320012 강성하)
 * @version (2026/09/30)
 */
public class Book extends DB_Element
{
    private String author; 
    private String bookID; 
    private String publisher; 
    private String title;
    private int year;

    /**
     * Book 클래스의 객체 생성자
     */
    public Book(String bookID, String title, String author, 
    String publisher, int year)
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    /**
     * 객체의 bookID를 리턴하는 메소드
     *
     * @param 없음
     * @return  현재 객체의 bookID 리턴 
     */
    public String getID(){
        return bookID;        
    }  

    /**
     * toString 메소드 오버라이딩
     *
     * @param  없음
     * @return   책 객체에 대한 정보 리턴
     */
    public String toString(){ 
        return "(" + bookID + ") " + title + ", " + author + ", " + publisher + ", " + year;
    }
}   
