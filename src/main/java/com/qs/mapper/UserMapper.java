package com.qs.mapper;

import com.qs.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 新增用戶
     *
     * @param user
     * @return
     * @throws Exception
     */
    int save(User user) throws Exception;

    /**
     * 批量更新
     *
     * @param userList
     * @return
     */
    int batchSave(List<User> userList);

    /**
     * 修改用戶
     *
     * @param user
     * @return
     * @throws Exception
     */
    int updateUser(User user) throws Exception;

    /**
     * 批量更新对象
     *
     * @param users
     * @return
     */
    int batchUpdate(List<User> users);


    /**
     * 刪除用戶
     *
     * @param id
     * @return
     * @throws Exception
     */
    int deleteUser(String id) throws Exception;

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    User selectUserById(String id) throws Exception;

    /**
     * 查询所有的用户信息
     *
     * @return
     * @throws Exception
     */
    List<User> selectAllUser() throws Exception;
}