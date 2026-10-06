package DataBase;
import myClass.DB_Element;
import java.util.ArrayList;

/**
 * Book, User의 객체를 담기 위한 제네릭 클래스
 *
 * @author (2023320029 정지후, 2023320010 박성준, 2023320012 강성하)
 * @version (2026/09/30)
 */
public class LibDB<T>
{
    private ArrayList<T> db;

    /**
     * LibDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        db = new ArrayList<>();
    }

    /**
     * 컬렉션의 요소를 추가하는 메서드
     *
     * @param  item  Book또는 User 클래스의 객체
     * @return    없음
     */
    public void addElement(T item)
    {
        db.add(item);
    }

    /**
     * 객체의 ID가 매개변수 id와 같다면 그 id를 가지고 있는 객체를 리턴해주는 메소드
     *
     * @param  id  찾을 객체의 id
     * @return   getID()를 통한 객체의 ID와 매개변수 id가 같은 객체 리턴
     */
    public T findElement(String id)
    {
        for(int i = 0;i < db.size();i++){
            DB_Element item = (DB_Element) db.get(i);
            if(item.getID().equals(id)){
                return db.get(i);
            }
        }
        return null;
    }
    
    /**
     * 컬렉션안에 들어있는 요소들을 전부 출력하는 메소드
     * 
     * @param 없음
     * @return 없음
     * 
     */
    public void printAllElement(){
        for(int i = 0;i < db.size();i++){
            System.out.println(db.get(i));
        }
    }

}