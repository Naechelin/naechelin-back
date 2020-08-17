package cf.naechelin.mapper;

import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface StoreMapper
{
    void insert(StoreVO store);
    void update(StoreVO store);
    void delete(StoreVO store);
    StoreVO view(StoreVO store);
    List<StoreVO> list(int memberId);
    void insertRequest(StoreVO store);
    void updateRequest(StoreVO store);
    void deleteRequest(StoreVO store);
}
