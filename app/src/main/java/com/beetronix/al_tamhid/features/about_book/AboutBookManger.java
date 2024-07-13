package com.beetronix.al_tamhid.features.about_book;

import androidx.fragment.app.Fragment;

import com.beetronix.al_tamhid.R;

import java.util.ArrayList;
import java.util.List;

public class AboutBookManger implements AboutBookMangerInterface{

    private AboutBookUiInterface aboutBookUiInterface;

    private Fragment modelStoreOwner;
    private BeAboutBook beAboutBook;
    private ArrayList<Integer> imgList;


    public AboutBookManger(AboutBookUiInterface aboutBookUiInterface, Fragment modelStoreOwner) {
        this.aboutBookUiInterface = aboutBookUiInterface;
        this.modelStoreOwner = modelStoreOwner;
    }

    @Override
    public void getBookData(int book_number) {
        switch (book_number){
            case 1 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_1_2);
                imgList.add(R.drawable.img_book_1_1);
                beAboutBook = new BeAboutBook(1,"التمهيد للقراءة العربية",imgList,"- هو أوَّلُ خُطوة يخطُوها الطِّفلُ لينهلَ من مَعِينِ اللُّغة العربيَّة، فيتعلَّمُ نطق الحُرُوفِ العربيَّةِ بالشَّكلِ الصَّحيح، ثمَّ يقرأ الكلمة التي تركبتْ من هذهِ الحروف، لينتقل بعد ذلكَ لتركيبِ الجُمل المفيدة، فيُمَكِّنُهُ ذلكَ مِنْ إنشاء النَّصِّ المُعَبِّر، فينطلقُ لسانُهُ بقراءة صحيحةٍ فصيحةٍ.\n\n" +
                        "- وقد اختار هذا الكتابُ الكلماتِ الميسَّرَةَ والمبسَّطة الهادفة... والجُملَ" +
                        " التي حَوَتْ معانيَ تربويَّةً نافعة... وقَصَصًا طُفُولِيَّةً رفيعة... كلُّ ذلك مع الحرص على جَذبِ الطِّفْلِ مِنْ خِلال طريقة عرض الكتابِ وحُسنِ تصميمه الفنّي، وغرس حبِّ اللغة العربيَّة في قلبه.\n\n" +
                        "واللهَ نسألُ الإخلاص والقبول، وأن ينفع به كلَّ من علَّمَه وتَعَلَّمَه.\n وصلَّى الله على سيّدِنا محمد وعلى آله وصحبه وسلم تسليمًا كثيرًا .","https://t.me/Atmhed","com.runtimesy.arabicreading2");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 2 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_2_2);
                imgList.add(R.drawable.img_book_2_1);
                beAboutBook = new BeAboutBook(2,"التمهيد لتعلم الكتابة العربية (المستوى الأول)",imgList,"- يهدف إلى ترسيخ العلم وحفظه بخطٍّ ممتعٍ جميلٍ واضحٍ، وتعويد يد الطالب على حسن " +
                        "الخطِّ، وفتحِ آفاق فكره وذوقه واكتشاف المواهب لدى الطلاب وتنميتها. \n\n - ويأتي هذا المستوى من الكتاب يصحب الطالب خلال تعليم مبادئ الكتابة الصحيحة بما يناسب الطفل من عمر الخمس سنوات، فيعلِّمه كتابةَ الحروف والأرقام، وكتابةَ الكلمات بحروفٍ منفصلةٍ، وكل ذلك يتم بالمحاكاة والتقليد والممارسة والتدريب للوصول" +
                        " إلى الخط الجميل.\n\n" +
                        "- في هذا الكتاب يرتسم في مخيِّلة الطفل جمال الحرف المثالي ، وتناسقِ الحروف ، وكيفية ارتكازها على السطر. وقد اخترنا خط الرقعة من بين الخطوط ، لأنه " +
                        "الأسهل والأسرع في الكتابات السوقيَّة والمدرسيَّة.","","");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 3 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_3_2);
                imgList.add(R.drawable.img_book_3_1);
                beAboutBook = new BeAboutBook(3,"التمهيد لتعلم الكتابة العربية (المستوى الثاني)",imgList,
                        "- يهدف إلى ترسيخ العلم وحفظه بخط مُمتعٍ جميلٍ واضحٍ، وترويض يد الطالب على حسن الخط، وفتح آفاق فكره" +
                                " وذوقه واكتشاف المواهب لدى الطلاب وتنميتها.\n\n" +
                                "- ويأتي هذا الجزء من الكتاب ليصحب الطالب خلال تعليمه مبادئ الكتابة الصحيحة بما يناسب الطفل من عمر السبع سنوات، فيعلِّمه كتابة الحروف منفصلةً، وكتابة الحروف في حالاتها الثلاث،\n أوّل الكلمة ووسطها " +
                                "وآخرها، وكتابة الجمل مع التشكيل.\n\n وكل ذلك يتم بالمحاكاة والتقليد والممارسة والتدريب" +
                                "للوصول إلى الخط الجميل .\n\n" +
                                "- في هذا الجزء يرتسم في مخيِّلة الطفل جمالُ الحرف المثالي، وقد اخترنا خطَّ الرقعة من بين الخطوط لأنه" +
                                "الأسهل والأسرع في الكتابات اليومية أو المدرسية .","","");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 4 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_4_1);
                imgList.add(R.drawable.img_book_4_2);
                beAboutBook = new BeAboutBook(4,"تفسير لبعض مفردات القرآن الكريم",imgList,"- تفسيرٌ لبعض مفردات القرآن الكريم من السُّوَر التي يُكْثِر الناسُ" +
                        " من تلاوتها ليكون تفسيرُها عونًا لهم على فهمها وتدبُّر معانيها.\n\n" +
                        "- وقد تحرَّيْنا سهولةَ العبارة ووضوحَها بإيجازٍ مناسبٍ ليسهُلَ حفظُها.\n\n" +
                        "- وهو موجَّهٌ إلى المبتدئين من طلبة العلم، وخاصَّةً في معاهد القرآن الكريم،" +
                        " والمحبِّين الراغبين من عامَّة النَّاس لفهم كتاب الله تعالى.","","");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 5 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_5_2);
                imgList.add(R.drawable.img_book_5_1);
                beAboutBook = new BeAboutBook(5,"مختارات من الأحاديث والأذكار النبوية",imgList,"- قطوفٌ دانيةٌ مِنْ أحاديث الحبيب المصطفى صلى الله عليه وسلم، يَرْتَعُ في رياضِها أبناؤُنَا الطَّلبَةُ وفْقَ تَدَرُّجٍ " +
                        "تربويٍّ يناسب أعمارهم مِنَ السَّابِعَةِ حتى السَّابعة عشرة مِنْ عُمُرِهِم.\n\n" +
                        "- وتحتوي على آدابٍ وأخلاقٍ رفيعةٍ طاهرةٍ، تُقَوِّم السلوكَ، وتغذّي العقولَ، وتجلو القلوبَ، وتُرسِّخُ الإيمانَ ، وتَغْرِسُ الرَّحمةَ والحبَّ والسَّلامَ بينَ النَّاسِ.\n\n" +
                        "- إنَّهَا الحِكَمُ مِنْ وَحْيِ نَبِيِّ الرَّحمةِ عليهِ أفضلُ الصَّلاةِ والسَّلام، مَنْ آتَاهُ اللهُ جوامعَ الكَلِمِ بأفصح لسانٍ صلى الله عليه وسلم.","https://t.me/mokhtarat4","com.yaman.mokhtarat");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 6 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_6_2);
                imgList.add(R.drawable.img_book_6_1);
                beAboutBook = new BeAboutBook(6,"تفسير لمفردات جزء عمّ",imgList,"- يحتوي هذا الكتابُ:\n" +
                        " على صفحاتِ الجزء الثَّلاثين من القرآن الكريم (جزء عمَّ) بالرسم العثمانيِّ، وبهامشه: بيانٌ لمعاني غريب الكلماتِ القرآنيَّةِ بأسلوبٍ سهلٍ مُبسَّطٍ، يفهمُه الطَّالبُ المبتدئُ بشكلٍ يُعينُه على تدبُّرِ آياتِ القرآن الكريم وفهم معانيه. \n" +
                        "وأسميناه: (إرشاد المبتدئين إلى معاني غريب الجزءالثلاثين)."
,"https://t.me/tafseerammagharib","");
            aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 7 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_7_2);
                imgList.add(R.drawable.img_book_7_1);
                beAboutBook = new BeAboutBook(7,"أخبرني عن الإيمان",imgList,"- يُعنى بتقديم أركان الإيمان بأسلوبٍ بسيطٍ ومشوِّقٍ يتوافقُ مع لغة العصر، يفهمُه الصَّغيرُ والكبيرُ.\n\n" +
                        "- يصحِّحُ اعتقادَ الفرد المُسلم، ويُنيرُ قلبَه، مؤيَّدٌ بالآيات القرآنية والأحاديث النبويَّة الشَّريفة\n\n" +
                        "- جاء بأسلوبٍ حِواريٍّ بين الطالب الأديب المتعلم، " +
                        "والمعلم النَّاصح الأمين.","https://t.me/Akhberni_iman","");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 8 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_8_2);
                imgList.add(R.drawable.img_book_8_1);
                beAboutBook = new BeAboutBook(8,"مختصر التمهيد للقراءة العربية",imgList,"- هو أوَّلُ خُطوة يخطُوها الطِّفلُ لينهلَ من مَعِينِ اللُّغة العربيَّة، فيتعلَّمُ نطق الحُرُوفِ العربيَّةِ بالشَّكلِ الصَّحيح، ثمَّ يقرأ الكلمة التي تركبتْ من هذهِ الحروف، لينتقل بعد ذلكَ لتركيبِ الجُمل المفيدة، فيُمَكِّنُهُ ذلكَ مِنْ إنشاء النَّصِّ المُعَبِّر، فينطلقُ لسانُهُ بقراءة صحيحةٍ فصيحةٍ.\n\n" +
                        "- وقد اختار هذا المختصرُ الكلماتِ الميسَّرَةَ والمبسَّطة الهادفة... والجمل" +
                        " التي حَوَتْ معاني تربويةً نافعة ... وقَصَصًا طُفُولِيَّةً رفيعة ... كلُّ ذلك مع الحرص على جَذبِ الطِّفْلِ مِنْ خِلال طريقة عرض الكتابِ وحُسنِ تصميمه الفنّي، وغرس حب اللغة العربيَّة في قلبه.\n\n" +
                        "واللهَ نسألُ الإخلاص والقبول، وأن ينفع به كلَّ من علَّمَه وتَعَلَّمَه.\n وصلَّى الله على سيّدِنا محمد وعلى آله وصحبه وسلم تسليمًا كثيرًا .","https://t.me/Atmhed2","com.runtimesy.arabicreading");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;

            case 9 :
                imgList = new ArrayList<>();
                imgList.add(R.drawable.img_book_9_2);
                imgList.add(R.drawable.img_book_9_1);
                beAboutBook = new BeAboutBook(9,"التمهيد لتلاوة القرآن المجيد",imgList,"- بابٌ يدخلُ منه فلذاتُ أكبادنا إلى عالم القرآن الكريم؛ ليتفيَّؤُوا ظِلالَه الوَارِفَةَ، " +
                        "ويُرتِّلوا آياته العظيمة، ويتلوه حقَّ تلاوته.\n\n" +
                        "- أسلوبُه مُيسَّرٌ ومُبسَّطٌ، حيث حوى في طيَّاته تدريباتٍ عمليَّةً، وأمثلةً عديدةً " +
                        "ليصبحَ الطَّالبُ بعد هذه الدُّرْبَةِ العمليَّةِ مُطَبِّـقًا لأحكام التجويد الأساسية " +
                        "دون تَكَلُّفٍ.","https://t.me/tamheed_Quran","");
                aboutBookUiInterface.showBookData(beAboutBook);
                break;
            default:

        }




    }
}
