package com.example.demo.dao;

        import com.example.demo.pojo.User;
        import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by XHJ on 2018/3/8.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    //注意一定要和bean的字段名一样！
    User findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);
}
