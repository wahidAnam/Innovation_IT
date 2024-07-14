package com.example.innovationit.user_Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.example.innovationit.Adapter.ClientAdapter;
import com.example.innovationit.Adapter.TeamAdapter;
import com.example.innovationit.R;
import com.example.innovationit.model.Client;
import com.example.innovationit.model.OurTeam;

import java.util.ArrayList;
import java.util.List;

public class OurTeamActivtity extends AppCompatActivity {

    private RecyclerView teamRV;
    private List<OurTeam> ourTeamList;
    private TeamAdapter teamAdapter;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);

        init();

    }

    void init(){

        //----------recycler start-----------
        teamRV = findViewById(R.id.teamRV);
        ourTeamList = new ArrayList<>();
        teamAdapter = new TeamAdapter(ourTeamList,context);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(new MainActivity(), LinearLayoutManager.VERTICAL, false);
        teamRV.setLayoutManager(layoutManager);
        //teamRV.setLayoutManager(new GridLayoutManager(this,3));
        teamRV.setAdapter(teamAdapter);
        //----------recycler end-----------

        getAllTeam();
    }

    private void getAllTeam() {
        ourTeamList.add(new OurTeam(R.drawable.ceo,"খুরশিদ আলম","প্রধান নির্বাহী কর্মকর্তা (সিইও)","এম.এস.সি (কম্পিউটার সায়েন্স ইঞ্জিনিয়ারিং)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"বিজয় কুমার দাস","অ্যাকাউন্টেন্ট এবং অ্যাডমিন","বি.বি.এস(ব্যাচেলর অব বিজনেস স্টাডিজ)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"মোঃ আব্দুল্লাহ আল-ওয়াহিদ বাধন","এইচআর এবং অ্যাডমিন","বি.বি.এ(ব্যাচেলর অব বিজনেস এডমিনিস্ট্রেশন)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"রাবেয়া খাতুন","ম্যানেজার (বিজনেস ডেভেলপমেন্ট অ্যান্ড কমিউনিকেশন)","----------------","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"জয়ন বাড়ৈ","টিম লিডার","বি.এস.সি (কম্পিউটার সায়েন্স ইঞ্জিনিয়ারিং)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"মোঃ ওমর ফারুক","সফটওয়্যার ডেভেলপার","বি.এস.সি (কম্পিউটার সায়েন্স ইঞ্জিনিয়ারিং)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"মোহাম্মদুল কাদের (সৈকত)","জুনিয়র সফটওয়্যার ডেভেলপার","বি.এস.সি (কম্পিউটার সায়েন্স ইঞ্জিনিয়ারিং)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"মেহনাজ আলম","জুনিয়র সফটওয়্যার ডেভেলপার","বি.এস.সি (কম্পিউটার সায়েন্স ইঞ্জিনিয়ারিং)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"নাসির উদ্দিন শাকিল","নির্বাহী কর্মকর্তা","অনার্স (একাউন্টিং)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"সৌরভ শর্মা","মার্কেটিং এক্সিকিউটিভ","এম.এস.সি- (অ্যাপ্লাইড ম্যাথমেটিক্স)","০১৬২৬৩২৩২৬৮"));
        ourTeamList.add(new OurTeam(R.drawable.ceo,"ওয়াহিদুল ইসলাম (এনাম)","জুনিয়র মোবাইল অ্যাপ্লিকেশন ডেভেলপার","অনার্স (মেনেজম্যান্ট)","০১৬২৬৩২৩২৬৮"));
    }

    public void backBtn(View view) {
        onBackPressed();
    }
}