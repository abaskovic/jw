package hr.algebra.jw.Models;

import hr.algebra.jw.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private  final UserRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }
}
