package com.dino.cutecat.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dino.cutecat.remote.ApiService
import com.dino.cutecat.remote.model.CatImageResponse
import com.dino.library.ui.DinoViewModel
import kotlinx.coroutines.launch

class MainViewModel(private val apiService: ApiService) : DinoViewModel() {

    private val _catImageItems = MutableLiveData<MutableList<CatImageResponse>>(mutableListOf())
    val catImageItems: LiveData<MutableList<CatImageResponse>> get() = _catImageItems

    init {
        loadCatImage()
    }

    fun loadCatImage() {
        viewModelScope.launch {
            showLoading()
            _catImageItems.value = _catImageItems.value?.apply {
                addAll(apiService.getImages())
            }
            hideLoading()
        }
    }

}