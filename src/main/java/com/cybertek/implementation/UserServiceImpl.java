package com.cybertek.implementation;

import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {

    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUsername(),object);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAl();
    }

    @Override
    public void deleteByID(String id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(UserDTO user) {
        super.delete(user);
    }

    @Override
    public UserDTO findByID(String id) {
        return super.findByID(id);
    }
}
