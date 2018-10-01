package com.example.oem.mntc_app;


import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

import static android.support.v4.content.res.TypedArrayUtils.getResourceId;


public class MainActivity extends ListActivity {

    //Debugging code
    private static final String TAG = MainActivity.class.getSimpleName();
    SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd");
    String today = "";
    String[] events_dates;
    String[] events_time;
    String[] events_images;
    String[] events_description;
    String[] events_venue;
    Button clk;
    VideoView video_view;
    MediaController mediac;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Calendar calendar = Calendar.getInstance();
//        today = mdformat.format(calendar.getTime());
//
//        Log.i(TAG, "Debug: today: "+today);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//clk=(Button)findViewById(R.id.button);
//videov=(VideoView) findViewById(R.id.VideoView);
mediac=new MediaController(this);

//        events_dates = getResources().getStringArray(R.array.event_individual_dates);
//        int size = events_dates.length;
//        Log.i(TAG, "Debug: event dates: "+events_dates[0]);
//        events_time = getResources().getStringArray(R.array.event_individual_time);
//        Log.i(TAG, "Debug: event time: "+events_time[0]);
//        events_images = getResources().getStringArray(R.array.event_individual_images);
//        Log.i(TAG, "Debug: event images: "+events_images[0]);
//        events_description = getResources().getStringArray(R.array.event_individual_description);
//        Log.i(TAG, "Debug: event description: "+events_description[0]);
//        events_venue = getResources().getStringArray(R.array.event_individual_venues);
//        Log.i(TAG, "Debug: event venue: "+events_venue[0]);

//
//
//        /*Variables required for sorting data for list view Android*/
//        int changed[] = new int[size];
//        int diff[] = new int[size];
//        int diff_sorted[] = new int[size];
//        int count[] = new int[2001];
//        int count_d[] = new int[2001];
//
//
//        for(int i=0;i<2001;i++)
//        {
//            count[i]=0;
//            count_d[i]=0;
//        }
//        int done[] = new int[size];
//        int duplicate[] = new int[size];
//
//        for(int i=0;i<size;i++)
//        {
//            changed[i]=0;
//            diff[i]=0;
//            diff_sorted[i]=0;
//            done[i]=0;
//            duplicate[i]=0;
//        }
//
//        //j indicates the variables of today's date while i of the event date
//        String yeari = "";
//        String yearj = "";
//        String monthi = "";
//        String monthj = "";
//        String dayi = "";
//        String dayj = "";
//
//
//        yearj = today.substring(0,4);
//        monthj = today.substring(7, 9);
//        dayj = today.substring(12);
//        for(int i=0;i<size;i++)
//        {
//            yeari = events_dates[i].substring(6);
//            monthi = events_dates[i].substring(3, 5);
//            dayi = events_dates[i].substring(0, 2);
//
//            //Error with tracking number of days to even
//            diff[i]=(((Integer.valueOf(yeari)-1)*12*30)+((Integer.valueOf(monthi)-1)*30)+(Integer.valueOf(dayi)-1)-((Integer.valueOf(yearj)-1)*12*30)-((Integer.valueOf(monthj)-1)*30)-((Integer.valueOf(dayj)-1)));
//            diff_sorted[i]=diff[i];
//            count[diff[i]+1000]++;
//            duplicate[i]=diff[i];
//        }
//        Arrays.sort(diff_sorted);
//        int count1=0;
//        for(int i=0;i<size;i++)
//        {
//            if(diff_sorted[i]>=0)
//            {
//                diff[count1]=diff_sorted[i];
//                count1++;
//            }
//        }
//        for(int i=0;i<size;i++)
//        {
//            if(diff_sorted[i]<0)
//            {
//                diff[count1]=diff_sorted[i];
//                count1++;
//            }
//        }
//        int add=0;
//        int flag=0;
//        for(int i=0;i<size;i++)
//        {
//            for(int j=0;j<size;j++)
//            {
//                flag=0;
//                add=0;
//                if((count_d[duplicate[i]+1000])-(count[duplicate[i]+1000])>0)
//                {
//                    add=(count_d[duplicate[i]+1000])-(count[duplicate[i]+1000]);
//                }
//                if(duplicate[i]==diff[j])
//                {
//                    changed[i]=j+add;
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==1)
//            {
//                break;
//            }
//        }
//        String ans;
//        for(int i=0;i<size/2;i++){
//            ans=events_images[i];
//            events_images[i] = events_images[changed[i]];
//            events_images[changed[i]]=ans;
//
//            ans=events_time[i];
//            events_time[i] = events_time[changed[i]];
//            events_time[changed[i]]=ans;
//
//            ans=events_description[i];
//            events_description[i] = events_description[changed[i]];
//            events_description[changed[i]]=ans;
//
//            ans=events_venue[i];
//            events_venue[i] = events_venue[changed[i]];
//            events_venue[changed[i]]=ans;
//        }
//        final String[] images = new String[size];
//        for(int i=0;i<size;i++){
//            images[i] = Integer.toString(getResources().getIdentifier(events_images[i],"drawable",getPackageName()));
//            //The above images is a string
//        }
//
//        for(int i=0;i<size;i++)
//        {
//            Log.i(TAG, "Debug: Dates: "+events_dates[i]);
//        }
//        Log.i(TAG, "Debug: Images: "+images[0]);
//        Log.i(TAG, "Debug: Venue: "+events_venue[0]);
//        final ListView list = (ListView) findViewById(android.R.id.list);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(MainActivity.this,Event_independent_activity.class);
//                intent.putExtra("VENUE",events_venue[Integer.valueOf(list.getItemAtPosition(position).toString())]);
//                intent.putExtra("DATE",events_dates[Integer.valueOf(list.getItemAtPosition(position).toString())]);
//                intent.putExtra("IMG",images[Integer.valueOf(list.getItemAtPosition(position).toString())]);
//                intent.putExtra("TIME",events_time[Integer.valueOf(list.getItemAtPosition(position).toString())]);
//                intent.putExtra("DESCRIPTION",events_description[Integer.valueOf(list.getItemAtPosition(position).toString())]);
//                startActivity(intent);
//            }
//        }




//        );


//        MyAdapter adapter = new MyAdapter(this,images);
//        list.setAdapter(adapter);

    }
    public void Videoplay(View V)
    {
        String videopath="android.resource://com.example.oem.mntc_app/"+R.raw.aavishkar _ Shortcut;
        Uri uri= Uri.parse(videopath);
        video_view.setVideoURI(uri);
        video_view.setMediaController(mediac);
        mediac.setAnchorView(video_view);
        video_view.start();
    }


//    class MyAdapter extends ArrayAdapter<String>{
//        Context context;
//        public String[] imgs;
//        MyAdapter(Context c,String[] imgs){
//            super(c,R.layout.list_single,R.id.event_icon,events_images);
//            this.context=c;
//            this.imgs = imgs;
//        }

//        @Override
//        public View getView(int position, View convertView, ViewGroup parent){
//            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View row = layoutInflater.inflate(R.layout.list_single,parent,false);
//            ImageView image =row.findViewById(R.id.event_icon);
//            image.setImageResource(Integer.valueOf(imgs[position]));
//            return row;
//        }
//    }

    /*Functions for activating intents on click on bottom navigation bar*/
    //Write the on click listener in xml code of menu and remove comments for this
//    public void online_events()
//    {
//        Intent online = new Intent(this,Online_event.class);
//        startActivity(online);
//    }
//
//    public void about_us()
//    {
//        Intent about = new Intent(this,About_us.class);
//        startActivity(about);
//    }
//
//    public void aavishkaar(MenuItem item)
//    {
//        Intent aavishkar = new Intent(this,Aavishkaar.class);
//        startActivity(aavishkar);
//    }

}
