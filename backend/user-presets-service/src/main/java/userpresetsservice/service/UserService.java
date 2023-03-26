package userpresetsservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import userpresetsservice.model.User;
import userpresetsservice.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void savePreset(String presetId, int p_id) {
        Optional<User> user = userRepository.findById(1);
        if (user.isPresent()) {
            user.get().setPresets(presetId);
            userRepository.save(user.get());
        }
    }

//    public List<String> getAllUserPresets() {
//        return userRepository.findAll()
//    }
}
