package com.lenskart.mvvm_flow_hilt_compose.data.repository

import Artist
import ArtistDetail
import androidx.paging.PagingData
import com.lenskart.mvvm_flow_hilt_compose.data.model.BaseModel
import com.lenskart.mvvm_flow_hilt_compose.data.model.Genres
import com.lenskart.mvvm_flow_hilt_compose.data.model.MovieItem
import com.lenskart.mvvm_flow_hilt_compose.data.model.moviedetail.MovieDetail
import com.lenskart.mvvm_flow_hilt_compose.utils.network.DataState
import kotlinx.coroutines.flow.Flow

interface MovieRepositoryInterface {
    suspend fun movieDetail(movieId: Int): Flow<DataState<MovieDetail>>
    suspend fun recommendedMovie(movieId: Int, page: Int): Flow<DataState<BaseModel>>
    suspend fun search(searchKey: String): Flow<DataState<BaseModel>>
    suspend fun genreList(): Flow<DataState<Genres>>
    suspend fun movieCredit(movieId: Int): Flow<DataState<Artist>>
    suspend fun artistDetail(personId: Int): Flow<DataState<ArtistDetail>>
    fun nowPlayingPagingDataSource(genreId: String?): Flow<PagingData<MovieItem>>
    fun popularPagingDataSource(genreId: String?): Flow<PagingData<MovieItem>>
    fun topRatedPagingDataSource(genreId: String?): Flow<PagingData<MovieItem>>
    fun upcomingPagingDataSource(genreId: String?): Flow<PagingData<MovieItem>>
    fun genrePagingDataSource(genreId: String): Flow<PagingData<MovieItem>>
}