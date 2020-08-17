package cf.naechelin.dao;

import cf.naechelin.mapper.LineMapper;
import cf.naechelin.vo.LineVO;
import cf.naechelin.vo.QueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("LineDAO")
public class LineDAOImpl implements LineDAO
{
    @Autowired
    private LineMapper mapper;

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
    public List<LineVO> list(QueryVO query)
    {
        return mapper.list(query);
    }
}
