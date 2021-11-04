# Spring Framework intro

-add spring context dependency;
-crate app config class and give @Configuration annotation to it;
-use service, repository autowired annotations
-create aplicationConfigAnnotationContext in main

- Implement UserService and UserDao
  
    ```java
      public interface UserService {
          void add(User user);
      
          List<User> getAll();
      }
    ```
- In the Main class configure ApplicationContext and show how you are saving User into DB and
  reading him back

- Configure DataSource

- Understand the main concepts of Spring framework:
    - ApplicationContext
    - Bean
    - Bean Autowiring
    - Difference between @Bean and @Autowired and @Qualifier
    - What does each annotation used in videos mean?

__You can check yourself using this__ [checklist](https://mate-academy.github.io/jv-program-common-mistakes/java-spring/intro/java-spring-intro)
