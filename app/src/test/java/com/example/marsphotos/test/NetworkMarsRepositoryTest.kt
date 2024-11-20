package com.example.marsphotos.test

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import com.example.marsphotos.fake.FakeDataSource
import com.example.marsphotos.fake.FakeMarsApiService

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = com.example.marsphotos.fake.FakeMarsApiService()
            )
            assertEquals(com.example.marsphotos.fake.FakeDataSource.photosList, repository.getMarsPhotos())
        }
}