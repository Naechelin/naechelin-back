package cf.naechelin.dao;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface LikeyDAO
{
    void insert(LikeyVO likey)throws LikeyException;
    void delete(LikeyVO likey) throws LikeyException;
    List<LikeyVO> LikeStoreList(QueryVO query)throws LikeyException;
    List<StoreVO>MyLikeList(List<LikeyVO> likeyList)throws LikeyException;
}
