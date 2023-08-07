package OptionalTest;

import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        User user1 = new User();
//        user1.id = 100L;
        Optional.ofNullable(user1)
                .map(user ->
                        user.id)
                .ifPresent(id -> {
                    System.out.println(id);
                });
    }

}

class User {
    Long id;
    String name;
    String address;
}
