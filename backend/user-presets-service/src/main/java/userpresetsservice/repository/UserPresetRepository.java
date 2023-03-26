package userpresetsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import userpresetsservice.model.UserPreset;

import java.util.Optional;

@Repository
public interface UserPresetRepository extends MongoRepository<UserPreset, String> {
    UserPreset findUserPresetByPresetName(String name);
}
