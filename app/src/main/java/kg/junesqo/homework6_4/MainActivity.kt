package kg.junesqo.homework6_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import kg.junesqo.homework6_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: FragmentViewModel

    private val fragmentList = listOf(
        FirstFragment(), SecondFragment(), ThirdFragment()
    )

    private val fragmentListTitles = listOf(
        "item 1", "item 2", "item 3"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[FragmentViewModel::class.java]

//        viewModel.counter.observe(this) { counter ->
//
//        }

        val adapter = ViewPagerAdapter(this, fragmentList)
        binding.viewPager2.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager2){
                tab, pos -> tab.text = fragmentListTitles[pos]
        }.attach()
    }
}