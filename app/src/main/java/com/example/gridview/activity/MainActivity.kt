package com.example.gridview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.gridview.R
import com.example.gridview.adapter.LangListAdapter
import com.example.gridview.model.Language

class MainActivity : AppCompatActivity() {

    var list_lang_Grid : GridView? = null
    var languageList: ArrayList<Language> = ArrayList<Language>()
    var adapter : LangListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_lang_Grid = findViewById(R.id.gv_test)
        addLangData()
        adapter = LangListAdapter(languageList, this)
        list_lang_Grid?.adapter = adapter
    }
    private fun addLangData(){
        languageList.add(Language("Android",R.drawable.img_android))
        languageList.add(Language("C#",R.drawable.img_csharf))
        languageList.add(Language("C++",R.drawable.img_cplus))
        languageList.add(Language("Html5",R.drawable.img_html5))
        languageList.add(Language("Java",R.drawable.img_java))
        languageList.add(Language("Kotlin",R.drawable.img_kotlin))
        languageList.add(Language("Python",R.drawable.img_python))
        languageList.add(Language("Visual Studio",R.drawable.img_visualstudio))
    }
}