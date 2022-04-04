# spring-boot-security-rbac

### Roles and Privileges in Spring Security

In this post, we will take a look at Role Based Access Control (RBAC) with Spring boot.

### Understanding RBAC

In an RBAC model there are three key entities. They are:

1. User or Subject – The actors of the system who perform operations. It can represent a physical person, an automated
   account, or even another application.
2. Role – Authority level defined by A job Title, Department or functional hierarchy.
3. Privilege – An approval or permission to perform operations

With that being said, The following is an illustration of how these entities map to each other.

Basically, Users can perform operations. To perform operations they need to have certain permission or privileges. This
is why privileges are assigned to roles and roles are assigned to users. Let’s see how we can implement these.

```shell
curl -i -u "user1:user1" http://localhost:8080/user
HTTP/1.1 200
Set-Cookie: JSESSIONID=1E2B99446A5F67601213690D7CD29E61; Path=/; HttpOnly
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: text/plain;charset=UTF-8
Content-Length: 11
Date: Mon, 04 Apr 2022 00:54:29 GMT

Hello user!%
```

403 forbidden

```shell
curl -i -u "user1:user1" http://localhost:8080/admin
HTTP/1.1 403
Set-Cookie: JSESSIONID=BA5D38CAF65DADD0DFEE79D27822A37F; Path=/; HttpOnly
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 04 Apr 2022 00:55:01 GMT

{
  "timestamp" : "2022-04-04T00:55:01.419+00:00",
  "status" : 403,
  "error" : "Forbidden",
  "message" : "Forbidden",
  "path" : "/admin"
}%
```

Admin

```shell
curl -i -u "admin:admin" http://localhost:8080/admin
HTTP/1.1 200
Set-Cookie: JSESSIONID=7BA7CCE743CEC8DFA4FF07C759A2A8BB; Path=/; HttpOnly
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: text/plain;charset=UTF-8
Content-Length: 12
Date: Mon, 04 Apr 2022 00:56:35 GMT

Hello Admin!%
```

