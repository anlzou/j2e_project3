package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Users;
import qin.com.mapper.UsersMapper;
import qin.com.service.UsersService;

@Service("usersServiceImpl")//表示业务类的注解，在控制其中使用usersServiceImpl缩写调用即可，Spring自动搜索qin.com下的该类
public class UsersServiceImpl implements UsersService {

    @Autowired //表示紧跟在它定义的变量会自动进行封装，即添加getXX()、setXX()方法
    private UsersMapper usersMapper;//即 usersMapper 变量不用进行get和set的设置。

    /**
     * 等价于以下
     * */
//    public UsersMapper getUsersMapper(){
//        return usersMapper;
//    }
//
//    public void setUsersMapper(UsersMapper usersMapper){
//        this.usersMapper = usersMapper;
//    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Users record) {
        return 0;
    }

    @Override
    public int insertSelective(Users record) {
        return 0;
    }

    @Override
    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);//调用接口，Mybatis自动转换方法
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return 0;
    }
}