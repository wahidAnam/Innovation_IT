package com.example.innovationit.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.innovationit.Adapter.ClientAdapter;
import com.example.innovationit.Adapter.ProductAdapter;
import com.example.innovationit.Adapter.SliderAdapter;
import com.example.innovationit.user_Activity.CeoMsgActivity;
import com.example.innovationit.user_Activity.MainActivity;
import com.example.innovationit.R;
import com.example.innovationit.model.Client;
import com.example.innovationit.model.Product;
import com.example.innovationit.user_Activity.OurTeamActivtity;
import com.example.innovationit.user_Activity.SupportActivity;
import com.example.innovationit.user_Activity.TrainingDashBoard;
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
    ProductAdapter productAdapter;
    private RecyclerView ourproductRV;

    private TextView ourTeamLL,supportLL,ceomsgLL;
    private CardView goTraining,goServices;


    public HomeFragment() {


    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        ourTeamLL = view.findViewById(R.id.ourTeamLL);
        supportLL = view.findViewById(R.id.supportLL);
        ceomsgLL = view.findViewById(R.id.ceomsgLL);
        goTraining = view.findViewById(R.id.goTraining);
        goServices = view.findViewById(R.id.goServices);



        goTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), TrainingDashBoard.class));
            }
        });

        goServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ServicesDashBoard.class));
            }
        });

        ourTeamLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), OurTeamActivtity.class));
            }
        });

        supportLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SupportActivity.class));
            }
        });

        ceomsgLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), CeoMsgActivity.class));
            }
        });





        //----------recycler start-----------
        clientRV = view.findViewById(R.id.ourclientRV);
        clientList = new ArrayList<>();
        clientAdapter = new ClientAdapter(context,clientList);
//        LinearLayoutManager layoutManager
//                = new LinearLayoutManager(new MainActivity(), LinearLayoutManager.HORIZONTAL, false);
        clientRV.setLayoutManager(new GridLayoutManager(context,4));
        //clientRV.setLayoutManager(layoutManager);

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


        //----------recycler start-----------
        ourproductRV = view.findViewById(R.id.ourproductRV);
        sliderItems = new ArrayList<>();
        productAdapter = new ProductAdapter(sliderItems,context);
//        LinearLayoutManager layoutManager1
//                = new LinearLayoutManager(new MainActivity(), LinearLayoutManager.HORIZONTAL, false);
//        ourproductRV.setLayoutManager(layoutManager1);
        ourproductRV.setLayoutManager(new GridLayoutManager(context,3));
        ourproductRV.setAdapter(productAdapter);


        getAllProduct();

        return view;
    }

    private void getAllProduct() {

        sliderItems.add(new Product("স্কুল ম্যানেজমেন্ট সফটওয়্যার",R.drawable.school));
        sliderItems.add(new Product("জেলা ম্যানেজমেন্ট সফটওয়্যার",R.drawable.your_deputy));
        sliderItems.add(new Product("পয়েন্ট অফ সেল সফটওয়্যার",R.drawable.hisabd));
        sliderItems.add(new Product("ইউনিয়ন ম্যানেজমেন্ট সফটওয়্যার",R.drawable.digital_union));
        sliderItems.add(new Product("পরীক্ষা ম্যানেজমেন্ট সফটওয়্যার",R.drawable.online_exam_icon));
        sliderItems.add(new Product("ব্রিক ফিল্ড ম্যানেজমেন্ট সফটওয়্যার",R.drawable.amar_brick));
        sliderItems.add(new Product("পৌরসভা ম্যানেজমেন্ট সফটওয়্যার",R.drawable.digital_pouros));
        sliderItems.add(new Product("ই-কমার্স ম্যানেজমেন্ট সফটওয়্যার",R.drawable.gobazaar_icon));
        sliderItems.add(new Product("অনলাইনে পশু ক্রয় বিক্রয়ের সফটওয়্যার",R.drawable.posurhat));
        sliderItems.add(new Product("গাড়ী ম্যানেজমেন্ট সফটওয়্যার এন্ড মোবাইল অ্যাপ্লিকেশন",R.drawable.vehicalelogo));
        sliderItems.add(new Product("ফেনীর মেয়র মোবাইল অ্যাপ্লিকেশন",R.drawable.feni_logo));
        sliderItems.add(new Product("সিরাজগঞ্জের মেয়র মোবাইল অ্যাপ্লিকেশন",R.drawable.sirajgonjlogo));
        //sliderItems.add(new Product("সিরাজগঞ্জের মেয়র মোবাইল অ্যাপ্লিকেশন",""+getString(R.string.sirajgonj_pouro_soft),R.drawable.sirajgonjlogo));

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