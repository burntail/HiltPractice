package com.example.hiltpractice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.hiltpractice.data.DaeJeonSchoolsResponseData
import com.example.hiltpractice.retrofit.DaeJeonShoolsAPI
import com.example.hiltpractice.ui.theme.HiltPracticeTheme
import com.example.hiltpractice.viewmodel.MainActivityViewModel
import com.google.gson.GsonBuilder
import com.squareup.moshi.Moshi
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainActivityViewModel: MainActivityViewModel by lazy {
        ViewModelProvider.create(this)[MainActivityViewModel::class.java]
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HiltPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()

        mainActivityViewModel.getDaeJeonSchoolInfos()

//        val gson = GsonBuilder()
//            .setLenient()
//            .create()
//        val logging = HttpLoggingInterceptor()
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
//
//        val moshi = Moshi.Builder().build()
//        val client = OkHttpClient.Builder()
//            .addInterceptor(logging)
//            .build()
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://apis.data.go.kr/6300000/openapi2022/midHighSchInfo/") // 서버의 기본 URL
//            .addConverterFactory(MoshiConverterFactory.create(moshi))
//            .client(client)
//            .build()
//        val data = retrofit.create(DaeJeonShoolsAPI::class.java).getShools(
//            "",
//            "A",
//            "1",
//            "10"
//        )
//
//        data.enqueue(object: Callback<DaeJeonSchoolsResponseData> {
//            override fun onResponse(
//                call: Call<DaeJeonSchoolsResponseData>,
//                response: Response<DaeJeonSchoolsResponseData>
//            ) {
//                Log.d(" beom","Success!")
//                Log.d("beom","${response}")
//                Log.d("beom","${response.body()?.response?.body}")
//            }
//
//            override fun onFailure(call: Call<DaeJeonSchoolsResponseData>, t: Throwable) {
//                Log.d("beom","Fail!")
//                Log.d("beom","${t.message.toString()}")
//            }
//
//        })
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HiltPracticeTheme {
        Greeting("Android")
    }
}