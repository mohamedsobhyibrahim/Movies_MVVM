package com.mohamedsobhy.movies_mvvm.view.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mohamedsobhy.movies_mvvm.model.MovieModel;


public class MovieViewModel extends ViewModel {

    public MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName(){
        String movieName = getMovieFromDatabase().getName();
        movieNameMutableLiveData.setValue(movieName);
    }

    private MovieModel getMovieFromDatabase(){
        return new MovieModel("cast away" , "1-1-1997" , "very sad movie" , 1);
    }
}
