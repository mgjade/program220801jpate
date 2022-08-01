package helpers

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL

// Get your api key from https://home.openweathermap.org/api_keys
const val API_KEY = "TOKENHERE"

fun getTempByLocation(location: String): Double {
    try {
        val url = URL("https://api.openweathermap.org/data/2.5/forecast?q=${location}&appid=${API_KEY}")
        val conn: HttpURLConnection = url.openConnection() as HttpURLConnection
        conn.setRequestMethod("GET")
        conn.setRequestProperty("Accept", "application/json")
        if (conn.getResponseCode() !== 200) {
            throw RuntimeException(
                "Failed : HTTP error code : "
                        + conn.getResponseCode()
            )
        }
        val br = BufferedReader(
            InputStreamReader(
                (conn.getInputStream())
            )
        )
        var output: String = ""
        var current: String?
        println("Output from Server .... \n")
        while ((br.readLine().also { current = it }) != null) {
            output += current
        }
        val indexStart = output.indexOf("\"main\":{\"temp\":")
        val tempString = output.substring(indexStart + 15, indexStart + 21)
        val tempKelvin = tempString.toDouble()
        val tempCelsius = tempKelvin - 273.15
        conn.disconnect()
        return tempCelsius
    } catch (e: MalformedURLException) {
        e.printStackTrace()
        throw error("ERROR: DID NOT RECEIVE A VALID RESPONSE FROM THE SERVER. PLEASE ENSURE THAT YOUR API KEY AND LOCATION ARE VALID")
    } catch (e: IOException) {
        e.printStackTrace()
        throw error("ERROR: DID NOT RECEIVE A VALID RESPONSE FROM THE SERVER. PLEASE ENSURE THAT YOUR API KEY AND LOCATION ARE VALID")
    }
}
