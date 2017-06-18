package com.example.android.miwok;

/**
 * Created by ZhengHong on 15/06/2017.
 *
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for the word.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    // Miwok translation for the word
    private String mMiwokTranslation;

    // default translation for the word
    private String mDefaultTranslation;

    // image resource ID associated with the word
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // audio resource ID associated with the word
    private int mAudioResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param imageResourceID is the image resource
     *
     * @param audioResourceID is the audio resource ID for the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID,
                int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param audioResourceID is the audio for the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Returns the Miwok translation for the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Returns the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Returns the image resource ID for the word.
     */
    public int getImageResourceID() { return mImageResourceID; }

    /**
     * Returns the audio resource ID for the word.
     */
    public int getAudioResourceID() { return mAudioResourceID; }

    /**
     * Returns whether or not there is an image for the word.
     */
    public boolean hasImage() { return mImageResourceID != NO_IMAGE_PROVIDED; }
}
