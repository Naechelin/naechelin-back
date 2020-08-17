package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.mapper.StoreTypeMapper;
import cf.naechelin.vo.StoreTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("storeTypeDAO")
public class StoreTypeDAOImpl implements StoreTypeDAO
{
    @Autowired // 주입을 위해서 존재
    StoreTypeMapper mapper;

    @Override
    public void insert(StoreTypeVO storeType) throws StoreException
    {

    }

    @Override
    public void update(StoreTypeVO storeType) throws StoreException
    {

    }

    @Override
    public void delete(StoreTypeVO storeType) throws StoreException
    {

    }

    @Override
    public StoreTypeVO view(StoreTypeVO storeType) throws StoreException
    {
        return null;
    }

    @Override
    public List<StoreTypeVO> list() throws StoreException
    {
        return null;
    }
}
