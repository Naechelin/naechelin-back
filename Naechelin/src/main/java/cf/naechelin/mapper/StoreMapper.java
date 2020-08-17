package cf.naechelin.mapper;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;

import java.awt.*;
import java.util.List;

public interface StoreMapper
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
}
