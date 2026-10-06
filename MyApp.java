import DataBase.LibDB;
import myClass.*;
import java.util.*; 
/**
 * Book, User 클래스의 객체를 생성하고 대출 현황을 저장하고 출력하는 클래스
 *
 * @author (2023320029 정지후, 2023320010 박성준, 2023320012 강성하)
 * @version (2026/09/30)
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
        
        System.out.println("----- 이용자 목록 출력 ------");
        printDB(userDB);
        
        bookDB.addElement(new Book("B01", "Java Programming", "홍길동", "ABC", 2000));
        bookDB.addElement(new Book("B02", "Software Analysis and Design", "profsHwang", "SMU", 2023));
        bookDB.addElement(new Book("B03", "명품 자바프로그래밍", "황기태", "생능출판", 2025));
        bookDB.addElement(new Book("B04", "소프트웨어테스트", "profsHwang", "SMU", 2024));
        
        System.out.println("\n----- 책 목록 출력 -----");
        printDB(bookDB);
        
        loanDB.put(userDB.findElement("2025320001"), bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2024320002"), bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2023320003"), bookDB.findElement("B04"));
        
        System.out.println("\n----- 대출현황 -----");  
        printLoanList(loanDB); 
        System.out.println("-------------------");
        
    
    }

    /**
     * LibDB<T>의 요소를 출력하는 메소드
     *
     * @param  db  Book또는 User 객체가 들어간 컬렉션
     * @return    컬렉션에 들어있는 모든 요소 출력
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {
        db.printAllElement();
    }

    /**
     * 대출 현황을 출력하는 메소드
     *
     * @param  loanDB 대출 현황을 담고있는 HashMap
     * @return    없음
     */
    public static void printLoanList(HashMap<User,Book> loanDB)
    { 
        Set<User> keySet = loanDB.keySet();  
        for(User k: keySet){  
             loanDB.get(k); 
             System.out.println(k + " ===> " + loanDB.get(k));
            
        }  
       
    }


}