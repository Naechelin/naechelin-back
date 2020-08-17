package cf.naechelin.vo;

public class QueryVO
{
    private String condition;
    private String word;
    private int IntValue;

    public QueryVO(){}

    public QueryVO(String condition, String word)
    {
        this.condition = condition;
        this.word = word;
    }

    public QueryVO(String condition, String word, int intValue)
    {
        this.condition = condition;
        this.word = word;
        IntValue = intValue;
    }

    public int getIntValue()
    {
        return IntValue;
    }

    public void setIntValue(int intValue)
    {
        IntValue = intValue;
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
