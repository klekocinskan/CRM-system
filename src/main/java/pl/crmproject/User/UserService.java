package pl.crmproject.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void add(UserDto userDto) {
        User newUser = new User();

        newUser.setName(userDto.getName());
        newUser.setSurname(userDto.getSurname());
        newUser.setEmail(userDto.getEmail());

        userRepository.save(newUser);

    }
}
