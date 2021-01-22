package android.exmaple.knowcorona;

public class Covid19 {

    private String Caption;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private  static  final int NO_IMAGE_PROVIDED = -1;

    private String mCovid1;
    private String mCovid2;
    private String mCovid3;
    private String mCovid4;
    private String mCovid5;
    private String mCovid6;
    private String mCovid7;
    private String mCovid8;
    private String mCovid9;
    private String mCovid10;



    public Covid19(String caption,String covid1, String covid2, String covid3,String covid4, String covid5){

        Caption = caption;
        mCovid1 = covid1;
        mCovid2 = covid2;
        mCovid3 = covid3;
        mCovid4 = covid4;
        mCovid5 = covid5;


    }

    public Covid19(String caption,String covid1, String covid2, String covid3,String covid4, String covid5, String covid6, String covid7){

        Caption = caption;
        mCovid1 = covid1;
        mCovid2 = covid2;
        mCovid3 = covid3;
        mCovid4 = covid4;
        mCovid5 = covid5;
        mCovid6 = covid6;
        mCovid7 = covid7;



    }


    public Covid19(String caption, String covid1, String covid2, String covid3, String covid4, String covid5, String covid6, String covid7, String covid8, String covid9 , String covid10){

        Caption = caption;
        mCovid1 = covid1;
        mCovid2 = covid2;
        mCovid3 = covid3;
        mCovid4 = covid4;
        mCovid5 = covid5;
        mCovid6 = covid6;
        mCovid7 = covid7;
        mCovid8 = covid8;
        mCovid9 = covid9;
        mCovid10 = covid10;





    }



    public Covid19(String caption,String covid1, String covid2, String covid3){

        Caption = caption;
        mCovid1 = covid1;
        mCovid2 = covid2;
        mCovid3 = covid3;



    }

    public Covid19(String caption,String covid1, String covid2, String covid3,String covid4, String covid5, String covid6, String covid7, int imageResourceId){

        Caption = caption;
        mCovid1 = covid1;
        mCovid2 = covid2;
        mCovid3 = covid3;
        mCovid4 = covid4;
        mCovid5 = covid5;
        mCovid6 = covid6;
        mCovid7 = covid7;
        mImageResourceId = imageResourceId;



    }



    public String getCaption(){ return Caption; }

    public String getmCovid1() { return mCovid1; }
    public String getmCovid2() { return mCovid2; }
    public String getmCovid3() { return mCovid3; }
    public String getmCovid4() { return mCovid4; }
    public String getmCovid5() { return mCovid5; }
    public String getmCovid6() { return mCovid6; }
    public String getmCovid7() { return mCovid7; }
    public String getmCovid8() { return mCovid8; }
    public  String getmCovid9() {  return mCovid9; }
    public String getmCovid10() {  return mCovid10; }
    public int getmImageResourceId() { return mImageResourceId; }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
