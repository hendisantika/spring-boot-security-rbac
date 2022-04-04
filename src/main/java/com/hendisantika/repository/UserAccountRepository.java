package com.hendisantika.repository;

import com.hendisantika.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-rbac
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/04/22
 * Time: 07.39
 */
@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

    UserAccount findByUsername(String username);
}
