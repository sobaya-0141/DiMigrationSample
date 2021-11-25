package com.kako351.android.dimigrationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.kako351.android.dimigrationsample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import org.koin.android.viewmodel.ext.android.viewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//     private val viewModel by viewModel<MainViewModel>() // koin
    private val viewModel: MainViewModel by viewModels() // dagger hilt
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.viewModel = viewModel
    }
}
