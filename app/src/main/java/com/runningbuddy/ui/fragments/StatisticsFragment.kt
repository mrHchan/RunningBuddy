package com.runningbuddy.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.runningbuddy.R
import com.runningbuddy.ui.viewmodels.StatisticsViewModel

class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel : StatisticsViewModel by viewModels()
}