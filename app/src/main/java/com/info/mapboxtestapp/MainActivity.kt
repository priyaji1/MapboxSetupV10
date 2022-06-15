package com.info.mapboxtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.mapboxtestapp.databinding.ActivityMainBinding
import com.mapbox.maps.*


class MainActivity : AppCompatActivity() {
    private var mapboxMap: MapboxMap? = null
    private lateinit var style_mapbox: Style
    private lateinit var ui: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ResourceOptionsManager.getDefault(this, getString(R.string.mapbox_access_token))
            .update {
                tileStoreUsageMode(TileStoreUsageMode.READ_ONLY)
            }
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        mapboxMap = ui.mapView.getMapboxMap()
        //load mapbox style
        ui.mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS) { style ->
            style_mapbox = style
        }


    }


}