package cf.naechelin.vo;

public class QueryVO
{
    private String condition;
    private String word;

    public QueryVO(){}

    public QueryVO(String condition, String word)
    {
        this.condition = condition;
        this.word = word;
    }

    public String getCondition()
    {
        return condition;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }
}
