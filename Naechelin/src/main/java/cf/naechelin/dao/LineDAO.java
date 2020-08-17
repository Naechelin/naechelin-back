package cf.naechelin.dao;

import cf.naechelin.vo.LineVO;
import cf.naechelin.vo.QueryVO;

import java.util.List;

public interface LineDAO
{
    void insert(LineVO line);
    void update(LineVO line);
    void delete(LineVO line);
    LineVO view(LineVO line);
    List<LineVO> list(QueryVO query);
}
