package cf.naechelin.dao;

import cf.naechelin.vo.LikeyVO;

import java.util.List;

public interface LikeyDao
{
    void insert(LikeyVO like)throws LikeyException;
    void delete(LikeyVO like) throws LikeyException;
    List<LikeyVO> viewLikeStoreList(String condition, String word)throws LikeyExecption;
    List<StoreVO>viewMyLikeList(List<LikeyVO> likeyList)throws LikeyException;
}
