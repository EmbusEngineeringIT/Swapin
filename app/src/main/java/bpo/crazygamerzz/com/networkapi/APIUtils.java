package bpo.crazygamerzz.com.networkapi;

/**
 * Created by Cheemala on 12/9/2017.
 */

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://192.168.0.115:8080/AirtelBpoService/rest/airtelbposervices/";

    public static APIServices getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIServices.class);
    }

}
