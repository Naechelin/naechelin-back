package cf.naechelin.vo;

public class NaechelinStarVO
{
    int storeId;
    int reviewRating;

    public NaechelinStarVO(){}

    public NaechelinStarVO(int storeId, int reviewRating)
    {
        this.storeId = storeId;
        this.reviewRating = reviewRating;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public int getReviewRating()
    {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating)
    {
        this.reviewRating = reviewRating;
    }

}
