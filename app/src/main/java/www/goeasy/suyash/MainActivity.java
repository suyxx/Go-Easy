package www.goeasy.suyash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private ImageButton facebookbtn;
    private ImageButton whatsappbtn;
    private ImageButton instagrambtn;
    private ImageButton twitterbtn;
    private ImageButton youtubebtn;
    private ImageButton gmailbtn;
    private ImageButton youcambtn;
    private ImageButton dialpadbtn;
    private ImageButton chromebtn;
    private ImageButton amazonbtn;
    private ImageButton newshuntbtn;
    private ImageButton mxplayerbtn;
    private ImageButton ucbrowserbtn;
    private ImageButton paytmbtn;
    private ImageButton xenderbtn;
    private ScrollView view;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=(ScrollView)findViewById(R.id.scrollview);
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);





       MobileAds.initialize(getApplicationContext(),
              "ca-app-pub-6243234385826605/8201853450");

       AdView mAdView = (AdView) findViewById(R.id.adView);
       AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        facebookbtn = (ImageButton) findViewById(R.id.facebook);
        facebookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent LwaIntent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                if (LwaIntent != null) {
                    startActivity(LwaIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }

        });
        whatsappbtn = (ImageButton) findViewById(R.id.whatsapp);
        whatsappbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LwaIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                if (LwaIntent != null) {
                    startActivity(LwaIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.whatsapp&hl=en";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });
        instagrambtn = (ImageButton) findViewById(R.id.instagram);
        instagrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LigIntent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                if (LigIntent != null) {
                    startActivity(LigIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.instagram.android&hl=en";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });
        twitterbtn = (ImageButton) findViewById(R.id.twitter);
        twitterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LttIntent = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
                if (LttIntent != null) {
                    startActivity(LttIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.twitter.android&hl=en";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });
        youtubebtn = (ImageButton) findViewById(R.id.youtube);
        youtubebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LytIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                if (LytIntent != null) {
                    startActivity(LytIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.google.android.youtube&hl=en";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });
        gmailbtn = (ImageButton) findViewById(R.id.gmail);
        gmailbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LwaIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
                if (LwaIntent != null) {
                    startActivity(LwaIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.google.android.gm&hl=en";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });
        amazonbtn = (ImageButton) findViewById(R.id.amazon);
        amazonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LctIntent = getPackageManager().getLaunchIntentForPackage("in.amazon.mShop.android.shopping");
                if (LctIntent != null) {
                    startActivity(LctIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=in.amazon.mShop.android.shopping";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });

        dialpadbtn = (ImageButton) findViewById(R.id.calling);
        dialpadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ldpintent = new Intent(Intent.ACTION_DIAL);
                Ldpintent.setData(Uri.parse("tel:"));
                if (Ldpintent != null) {
                    startActivity(Ldpintent);
                } else {
                    Toast.makeText(getApplicationContext(), "Dialpad not available", Toast.LENGTH_LONG).show();
                }
            }
        });
        newshuntbtn = (ImageButton) findViewById(R.id.newshunt);
        newshuntbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LctIntent = getPackageManager().getLaunchIntentForPackage("com.eterno");
                if (LctIntent != null) {
                    startActivity(LctIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.eterno";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });
        youcambtn = (ImageButton) findViewById(R.id.youcam);
        youcambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LctIntent = getPackageManager().getLaunchIntentForPackage("com.cyberlink.youperfect");
                if (LctIntent != null) {
                    startActivity(LctIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.cyberlink.youperfect";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });
        mxplayerbtn = (ImageButton) findViewById(R.id.mxplayer);
        mxplayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LctIntent = getPackageManager().getLaunchIntentForPackage("com.mxtech.videoplayer.ad");
                if (LctIntent != null) {
                    startActivity(LctIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.mxtech.videoplayer.ad";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }

            }
        });
        chromebtn = (ImageButton) findViewById(R.id.chrome);
        chromebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LctIntent = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
                if (LctIntent != null) {
                    startActivity(LctIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.android.chrome";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }
        });

        xenderbtn = (ImageButton) findViewById(R.id.xender);
        xenderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent LwaIntent = getPackageManager().getLaunchIntentForPackage("cn.xender");
                if (LwaIntent != null) {
                    startActivity(LwaIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=cn.xender";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }

        });
        ucbrowserbtn = (ImageButton) findViewById(R.id.ucbrowser);
        ucbrowserbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent LwaIntent = getPackageManager().getLaunchIntentForPackage("com.UCMobile.intl");
                if (LwaIntent != null) {
                    startActivity(LwaIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=com.UCMobile.intl";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }

        });

        paytmbtn = (ImageButton) findViewById(R.id.paytm);
        paytmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent LwaIntent = getPackageManager().getLaunchIntentForPackage("net.one97.paytm");
                if (LwaIntent != null) {
                    startActivity(LwaIntent);
                } else {
                    String url = "https://play.google.com/store/apps/details?id=net.one97.paytm";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
            }

        });
    }

    }





