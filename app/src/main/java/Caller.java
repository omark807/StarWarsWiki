import android.preference.PreferenceActivity;
import android.util.Log;

import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import mp7.starwarswiki.HttpUtils;

public class Caller {

    RequestParams rp = new RequestParams();
    //rp.add("username", "aaa"); rp.add("password", "aaa@123");

   //
    // HttpUtils.post(AppConstant.URL_FEED, rp, new JsonHttpResponseHandler() {

        public void onSuccess(int statusCode, PreferenceActivity.Header[] headers, JSONObject response) {
            // If the response is JSONObject instead of expected JSONArray
            Log.d("asd", "---------------- this is response : " + response);
            try {
                JSONObject serverResp = new JSONObject(response.toString());
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        public void onSuccess(int statusCode, PreferenceActivity.Header[] headers, JSONArray timeline) {
            // Pull out the first event on the public timeline

        }
    }
