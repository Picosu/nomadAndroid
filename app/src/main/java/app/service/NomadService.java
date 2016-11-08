package app.service;

import java.util.List;

import app.model.Event;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NomadService {
    String SERVICE_ENDPOINT = "https://dl.dropboxusercontent.com/";

    @GET("u/2864731/adam_events.json")
    Call<List<Event>> getEvent();
}
