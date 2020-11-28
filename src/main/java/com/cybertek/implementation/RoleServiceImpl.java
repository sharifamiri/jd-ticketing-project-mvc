package com.cybertek.implementation;

import com.cybertek.dto.RoleDTO;
import com.cybertek.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {

    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(),object);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void update(RoleDTO object) {
        super.update(object.getId(),object);
    }

    @Override
    public void delete(RoleDTO user) {
        super.delete(user);
    }

    @Override
    public RoleDTO findByID(Long id) {
        return super.findByID(id);
    }
}
