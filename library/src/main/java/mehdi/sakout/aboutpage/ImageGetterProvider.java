package mehdi.sakout.aboutpage;

import android.text.Html.ImageGetter;

import org.sufficientlysecure.htmltextview.HtmlTextView;

/**
 * Created by ichurkin on 09/02/2017.
 */

public interface ImageGetterProvider {

    ImageGetter privideImageGetter(HtmlTextView htmlTextView);

}
