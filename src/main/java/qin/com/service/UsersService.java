/**
 * @author：anlzou
 * @Date：Created in16:54 2020/6/9
 * @Github：https://github.com/anlzou
 * @Description：
 */
package qin.com.service;

import qin.com.entity.Users;

public interface UsersService {
    int deleteByPrimaryKey(Long id);
    int insert(Users record);
    int insertSelective(Users record);
    Users selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Users record);
    int updateByPrimaryKey(Users record);
}
