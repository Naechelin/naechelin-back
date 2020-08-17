package cf.naechelin.dao;

import cf.naechelin.vo.LineVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("LineDAO")
public class LineDAOImpl implements LineDAO
{
    @Override
    public void insert(LineVO line)
    {

    }

    @Override
    public void update(LineVO line)
    {

    }

    @Override
    public void delete(LineVO line)
    {

    }

    @Override
    public LineVO view(LineVO line)
    {
        return null;
    }

    @Override
    public List<LineVO> list(String condition, String word)
    {
        return null;
    }
}
