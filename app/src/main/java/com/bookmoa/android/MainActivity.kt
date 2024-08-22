package com.bookmoa.android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bookmoa.android.databinding.ActivityMainBinding
import com.bookmoa.android.home.HomeFragment
import com.bookmoa.android.memo.BookMemoFragment
import com.bookmoa.android.mypage.MypageFragment
import com.bookmoa.android.study.RecommendFragment
import com.bookmoa.android.study.StudyFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // installSplashScreen()

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBottomNavigation()

    }

    fun switchFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_frm, fragment)
        fragmentTransaction.addToBackStack(null) // 뒤로 가기 버튼으로 이전 Fragment로 돌아가기 가능
        fragmentTransaction.commit()
    }

    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager
        if (fragmentManager.backStackEntryCount > 0) {
            fragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
    fun showBookDetail(Isbn13: String) {
        val detailFragment = RecommendFragment().apply {
            arguments = Bundle().apply {
                putString("isbn13", Isbn13)
            }
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, detailFragment)
            .addToBackStack(null)
            .commit()
    }
    private fun initBottomNavigation() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()

        binding.mainBnv.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.memoFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, BookMemoFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.studyFragment -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, StudyFragment())
                            .commitAllowingStateLoss()
                        return@setOnItemSelectedListener true
                }

                R.id.setupFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, MypageFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}