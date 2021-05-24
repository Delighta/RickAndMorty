package com.bukky.rick_morty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var retrofit: Retrofit
    private lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofit = Retrofit.Builder()
            .baseUrl(ApiService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
                .build()

        apiService = ApiService.getInstance(retrofit)
    }
    private fun makeApiCall(){
        lifecycleScope.launch {
            apiService.getCharacters().body()?.let {
                it.results?.let { results ->
                    if (results.isEmpty()){

                        }

                    }

                }
            }
        }
    }
}