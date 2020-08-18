package cf.naechelin.vo;

public class NaechelinStarVO
{
    int storeId;
    int reviewRating;
    int storeLatitude;
    int storeLongitude;

    public NaechelinStarVO(){}

    public NaechelinStarVO(int storeId, int reviewRating, int storeLatitude, int storeLongitude)
    {
        this.storeId = storeId;
        this.reviewRating = reviewRating;
        this.storeLatitude = storeLatitude;
        this.storeLongitude = storeLongitude;
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

    public int getStoreLatitude()
    {
        return storeLatitude;
    }

    public void setStoreLatitude(int storeLatitude)
    {
        this.storeLatitude = storeLatitude;
    }

    public int getStoreLongitude()
    {
        return storeLongitude;
    }

    public void setStoreLongitude(int storeLongitude)
    {
        this.storeLongitude = storeLongitude;
    }
}
