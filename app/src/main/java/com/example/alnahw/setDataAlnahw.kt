package com.example.alnahw

import com.example.QuestionData

object setDataAlnahw {

    fun getQuestion(): ArrayList<QuestionData> {

        var que: ArrayList<QuestionData> = arrayListOf()

        var q1 = QuestionData(
            1,
            "الله أذن لكم . عند دخول همزة الاستفهام على الجملة تصبح :\n\n" ,
            "أالله أذن لكم",
            "آلله أذن لكم",
            "االله أذن لكم",
            "األله أذن لكم",
            2

        )

        var q2 = QuestionData(
            2,
            "أنتن (تمشين) للمسجد– أنت (تمشين) للمسجد.ما بين القوسين :\n\n" ,
            "يفعون - يفعل",
            "تفعلن - تفعين",
            "تفعين - يفعون",
            "يفعلن - يفعين",
            2

        )

        var q3 = QuestionData(
            3,
            "(من يهتم بالسلام فقد ينجو من نار الحرب): (الذين يهتمون بالسلام فقد ينجون من نار الحرب)نوع الواو فى الجملتين :\n\n" ,
            "واو الجمع – واو الجماعة – لام الكلمة",
            "واو الجماعة – واو الجماعة – لام الكلمة",
            "واو الجمع – واو الجماعة – لام الكلمة",
            "لام الكلمة – واو الجماعة - واو الجماعة",
            4

        )

        que.add(q1)
        que.add(q2)
        que.add(q3)

        return que
    }
}