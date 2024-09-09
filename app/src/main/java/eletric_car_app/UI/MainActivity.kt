package eletric_car_app.UI

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.eletric_car_app.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import eletric_car_app.UI.adapter.CarAdapter
import eletric_car_app.UI.adapter.TabAdapter
import eletric_car_app.data.CarFactory

class MainActivity : AppCompatActivity() {
    // declaracao das variaveis

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) { // começa aqui e passa pelas funcoes
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // chamada da funcao
        setupView()
        setupTabs()

    }


    // pegar valor da view
    fun setupView() {
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.vp_view_pager)
    }



    fun setupTabs() {
        val tabsAdapter = TabAdapter(this)
        viewPager.adapter = tabsAdapter
        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    viewPager.currentItem = it.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })
    }
}

