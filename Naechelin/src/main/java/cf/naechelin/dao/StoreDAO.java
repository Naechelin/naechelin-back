package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.MissionVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import cf.naechelin.vo.VisitVO;

import java.util.List;

public interface StoreDAO
{
    void insert(StoreVO store) throws StoreException;
    void update(StoreVO store) throws StoreException;
    void delete(StoreVO store) throws StoreException;
    StoreVO view(StoreVO store) throws StoreException;
    List<StoreVO> listByString(QueryVO query) throws StoreException;
    List<StoreVO> listByInteger(QueryVO query) throws StoreException;
    void insertRequest(StoreVO store) throws StoreException;
    void updateRequest(StoreVO store) throws StoreException;
    void deleteRequest(StoreVO store) throws StoreException;

    List<VisitVO> howManyVisits(StoreVO store) throws StoreException;

}
