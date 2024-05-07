package fr.dawan.entrainementspringapi.service;


import fr.dawan.entrainementspringapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

@Service
public class UserService {

    private List<User>userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"Ida",32,"id@amail-com");
        User user2 = new User(2, "John", 25, "john@example.com");
        User user3 = new User(3, "Alice", 28, "alice@example.com");
        User user4 = new User(4, "Bob", 30, "bob@example.com");
        User user5 = new User(5, "Emily", 22, "emily@example.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));

    }

    public Optional<User> getUser(int id) {
        Optional optional = Optional.empty();
        for(User user : userList) {
            if(id==user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
