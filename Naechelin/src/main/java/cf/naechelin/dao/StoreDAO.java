package cf.naechelin.dao;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface StoreDAO
{
    void insert(StoreVO store) throws StoreException;
    void update(StoreVO store) throws StoreException;
    void delete(StoreVO store) throws StoreException;
    StoreVO view(StoreVO store) throws StoreException;
    List<StoreVO> list(int memberId) throws StoreException;
    void insertRequest(StoreVO store) throws StoreException;
    void updateRequest(StoreVO store) throws StoreException;
    void deleteRequest(StoreVO store) throws StoreException;
}
