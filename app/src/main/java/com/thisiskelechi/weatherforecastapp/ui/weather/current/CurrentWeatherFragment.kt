package com.thisiskelechi.weatherforecastapp.ui.weather.current

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

import com.thisiskelechi.weatherforecastapp.R
import com.thisiskelechi.weatherforecastapp.data.ApixuWeatherApiService
import kotlinx.android.synthetic.main.current_weather_fragment.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CurrentWeatherFragment : Fragment() {

    companion object {
        fun newInstance() =
            CurrentWeatherFragment()
    }

    private lateinit var viewModel: CurrentWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CurrentWeatherViewModel::class.java)
//        viewModel = ViewModelProvider(this).get(CurrentWeatherViewModel::class.java)

        // TODO: Use the ViewModel
        val apiService = ApixuWeatherApiService()

        GlobalScope.launch(Dispatchers.Main) {
            val currentWeatherResponse = apiService.getCurrentWeather("London").await()
            Log.d("someThing", currentWeatherResponse.toString())
//            textView.text = currentWeatherResponse.currentWeatherEntry.toString()
            textView.text = currentWeatherResponse.toString()
        }
    }

}
