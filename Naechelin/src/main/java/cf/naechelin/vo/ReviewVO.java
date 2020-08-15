package cf.naechelin.vo;

import java.util.Objects;

public class ReviewVO
{
    private int lineId;
    private int storeId;
    private String reviewPac;
    private String reviewPhoto;
    private int reviewRating;

    public ReviewVO(){}

    public ReviewVO(int lineId, int storeId, String reviewPac, String reviewPhoto, int reviewRating)
    {
        this.lineId = lineId;
        this.storeId = storeId;
        this.reviewPac = reviewPac;
        this.reviewPhoto = reviewPhoto;
        this.reviewRating = reviewRating;
    }

    public int getLineId()
    {
        return lineId;
    }

    public void setLineId(int lineId)
    {
        this.lineId = lineId;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public String getReviewPac()
    {
        return reviewPac;
    }

    public void setReviewPac(String reviewPac)
    {
        this.reviewPac = reviewPac;
    }

    public String getReviewPhoto()
    {
        return reviewPhoto;
    }

    public void setReviewPhoto(String reviewPhoto)
    {
        this.reviewPhoto = reviewPhoto;
    }

    public int getReviewRating()
    {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating)
    {
        this.reviewRating = reviewRating;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewVO reviewVO = (ReviewVO) o;
        return lineId == reviewVO.lineId &&
                storeId == reviewVO.storeId &&
                reviewRating == reviewVO.reviewRating &&
                reviewPac.equals(reviewVO.reviewPac) &&
                reviewPhoto.equals(reviewVO.reviewPhoto);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(lineId, storeId, reviewPac, reviewPhoto, reviewRating);
    }
}
