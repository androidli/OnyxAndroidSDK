/**
 * 
 */
package com.onyx.android.sdk.reader;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author joy
 *
 */
public enum DocPagingMode implements Parcelable
{
    None, 
    Hard_Pages, // single-page-based view that only shows a single page at a time 
    Hard_Pages_2Up, // double-page-based view that shows 2 pages at a time
    Flow_Pages, //  a paginated view, where a screen takes up the whole viewport and the content is reflowed
    Scroll_Pages, // scrollable page-based view showing a sequence of pages
    Scroll,; // HTML-browser-like view that can be scrolled and does not have pages
    
    public static final Parcelable.Creator<DocPagingMode> CREATOR = new Parcelable.Creator<DocPagingMode>() {

        @Override
        public DocPagingMode createFromParcel(Parcel source)
        {
            return DocPagingMode.values()[source.readInt()];
        }

        @Override
        public DocPagingMode[] newArray(int size)
        {
            return new DocPagingMode[size];
        }
    };

    @Override
    public int describeContents()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(ordinal());
    } 
}
