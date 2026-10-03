import DataBase.LibDB;
import myClass.*;
import java.util.HashMap;
/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        LibDB<User> userDB = new LibDB<User>();
        LibDB<Book> bookDB = new LibDB<Book>();
        HashMap<User, Book> loanDB  = new HashMap<>();
        
        userDB.addElement(new User(2025320001, "Kim"));
        userDB.addElement(new User(2024320002, "Lee"));
        userDB.addElement(new User(2023320003, "Park"));
        
        bookDB.addElement(new Book("B01", "Java Programming", "홍길동", "ABC", 2000));
        bookDB.addElement(new Book("B02", "Software Analysis and Design", "profsHwang", "SMU", 2023));
        bookDB.addElement(new Book("B03", "명품 자바프로그래밍", "황기태", "생능출판", 2025));
        bookDB.addElement(new Book("B04", "소프트웨어테스트", "profsHwang", "SMU", 2024));
        
        loanDB.put(userDB.findElement("2025320001"), bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2024320002"), bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2023320003"), bookDB.findElement("B04"));
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {

    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static void printLoanList(HashMap<User,Book> loanDB)
    {
        
    }


}