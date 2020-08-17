package cf.naechelin.mapper;

import cf.naechelin.vo.StoreTypeVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface StoreTypeMapper
{
    void insert(StoreTypeVO storeType);
    void update(StoreTypeVO storeType);
    void delete(StoreTypeVO storeType);
    StoreTypeVO view(StoreTypeVO storeType);
    List<StoreTypeVO> list();
}
