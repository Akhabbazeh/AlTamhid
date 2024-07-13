package com.beetronix.al_tamhid.features.ContentsFragment;

import android.os.Bundle;

import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.pages.pagesFragment;
import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;


import java.util.ArrayList;
import java.util.List;


public class ContentsFragment extends BaseFragment {
    private ImageView ButtonBack;
    private ImageView img_background_content;
    private EditText edite_number_page_content;
    private AdapterContent adapterContent;
    private RecyclerView recycle_container;
    private FragmentManager fragmentManager;
    public ContentsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_6 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_contents, container, false);
        setNotificationBarColor(R.color.primary_color);
        ButtonBack = view_6.findViewById(R.id.ButtonBack);
        img_background_content = view_6.findViewById(R.id.img_background_content);
        recycle_container =  view_6.findViewById(R.id.RecyclerView_container);
        edite_number_page_content =  view_6.findViewById(R.id.edite_number_page_content);




        initComponent();
        initRecyclerContent();
        return view_6;






    }

    public void initComponent(){
        InputFilter lengthFilter = new InputFilter.LengthFilter(2);
        edite_number_page_content.setFilters(new InputFilter[]{lengthFilter});
        edite_number_page_content.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    if (Integer.parseInt(v.getText().toString())<=54 && !(Integer.parseInt(v.getText().toString())<4)) {
                        sendPageNumber(Integer.parseInt(v.getText().toString())-4);
                        Tool.hideSoftKeyboard(getActivity());
                    }else if (Integer.parseInt(v.getText().toString())<4 || Integer.parseInt(v.getText().toString())>54){
                        Toast.makeText(getContext(),
                                "أدخل عددًا من 4 إلى 54", Toast.LENGTH_LONG).show();
                    }
                    return true;
                }
                return false;
            }
        });
    //    Tool.displayImageDrawable(getContext(),img_background_content,R.drawable.background_page);
        Tool.displayImageDrawable(getContext(),ButtonBack,R.drawable.ic_arrow_right);

         fragmentManager = getActivity().getSupportFragmentManager();


        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    private void initRecyclerContent()
    {
        List<ContentMain> contentMains = new ArrayList<>();

        List<ContentInfo> childList0 = new ArrayList<>();
        childList0.add(new ContentInfo("مقدمة الشَّيخ محمَّد نادر خيَّاطة",4));
        childList0.add(new ContentInfo("مقدمة الشَّيخ الدكتور محمود زعتري",5));
        childList0.add(new ContentInfo("مقدمة الشيخ عمَّار مصطفى بازرباشي",6));
        childList0.add(new ContentInfo("مقدمة تعريفية بالكتاب",7));
        contentMains.add(new ContentMain("مقدمات الكتاب ", childList0));


        List<ContentInfo> childList1 = new ArrayList<>();
        childList1.add(new ContentInfo("المخارج الخمسة الرَّئيسة وتمارين حروف الجوف",11));
        childList1.add(new ContentInfo("تمارين حروف الحَلْق",12));
        childList1.add(new ContentInfo("تمارين حروف اللِّسان",13));
        childList1.add(new ContentInfo("تمارين حروف الشَّفتَين والخَيْشوم",14));
        contentMains.add(new ContentMain("الدرس الأول: الحروفُ حَسْبَ ترتيبِ مخارجها ", childList1));

        List<ContentInfo> childList2 = new ArrayList<>();
        childList2.add(new ContentInfo("تمارين الحروف اللِّثَوِيَّة",15));
        contentMains.add(new ContentMain("الدرس الثاني: الحروفُ اللِّثَوِيَّةُ ", childList2));

        List<ContentInfo> childList3 = new ArrayList<>();
        childList3.add(new ContentInfo("تمارين حروف الهمس (1)",16));
        childList3.add(new ContentInfo("تمارين حروف الهمس (2)",17));
        contentMains.add(new ContentMain("الدرس الثالث: الهَمْس ", childList3));

        List<ContentInfo> childList4 = new ArrayList<>();
        childList4.add(new ContentInfo("التَّاءُ المبسوطةُ والتَّاءُ المَربوطة وتمارينهما",18));
        contentMains.add(new ContentMain("الدرس الرابع: التَّاءُ المبسوطةُ والتَّاءُ المَربوطةُ ", childList4));

        List<ContentInfo> childList5 = new ArrayList<>();
        childList5.add(new ContentInfo("تمارين القلقلة (1)",19));
        childList5.add(new ContentInfo("تمارين القلقلة (2)",20));
        contentMains.add(new ContentMain("الدرس الخامس: القَلْقَلةُ ", childList5));

        List<ContentInfo> childList6 = new ArrayList<>();
        childList6.add(new ContentInfo("تمارين التفخيم (1)",21));
        childList6.add(new ContentInfo("تمارين التفخيم (2)",22));
        childList6.add(new ContentInfo("الحروف التي تَقبلُ التَّفخيمَ أو التَّرقيقَ",23));
        childList6.add(new ContentInfo("أحكام وتمارين لام اسم الجلالة (الله)",24));
        childList6.add(new ContentInfo("أحكام وتمارين الراء",25));
        childList6.add(new ContentInfo("اختبار المرحلة الأولى",26));
        contentMains.add(new ContentMain("الدرس السادس: التَّفخيمُ والتَّرقيقُ ", childList6));


        List<ContentInfo> childList7 = new ArrayList<>();
        childList7.add(new ContentInfo("همزةُ الوصلِ في الأسماء",29));
        childList7.add(new ContentInfo("همزةُ الوصلِ في الأفعال",30));
        contentMains.add(new ContentMain("الدرس السابع: همزةُ الوَصْل ", childList7));

        List<ContentInfo> childList8 = new ArrayList<>();
        childList8.add(new ContentInfo("اللام القمرية وتمارينها (1)",31));
        childList8.add(new ContentInfo("اللام القمرية وتمارينها (2)",32));
        childList8.add(new ContentInfo("اللام الشَّمسية وتمارينها (1)",33));
        childList8.add(new ContentInfo("اللام الشَّمسية وتمارينها (2)",34));
        contentMains.add(new ContentMain("الدرس الثامن: لام (الـ) التَّعريف ", childList8));

        List<ContentInfo> childList9 = new ArrayList<>();
        childList9.add(new ContentInfo("حروف المد مع أمثلة",35));
        childList9.add(new ContentInfo("تمارين حروف المدّ",36));
        childList9.add(new ContentInfo("حروف المد الصغيرة في الرسم القرآني",37));
        childList9.add(new ContentInfo("حالاتُ المدِّ الأصليِّ",38));
        childList9.add(new ContentInfo("المدُّ الفرعيُّ (1)",39));
        childList9.add(new ContentInfo("المدُّ الفرعيُّ (2)",40));
        contentMains.add(new ContentMain("الدرس التاسع: المدود ", childList9));

        List<ContentInfo> childList10 = new ArrayList<>();
        childList10.add(new ContentInfo("الغُنَّةُ وتمارينُها",41));
        childList10.add(new ContentInfo("تمارين الغُنَّة (1)",42));
        childList10.add(new ContentInfo("تمارين الغُنَّة (2)",43));
        contentMains.add(new ContentMain("الدرس العاشر: الغُنَّة ", childList10));

        List<ContentInfo> childList11 = new ArrayList<>();
        childList11.add(new ContentInfo("التَّنوينُ وتمارينُه",44));
        childList11.add(new ContentInfo("تمارين التَّنوين (1)",45));
        childList11.add(new ContentInfo("تمارين التَّنوين (2)",46));
        contentMains.add(new ContentMain("الدرس الحادي عشر: التَّنوينُ ", childList11));

        List<ContentInfo> childList12 = new ArrayList<>();
        childList12.add(new ContentInfo("علاماتُ الوَقْف",47));
        childList12.add(new ContentInfo("علاماتُ الوَقفِ وعلامةُ السَّجدة",48));
        childList12.add(new ContentInfo("علاماتٌ متفرِّقةٌ",49));
        contentMains.add(new ContentMain("الدرس الثاني عشر: علاماتُ ضبطِ المُصحَفِ الشَّريف ", childList12));

        List<ContentInfo> childList13 = new ArrayList<>();
        childList13.add(new ContentInfo("أمثلةٌ توضِّح الفروقات بين الرَّسْم العثماني والرَّسْم الإملائي",50));
        contentMains.add(new ContentMain("الدرس الثالث عشر: أمثلةٌ على الفرقِ بين الرَّسْمَين العُثمانيِّ والإملائيّ ", childList13));

        List<ContentInfo> childList14 = new ArrayList<>();
        childList14.add(new ContentInfo("تمارين عامَّة من جزء عمَّ",51));
        contentMains.add(new ContentMain("الدرس الرابع عشر: أمثلةٌ تطبيقيَّةٌ من جزء عمَّ ", childList14));

        List<ContentInfo> childList15 = new ArrayList<>();
        childList15.add(new ContentInfo("اختبار (1)",52));
        childList15.add(new ContentInfo("اختبار (2)",53));
        contentMains.add(new ContentMain("اختبارُ كاملِ الكتاب ", childList15));





        adapterContent = new AdapterContent(contentMains,fragmentManager,getContext(),recycle_container);
        recycle_container.setAdapter(adapterContent);
        recycle_container.setLayoutManager(new LinearLayoutManager(getContext()));
        recycle_container.setHasFixedSize(false);


        adapterContent.setOnItemClickListener(new AdapterContent.OnItemClickListener() {
            @Override
            public void OnItemClickListener(boolean state) {
                if (state){
                    recycle_container.smoothScrollToPosition(adapterContent.getItemCount() - 1);
                }
            }
        });
    }

    private void sendPageNumber(int position){

        pagesFragment pagesFragment = new pagesFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("Position", position);
        pagesFragment.setArguments(bundle);
        fragmentManager.beginTransaction()
                .replace(R.id.FrameLayout_main_activity, pagesFragment, "pagesFragment")
                .addToBackStack("pagesFragment")
                .commit();
        edite_number_page_content.setText("");
        edite_number_page_content.setHint(4 +"");


    }

}
