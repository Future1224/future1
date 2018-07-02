package future.zwp.dao;

import future.zwp.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> selectAll();

}
