package com.qs;

import com.qs.entity.User;
import com.qs.mapper.UserMapper;
import com.qs.tools.DBTools;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {

    public static void main(String[] args) throws Exception {
//        insertUser();
//        deleteUser();
//        selectUserById();
//        selectAllUser();

//        updateUser();

//        selectUserById();
//        selectAllUser();

//        batchSave();

        batchUpdate();
    }


    /**
     * 新增用户
     */
    private static void insertUser() {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User("秦玉鹏", "123456", 10000.0);
        try {
            mapper.save(user);
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    /**
     * 批量插入
     */

    private static void batchSave(){
        SqlSession sqlSession = DBTools.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = new ArrayList<User>();
        User user = new User("zhangsan", "111111", 111.11);
        User user2 = new User("zhangsan2", "111111", 111.11);
        User user3 = new User("zhangsan3", "111111", 111.11);
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        int cnt = mapper.batchSave(userList);
        System.out.println("cnt=" + cnt);
        sqlSession.commit();
    }


    /**
     * 更新对象属性
     */
    private static void updateUser() throws Exception {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId("28df9d7e36e211e8b72ff48e388e3828");
        user.setUsername("zhangsan");
        user.setAccount(200.0);
        user.setPassword("000000");
        int cnt = mapper.updateUser(user);
        System.out.println("cnt=" + cnt);
        session.commit();
    }


    /**
     * 批量更新对象属性
     */
    private static void batchUpdate(){
        SqlSession sqlSession = DBTools.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId("123");
        user.setUsername("张三");
        user.setPassword("000");
        user.setAccount(11.11);

        User user2 = new User();
        user2.setId("234");
        user2.setUsername("李四");
        user2.setPassword("111");
        user2.setAccount(22.22);

        List<User> userList = new ArrayList<User>();
        userList.add(user);
        userList.add(user2);

        int cnt = mapper.batchUpdate(userList);
        System.out.println("cnt= " + cnt);
        sqlSession.commit();
    }

    /**
     * 删除用户
     */
    private static void deleteUser(){
        SqlSession session= DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            mapper.deleteUser("43ba08c136e711e8b72ff48e388e3828");
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }


    /**
     * 根据id查询用户
     */
    private static void selectUserById() {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            User user = mapper.selectUserById("28df9d7e36e211e8b72ff48e388e3828");
            System.out.println(user.toString());

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    /**
     * 查询所有的用户
     */
    private static void selectAllUser(){
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            List<User> user=mapper.selectAllUser();
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }
}
