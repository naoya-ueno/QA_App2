package jp.techacademy.naoya.ueno.qa_app;

import java.io.Serializable;

public class Answer implements Serializable {
    private String mBody;
    private String mName;
    private String mUid;
    private String mAnswerUid;
    private String mFavorite;

    public Answer(String body, String name, String uid, String answerUid, String favorite) {
        mBody = body;
        mName = name;
        mUid = uid;
        mAnswerUid = answerUid;
        mFavorite = favorite;
    }

    public String getBody() {
        return mBody;
    }

    public String getName() {
        return mName;
    }

    public String getUid() {
        return mUid;
    }

    public String getAnswerUid() {
        return mAnswerUid;
    }

    public String getFavorite() {
        return mFavorite;
    }
}