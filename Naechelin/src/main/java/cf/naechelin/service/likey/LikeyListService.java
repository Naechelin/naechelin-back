package cf.naechelin.service.likey;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface LikeyListService extends LikeyService
{
    List<StoreVO> doService(String condition, String word)throws LikeyException;
}
