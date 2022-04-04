package com.hendisantika.config;

import com.hendisantika.repository.UserAccountRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-rbac
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/04/22
 * Time: 07.41
 */
@Component
public class DatabaseUserDetailsService implements UserDetailsService {

    private final
    UserAccountRepository userAccountRepository;

    public DatabaseUserDetailsService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }
}
