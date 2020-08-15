package cf.naechelin.dao;

import cf.naechelin.vo.LikeyVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface LikeyDao
{
    void insert(LikeyVO like)throws LikeyException;
    void delete(LikeyVO like) throws LikeyException;
    List<LikeyVO> viewLikeStoreList(QueryVO query)throws LikeyExecption;
    List<StoreVO>viewMyLikeList(List<LikeyVO> likeyList)throws LikeyException;
}
