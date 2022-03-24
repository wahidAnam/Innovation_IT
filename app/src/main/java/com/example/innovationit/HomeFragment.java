package com.example.innovationit;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.innovationit.model.Client;
import com.example.innovationit.model.Product;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;


public class HomeFragment extends Fragment {

    private RecyclerView clientRV;
    private List<Client> clientList;
    private ClientAdapter clientAdapter;
    private int[] images;
    private String[] text;
    private SliderAdapter sliderAdapter;
    private SliderView sliderView;
    private Context context;

    private List<Product> sliderItems;
    private ViewPager2 viewPager2;



    public HomeFragment() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);



        //----------recycler start-----------
        clientRV = view.findViewById(R.id.ourclientRV);
        clientList = new ArrayList<>();
        clientAdapter = new ClientAdapter(context,clientList);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(new MainActivity(), LinearLayoutManager.HORIZONTAL, false);

        clientRV.setLayoutManager(layoutManager);
        //hotlineRV.setLayoutManager(new GridLayoutManager(this,3));
        clientRV.setAdapter(clientAdapter);
        //----------recycler end-----------

        getAllClient();


        //----------slider start-----------
        sliderView = view.findViewById(R.id.sliderViewID);
        images = new int[]{R.drawable.adarsha_sadar_comilla,
                R.drawable.adharsha_uno_cumilla,
                R.drawable.bpara_biometric_01,
                R.drawable.burichang_biometric_02};
        text = new String[]
                {"কুমিল্লা আদর্শ সদর উপজেলা প্রশাসন",
                "ইনোভেশন আইটি পক্ষ থেকে কুমিল্লা আদর্শ উপজেলার ইউএনও মহোদয় কে বিদায় সম্মাননা প্রদান।",
                "ব্রাহ্মণপাড়া উপজেলা প্রশাসন ",
                "বুডিচং উপজেলা প্রশাসন"};

        sliderAdapter = new SliderAdapter(images,text);
        sliderView.setSliderAdapter(sliderAdapter);

        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.SWAP);
        sliderView.startAutoCycle();
        //----------slider end-----------


        //----------Pagerindicator start-----------
        viewPager2 = view.findViewById(R.id.pager);
        sliderItems = new ArrayList<>();
        ProductAdapter  productAdapter = new ProductAdapter(sliderItems,viewPager2);

        int point = sliderItems.size() / 2;
        viewPager2.setCurrentItem(point);

        viewPager2.setAdapter(productAdapter);

        ScrollingPagerIndicator pagersIndicator = view.findViewById(R.id.pagerIndicator);
        pagersIndicator.attachToPager(viewPager2);

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(10));

        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);

        getAllProduct();
        //----------Pagerindicator end-----------

        return view;
    }

    private void getAllProduct() {

        sliderItems.add(new Product("স্কুল ম্যানেজমেন্ট সফটওয়্যার",""+getString(R.string.school_soft),R.drawable.school));
        sliderItems.add(new Product("ইউনিয়ন ম্যানেজমেন্ট সফটওয়্যার",""+getString(R.string.union_soft),R.drawable.digital_union));
        sliderItems.add(new Product("পরীক্ষা ম্যানেজমেন্ট সফটওয়্যার",""+getString(R.string.online_exam),R.drawable.online_exam_icon));
        sliderItems.add(new Product("জেলা ম্যানেজমেন্ট সফটওয়্যার",""+getString(R.string.your_deputy),R.drawable.your_deputy));
        sliderItems.add(new Product("পয়েন্ট অফ সেল সফটওয়্যার",""+getString(R.string.hisab365),R.drawable.hisabd));
        sliderItems.add(new Product("ব্রিক ফিল্ড ম্যানেজমেন্ট সফটওয়্যার",""+getString(R.string.amarbrick_details),R.drawable.amar_brick));
        sliderItems.add(new Product("পৌরসভা ম্যানেজমেন্ট সফটওয়্যার",""+getString(R.string.pouro_soft),R.drawable.digital_pouros));
        sliderItems.add(new Product("ই-কমার্স ম্যানেজমেন্ট সফটওয়্যার",""+getString(R.string.gobazar_details),R.drawable.gobazaar_icon));
        sliderItems.add(new Product("অনলাইনে পশু ক্রয় বিক্রয়ের সফটওয়্যার",""+getString(R.string.posurhat_details),R.drawable.posurhat));
        sliderItems.add(new Product("গাড়ী ম্যানেজমেন্ট সফটওয়্যার এন্ড মোবাইল অ্যাপ্লিকেশন",""+getString(R.string.vehicle_details),R.drawable.vehicalelogo));
        sliderItems.add(new Product("ফেনীর মেয়র মোবাইল অ্যাপ্লিকেশন",""+getString(R.string.feni_pouro_soft),R.drawable.feni_logo));
        sliderItems.add(new Product("সিরাজগঞ্জের মেয়র মোবাইল অ্যাপ্লিকেশন",""+getString(R.string.sirajgonj_pouro_soft),R.drawable.sirajgonjlogo));

    }


    private void getAllClient() {

        //===============Client=============
        clientList.add(new Client("ঢাকা জেলা",R.drawable.dhaka));
        clientList.add(new Client("চট্টগ্রাম জেলা",R.drawable.chittagong));
        clientList.add(new Client("কুমিল্লা জেলা",R.drawable.comilla));
        clientList.add(new Client("বার্ড কুমিল্লা",R.drawable.bard));
        clientList.add(new Client("রাজশাহী জেলা",R.drawable.rajshahi));
        clientList.add(new Client("নরসিংদী জেলা",R.drawable.narsingdi));
        clientList.add(new Client("চাঁদপুর জেলা",R.drawable.chadpur));
        clientList.add(new Client("ফরিদপুর জেলা",R.drawable.faridfur));
        clientList.add(new Client("মুন্সীগঞ্জ জেলা",R.drawable.munshiganj));
        clientList.add(new Client("ঢাকা তেজগাঁও সার্কেল",R.drawable.tejgaon));
        clientList.add(new Client("সিরাজগঞ্জ পৌরসভা",R.drawable.sirajpour_logo));
        clientList.add(new Client("ভাঙ্গা পৌরসভা",R.drawable.bhanga));
        clientList.add(new Client("সাভার পৌরসভা",R.drawable.savar_logo));
        clientList.add(new Client("ফেনী পৌরসভা",R.drawable.feni_pou));
        clientList.add(new Client("গাজীপুর জেলা",R.drawable.gazipur));
        clientList.add(new Client("ফেনী জেলা",R.drawable.feni));
        clientList.add(new Client("আইসিটি বিভাগ",R.drawable.ict_section));
        clientList.add(new Client("ব্রাহ্মণবাড়িয়া জেলা",R.drawable.brammanbaria));
        clientList.add(new Client("নারায়ণগঞ্জ জেলা",R.drawable.narayanganj));
        clientList.add(new Client("বান্দরবান জেলা",R.drawable.bandarban));
        clientList.add(new Client("মানিকগঞ্জ জেলা",R.drawable.manikganj));
        //===============Client end=============
    }
}