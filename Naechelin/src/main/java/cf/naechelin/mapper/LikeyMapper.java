// Likey joenka 2020.08.15
package cf.naechelin.mapper;

import cf.naechelin.vo.LikeyVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface LikeyMapper
{
    void insert(LikeyVO like)throws LikeyException;
    void delete(LikeyVO like) throws LikeyException;
    List<LikeyVO> viewLikeStoreList(QueryVO query)throws LikeyExecption;
    StoreVO viewStore(LikeyVO likey)throws LikeyException;
}
