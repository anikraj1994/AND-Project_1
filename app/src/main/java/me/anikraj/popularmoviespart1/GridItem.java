package me.anikraj.popularmoviespart1;


public class GridItem {
    private String image;
    private String video;
    private String title;
    private String synopsys;
    private double vote_avg;
    private int vote_count;
    private String backdrop;
    private String date;

    public GridItem(String image, String video, String title, String synopsys, double vote_avg, int vote_count, String backdrop,String date) {
        this.image = image;
        this.video = video;
        this.title = title;
        this.synopsys = synopsys;
        this.vote_avg = vote_avg;
        this.vote_count = vote_count;
        this.backdrop = backdrop;
        this.date=date;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public int getVote_count() {

        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public String getBackdrop() {
        return backdrop;
    }

    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }

    public String getImage() {
        return image;

    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsys() {
        return synopsys;
    }

    public void setSynopsys(String synopsys) {
        this.synopsys = synopsys;
    }

    public double getVote_avg() {
        return vote_avg;
    }

    public void setVote_avg(double vote_avg) {
        this.vote_avg = vote_avg;
    }
}
