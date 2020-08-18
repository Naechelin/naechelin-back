package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.mapper.StoreMapper;
import cf.naechelin.vo.MissionVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import cf.naechelin.vo.VisitVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("storeDAO")
public class StoreDAOImpl implements StoreDAO
{
    @Autowired
    private StoreMapper mapper;

    @Override
    public void insert(StoreVO store) throws StoreException
    {
        mapper.insert(store);
    }

    @Override
    public void update(StoreVO store) throws StoreException
    {
        mapper.update(store);
    }

    @Override
    public void delete(StoreVO store) throws StoreException
    {
        mapper.delete(store);
    }

    @Override
    public StoreVO view(StoreVO store) throws StoreException
    {
        return mapper.view(store);
    }

    @Override
    public List<StoreVO> listByString(QueryVO query) throws StoreException
    {
        return mapper.listByString(query);
    }

    @Override
    public List<StoreVO> listByInteger(QueryVO query) throws StoreException
    {
        return mapper.listByInteger(query);
    }

    @Override
    public void insertRequest(StoreVO store) throws StoreException
    {
        mapper.insertRequest(store);
    }

    @Override
    public void updateRequest(StoreVO store) throws StoreException
    {
        mapper.updateRequest(store);
    }

    @Override
    public void deleteRequest(StoreVO store) throws StoreException
    {
        mapper.deleteRequest(store);
    }

    @Override
    public List<VisitVO> howManyVisits(StoreVO store) throws StoreException
    {
        return mapper.howManyVisits(store);
    }
}
