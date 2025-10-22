package service;

import entity.Base;
import entity.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BaseRepository;

import java.util.List;

public abstract class BaseServiceImp <E extends Base,D,DC,ID>implements BaseService<D,DC,ID> {
    @Autowired
    BaseRepository<E,ID> baseRepository;

    @Autowired
    BaseMapper<E,D,DC>baseMapper;

    @Override
    public D save(DC dc){
        E e = baseMapper.toEntity(dc);
        e = baseRepository.save(e);
        D d = baseMapper.toDto(e);
        return d;
    }
    @Override
    public D findById(ID id){return baseMapper.toDto(baseRepository.getById(id));}

    @Override
    public List<D> findAll() {
        return baseRepository.findAll().stream().map(baseMapper::toDto).toList();
    }


    @Override
    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    public abstract void addEstudiante(Long idCurso, Long idEstudiante);
}

