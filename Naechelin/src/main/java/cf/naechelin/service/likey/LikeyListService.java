package cf.naechelin.service.likey;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface LikeyListService
{
    List<StoreVO> doService(String condition, String word)throws LikeyException;
}
