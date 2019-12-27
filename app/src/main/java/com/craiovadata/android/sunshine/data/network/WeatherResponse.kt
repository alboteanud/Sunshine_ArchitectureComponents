package com.craiovadata.android.sunshine.data.network

import com.craiovadata.android.sunshine.data.database.WeatherEntry

/**
 * Weather response from the backend. Contains the weather forecasts.
 */
internal class WeatherResponse(val weatherForecast: Array<WeatherEntry>)