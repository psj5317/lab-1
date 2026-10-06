package myClass;

/**
 * 이용자에 대한 정보를 담고있는 클래스
 *
 * @author (2023320029 정지후, 2023320010 박성준, 2023320012 강성하)
 * @version (2026/09/30)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 클래스의 객체 생성자
     */
    public User(Integer stID,String name)
    {
        this.stID = stID;
        this.name = name;
    }
    
    @Override
    /**
     * 객체의 stID를 String형으로 리턴하는 메소드
     *
     * @param  없음
     * @return  객테의 stID를 리턴
     */
    public String getID()
    {
        return String.valueOf(stID);
    }
    
    @Override
    /**
     * toString 메소드 오버라이딩
     *
     * @param  없음
     * @return   이용자 객체에 대한 정보 리턴
     */
    public String toString()
    {
        return "[" + stID + "] "  + name;
    }


}